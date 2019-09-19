package com.vmware.psolabs.vmce.web.controllers;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vmware.psolabs.vmce.web.dto.AuthDto;
import com.vmware.psolabs.vmce.web.dto.OrgDto;
import com.vmware.psolabs.vmce.web.dto.UserDto;

@RestController
@RequestMapping("orgs")
public class OrgsController {

    private static final Logger LOG = Logger.getLogger(OrgsController.class);

    private static final String AUTH_URL_TEMPLATE = "https://console.cloud.vmware.com/csp/gateway/am/api/auth/api-tokens/authorize?refresh_token={0}";
    private static final String ORG_LIST_URL_TEMPLATE = "https://vmc.vmware.com/vmc/api/orgs";

    @PostMapping(path = "/doit", consumes = "application/json", produces = "application/json")
    public Collection<OrgDto> doIt(@RequestBody final UserDto user) {
        Collection<OrgDto> orgDtos = new ArrayList<OrgDto>();
        try {
            // first authorize TODO[fcarta] use intercept to auto apply auth
            // when needed not everytime
            final String authUri = MessageFormat.format(AUTH_URL_TEMPLATE, user.getRefreshToken());
            LOG.info("AuthURI: " + authUri);

            RestTemplate restTemplate = new RestTemplate();
            final UserDto authUser = restTemplate.postForObject(authUri, new AuthDto(), UserDto.class);
            LOG.info("AuthUser: " + authUser);

            //
            final String getOrgListUri = MessageFormat.format(ORG_LIST_URL_TEMPLATE, user.getRefreshToken());
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization", "Bearer " + authUser.getAccessToken());
            HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
            ResponseEntity<List<OrgDto>> responseEntity = restTemplate.exchange(getOrgListUri, HttpMethod.GET,
                    requestEntity, new ParameterizedTypeReference<List<OrgDto>>() {
                    });
            orgDtos = responseEntity.getBody();
            LOG.info("ORGS: "+ orgDtos);
        } catch (Exception ex) {
            LOG.error(ex);
        }
        return orgDtos;
    }
}

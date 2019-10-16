package com.vmware.psolabs.vmce.web.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vmware.psolabs.vmce.web.dto.OrgDto;
import com.vmware.psolabs.vmce.web.dto.RequestDto;

@RestController
@RequestMapping("orgs")
public class OrgsController extends AbstractVmcApiController {

    private static final Logger LOG = Logger.getLogger(OrgsController.class);

    private static final String ORG_LIST_URL_TEMPLATE = "https://vmc.vmware.com/vmc/api/orgs";

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public Collection<OrgDto> list(@RequestBody final RequestDto requestDto) {
        Collection<OrgDto> orgDtos = new ArrayList<OrgDto>();
        try {
            final RestTemplate restTemplate = new RestTemplate();
            final HttpEntity<String> requestEntity = new HttpEntity<String>(getAuthorizedHeaders(requestDto));
            final ResponseEntity<List<OrgDto>> responseEntity = restTemplate.exchange(ORG_LIST_URL_TEMPLATE, HttpMethod.GET,
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

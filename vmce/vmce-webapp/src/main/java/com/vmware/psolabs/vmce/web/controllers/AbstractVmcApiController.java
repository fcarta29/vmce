package com.vmware.psolabs.vmce.web.controllers;

import java.text.MessageFormat;

import org.jboss.logging.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.vmware.psolabs.vmce.web.dto.AuthDto;
import com.vmware.psolabs.vmce.web.dto.RequestDto;
import com.vmware.psolabs.vmce.web.dto.UserDto;

public abstract class AbstractVmcApiController {
    
    private static final Logger LOG = Logger.getLogger(AbstractVmcApiController.class);
    private static final String AUTH_URL_TEMPLATE = "https://console.cloud.vmware.com/csp/gateway/am/api/auth/api-tokens/authorize?refresh_token={0}";

    protected HttpHeaders getAuthorizedHeaders(final RequestDto requestDto) {
        // first authorize TODO[fcarta] use intercept to auto apply auth
        // when needed not everytime
        final String authUri = MessageFormat.format(AUTH_URL_TEMPLATE, requestDto.getRefreshToken());
        LOG.info("AuthURI: " + authUri);

        final RestTemplate restTemplate = new RestTemplate();
        final UserDto authUser = restTemplate.postForObject(authUri, new AuthDto(), UserDto.class);
        LOG.info("AuthUser: " + authUser);

        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + authUser.getAccessToken());
        
        return headers; 
    }
}

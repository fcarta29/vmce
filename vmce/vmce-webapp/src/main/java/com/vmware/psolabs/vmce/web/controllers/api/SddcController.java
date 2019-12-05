package com.vmware.psolabs.vmce.web.controllers.api;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vmware.psolabs.vmce.web.dto.RequestDto;
import com.vmware.psolabs.vmce.web.dto.SddcDto;

@RestController
@RequestMapping("/api/orgs/{orgId}/sddcs")
public class SddcController extends AbstractVmcApiController {
    private static final Logger LOG = Logger.getLogger(SddcController.class);

    private static final String SDDC_LIST_URL_TEMPLATE = "https://vmc.vmware.com/vmc/api/orgs/{0}/sddcs";
    private static final String SDDC_GET_URL_TEMPLATE = "https://vmc.vmware.com/vmc/api/orgs/{0}/sddcs/{1}";

    @PostMapping(path = "", consumes = "application/json", produces = "application/json")
    public Collection<SddcDto> list(@RequestBody final RequestDto requestDto, @PathVariable(value = "orgId") String orgId) {
        Collection<SddcDto> sddcDtos = new ArrayList<SddcDto>();
        try {
            final String sddcListUri = MessageFormat.format(SDDC_LIST_URL_TEMPLATE, orgId);

            final RestTemplate restTemplate = new RestTemplate();
            final HttpEntity<String> requestEntity = new HttpEntity<String>(getAuthorizedHeaders(requestDto));
            final ResponseEntity<List<SddcDto>> responseEntity = restTemplate.exchange(sddcListUri, HttpMethod.GET,
                    requestEntity, new ParameterizedTypeReference<List<SddcDto>>() {
                    });
            sddcDtos = responseEntity.getBody();
            LOG.info("SDDCs: "+ sddcDtos);
        } catch (Exception ex) {
            LOG.error(ex);
        }
        return sddcDtos;
    }
    
    @PostMapping(path = "/{sddcId}", consumes = "application/json", produces = "application/json")
    public SddcDto get(@RequestBody final RequestDto requestDto, @PathVariable(value="orgId") String orgId, @PathVariable(value="sddcId") String sddcId) {
        SddcDto sddcDto = new SddcDto();
        try {
            final String sddcGetUri = MessageFormat.format(SDDC_GET_URL_TEMPLATE, orgId, sddcId);

            final RestTemplate restTemplate = new RestTemplate();
            final HttpEntity<String> requestEntity = new HttpEntity<String>(getAuthorizedHeaders(requestDto));
            final ResponseEntity<SddcDto> responseEntity = restTemplate.exchange(sddcGetUri, HttpMethod.GET,
                    requestEntity, new ParameterizedTypeReference<SddcDto>() {});
            sddcDto = responseEntity.getBody();
            LOG.info("SDDC: "+ sddcDto);
        } catch (Exception ex) {
            LOG.error(ex);
        }
        return sddcDto;
    }
    
}

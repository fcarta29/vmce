package com.vmware.psolabs.vmce.web.dto;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class OrgPropertyDto implements Serializable {

    private static final long serialVersionUID = 3026009350525534193L;

    @JsonAlias("values")
    @JsonSerialize(as = OrgPropertyValueDto.class)
    private OrgPropertyValueDto values;

    @JsonSerialize(as = OrgPropertyValueDto.class)
    public OrgPropertyValueDto getValues() {
        return values;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

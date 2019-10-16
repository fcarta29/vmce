package com.vmware.psolabs.vmce.web.dto;

import java.io.Serializable;
import java.util.UUID;

import org.apache.commons.lang.builder.ToStringBuilder;


public class RequestDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -1114503233583534628L;
    
    private String refreshToken;
    private UUID orgId;
    private UUID sddcId;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public UUID getOrgId() {
        return orgId;
    }

    public void setOrgId(UUID orgId) {
        this.orgId = orgId;
    }
    
    public UUID getSddcId() {
        return sddcId;
    }

    public void setSddcId(UUID sddcId) {
        this.sddcId = sddcId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((refreshToken == null) ? 0 : refreshToken.hashCode());
        result = prime * result + ((orgId == null) ? 0 : orgId.hashCode());
        result = prime * result + ((sddcId == null) ? 0 : sddcId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RequestDto other = (RequestDto) obj;
        if (orgId == null) {
            if (other.orgId != null)
                return false;
        } else if (!orgId.equals(other.orgId))
            return false;
        if (sddcId == null) {
            if (other.sddcId != null)
                return false;
        } else if (!sddcId.equals(other.sddcId))
            return false;        
        if (refreshToken == null) {
            if (other.refreshToken != null)
                return false;
        } else if (!refreshToken.equals(other.refreshToken))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

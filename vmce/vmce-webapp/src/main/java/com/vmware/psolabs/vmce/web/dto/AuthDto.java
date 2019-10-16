package com.vmware.psolabs.vmce.web.dto;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class AuthDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 8377255096050186086L;
    
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
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
        AuthDto other = (AuthDto) obj;
        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

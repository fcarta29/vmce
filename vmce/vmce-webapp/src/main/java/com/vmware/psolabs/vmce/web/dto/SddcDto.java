package com.vmware.psolabs.vmce.web.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;

import org.apache.commons.lang.builder.ToStringBuilder;

public class SddcDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -404211213801220010L;

    private UUID id;
    private String name;
    @JsonAlias("org_id")
    private UUID orgId;
    @JsonAlias("user_id")
    private UUID userId;
    @JsonAlias("user_name")
    private String userName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'")
    private Date created;
    private String version;
    @JsonAlias("updated_by_user_id")
    private UUID updatedByUserId;
    @JsonAlias("updated_by_user_name")
    private String updatedByUserName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'")
    private Date updated;
    private String provider;
    @JsonAlias("resource_config")
    private SddcResourceConfigDto resourceConfig;
    @JsonAlias("sddc_state")
    private String sddcState;
    @JsonAlias("sddc_access_state")
    private String sddcAccessState;
    @JsonAlias("account_link_state")
    private String accountLinkState;
    @JsonAlias("sddc_type")
    private String sddcType;
    @JsonAlias("one_node_reduced_capacity")
    private Boolean oneNodeReducedCapacity;
    @JsonAlias("expiration_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'")
    private Date expirationDate;
    @JsonAlias("sddc_template_id")
    private UUID sddcTemplateId;
    @JsonAlias("nsxt_csp_mode")
    private Boolean nsxtCspMode;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getOrgId() {
        return orgId;
    }

    public void setOrgId(UUID orgId) {
        this.orgId = orgId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UUID getUpdatedByUserId() {
        return updatedByUserId;
    }

    public void setUpdatedByUserId(UUID updatedByUserId) {
        this.updatedByUserId = updatedByUserId;
    }

    public String getUpdatedByUserName() {
        return updatedByUserName;
    }

    public void setUpdatedByUserName(String updatedByUserName) {
        this.updatedByUserName = updatedByUserName;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public SddcResourceConfigDto getResourceConfig() {
        return resourceConfig;
    }

    public void setResourceConfig(SddcResourceConfigDto resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    public String getSddcState() {
        return sddcState;
    }

    public void setSddcState(String sddcState) {
        this.sddcState = sddcState;
    }

    public String getSddcAccessState() {
        return sddcAccessState;
    }

    public void setSddcAccessState(String sddcAccessState) {
        this.sddcAccessState = sddcAccessState;
    }

    public String getAccountLinkState() {
        return accountLinkState;
    }

    public void setAccountLinkState(String accountLinkState) {
        this.accountLinkState = accountLinkState;
    }

    public String getSddcType() {
        return sddcType;
    }

    public void setSddcType(String sddcType) {
        this.sddcType = sddcType;
    }

    public Boolean getOneNodeReducedCapacity() {
        return oneNodeReducedCapacity;
    }

    public void setOneNodeReducedCapacity(Boolean oneNodeReducedCapacity) {
        this.oneNodeReducedCapacity = oneNodeReducedCapacity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public UUID getSddcTemplateId() {
        return sddcTemplateId;
    }

    public void setSddcTemplateId(UUID sddcTemplateId) {
        this.sddcTemplateId = sddcTemplateId;
    }

    public Boolean getNsxtCspMode() {
        return nsxtCspMode;
    }

    public void setNsxtCspMode(Boolean nsxtCspMode) {
        this.nsxtCspMode = nsxtCspMode;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        SddcDto other = (SddcDto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

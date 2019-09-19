package com.vmware.psolabs.vmce.web.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class OrgDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3899361213360668694L;

    private UUID id;
    private String name;
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
    @JsonAlias("display_name")
    private String displayName;
    @JsonAlias("project_state")
    private String projectState;
    @JsonAlias("properties")
    @JsonSerialize(as = OrgPropertyDto.class)
    private OrgPropertyDto properties;
    @JsonAlias("org_type")
    private String orgType;

    
    /**
     * { "user_id": "6129652a-f62b-3ead-9b4f-5918910cd80d", "user_name":
     * "calvarado@vmware.com", "created": "2018-12-07T23:00:11.000195Z",
     * "version": 3, "id": "aa8c8a7e-6e32-4c10-ac3d-f725890c1753",
     * "updated_by_user_id": "0e31dc38-feb2-363b-b2ef-a313e2938ab7",
     * "updated_by_user_name": "bdickson@vmware.com", "updated":
     * "2019-09-12T16:31:28.000000Z", "name": "jfpmiamm", "display_name":
     * "CMP-PS-AMER", "project_state": "CREATED", "properties": { "values": {
     * "enabledM5AvailabilityZones":
     * "{\"ap-south-1\": [\"bom52\", \"bom53\", \"bom54\"], \"us-east-1\": [\"iad12\", \"iad6\", \"iad7\"], \"ap-northeast-1\": [\"nrt8\", \"nrt12\", \"nrt55\"], \"ap-southeast-2\": [\"syd52\", \"syd5\", \"syd6\"], \"eu-west-1\": [\"dub8\", \"dub4\", \"dub2\"], \"ap-southeast-1\": [\"sin2\", \"sin3\", \"sin4\"], \"ca-central-1\": [\"yul50\", \"yul51\"], \"ap-northeast-2\": [\"icn52\", \"icn53\", \"icn54\"], \"us-west-2\": [\"pdx1\", \"pdx2\", \"pdx4\"], \"us-east-2\": [\"cmh50\", \"cmh51\", \"cmh52\"], \"us-west-1\": [\"sfo8\", \"sfo9\"], \"eu-central-1\": [\"fra54\", \"fra53\", \"fra52\"], \"sa-east-1\": [\"gru1\", \"gru4\"], \"eu-west-2\": [\"lhr53\", \"lhr54\", \"lhr55\"], \"eu-west-3\": [\"cdg53\", \"cdg54\", \"cdg55\"]}"
     * , "defaultAwsRegions":
     * "US_EAST_1,US_WEST_2,EU_WEST_2,EU_CENTRAL_1,AP_SOUTHEAST_2,AP_NORTHEAST_1,EU_WEST_1,US_WEST_1,AP_SOUTHEAST_1,CA_CENTRAL_1,EU_WEST_3,AP_SOUTH_1,SA_EAST_1,AP_NORTHEAST_2",
     * "enabledAvailabilityZones":
     * "{\"us-east-1\": [\"iad6\", \"iad7\", \"iad12\"], \"ap-northeast-1\": [\"nrt8\"], \"ap-southeast-2\": [\"syd52\", \"syd5\", \"syd6\"], \"us-west-2\": [\"pdx1\", \"pdx2\", \"pdx4\"], \"us-east-2\": [\"cmh50\", \"cmh51\", \"cmh52\"], \"us-west-1\": [], \"eu-central-1\": [\"fra52\", \"fra53\", \"fra54\"], \"eu-west-1\": [], \"eu-west-2\": [\"lhr53\", \"lhr54\", \"lhr55\"]}"
     * , "enabledI3AvailabilityZones":
     * "{\"ap-south-1\": [\"bom52\", \"bom54\"], \"us-east-1\": [\"iad6\", \"iad12\", \"iad7\"], \"ap-northeast-1\": [\"nrt12\", \"nrt8\"], \"ap-southeast-2\": [\"syd52\", \"syd5\", \"syd6\"], \"eu-west-1\": [\"dub8\", \"dub4\", \"dub2\"], \"ap-southeast-1\": [\"sin2\", \"sin3\", \"sin4\"], \"eu-west-2\": [\"lhr54\", \"lhr55\"], \"ca-central-1\": [\"yul50\", \"yul51\"], \"ap-northeast-2\": [\"icn52\", \"icn54\"], \"us-west-2\": [\"pdx1\", \"pdx2\", \"pdx4\"], \"us-west-1\": [\"sfo9\", \"sfo6\"], \"eu-central-1\": [\"fra52\", \"fra53\", \"fra54\"], \"sa-east-1\": [\"gru1\", \"gru4\"], \"us-east-2\": [\"cmh50\", \"cmh51\"], \"eu-west-3\": [\"cdg53\", \"cdg54\", \"cdg55\"]}"
     * , "enableUploadLogsS3": "true", "enabledM5MetalAvailabilityZones":
     * "{\"us-west-2\": [\"pdx1\", \"pdx2\", \"pdx4\"], \"us-east-1\": [\"iad6\", \"iad7\", \"iad12\"]}"
     * , "enabledR5AvailabilityZones":
     * "{\"us-west-2\":[\"pdx1\",\"pdx2\",\"pdx4\"],\"us-east-1\":[\"iad6\",\"iad7\",\"iad12\"],\"eu-central-1\":[\"fra52\",\"fra53\",\"fra54\"],\"us-east-2\":[\"cmh50\",\"cmh51\",\"cmh52\"]}",
     * "enableZeroCloudCloudProvider": "false", "sddcTypes": "1NODE,DEFAULT",
     * "minHostsPerSddc": "3", "maxClustersPerSDDCMultiAz": "10",
     * "accountLinkingOptional": "false", "enableAWSCloudProvider": "true",
     * "maxHostsPerSddc": "16", "defaultHostsPerSddc": "3",
     * "maxClustersPerSDDC": "10", "enabledI3ENMetalAvailabilityZones":
     * "{\"us-west-2\": [\"pdx1\", \"pdx2\", \"pdx4\"],\"us-east-1\": [\"iad6\",\"iad7\",\"iad12\"]}"
     * , "enableGssChat": "true", "minHostsPerSddcMultiAz": "6",
     * "certificateValidDays": "365", "sddcLimit": "2",
     * "maxHostsPerSddcMultiAz": "28", "hostLimit": "32",
     * "maxHostsPerSddcOnCreate": "4", "maxHostsPerSddcOnCreateMultiAz": "28" }
     * }, "org_type": "CUSTOMER" }
     * 
     * @return
     */

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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getProjectState() {
        return projectState;
    }

    public void setProjectState(String projectState) {
        this.projectState = projectState;
    }

    @JsonSerialize(as = OrgPropertyDto.class)
    public OrgPropertyDto getProperties() {
        return properties;
    }
    
    public void setProperties(OrgPropertyDto properties) {
        this.properties = properties;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
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
        OrgDto other = (OrgDto) obj;
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

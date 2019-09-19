package com.vmware.psolabs.vmce.web.dto;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class OrgPropertyValueDto implements Serializable {

    private static final long serialVersionUID = 3008016421080042888L;

    private String enabledM5AvailabilityZones;
    private String defaultAwsRegions;
    private String enabledAvailabilityZones;
    private String enabledI3AvailabilityZones;
    private String enableUploadLogsS3;
    private String enabledM5MetalAvailabilityZones;
    private String enabledR5AvailabilityZones;
    private String enableZeroCloudCloudProvider;
    private String sddcTypes;
    private String minHostsPerSddc;
    private String maxClustersPerSDDCMultiAz;
    private String accountLinkingOptional;
    private String enableAWSCloudProvider;
    private String maxHostsPerSddc;
    private String defaultHostsPerSddc;
    private String maxClustersPerSDDC;
    private String enabledI3ENMetalAvailabilityZones;
    private String enableGssChat;
    private String minHostsPerSddcMultiAz;
    private String certificateValidDays;
    private String sddcLimit;
    private String maxHostsPerSddcMultiAz;
    private String hostLimit;
    private String maxHostsPerSddcOnCreate;
    private String maxHostsPerSddcOnCreateMultiAz;

    public String getEnabledM5AvailabilityZones() {
        return enabledM5AvailabilityZones;
    }

    public void setEnabledM5AvailabilityZones(String enabledM5AvailabilityZones) {
        this.enabledM5AvailabilityZones = enabledM5AvailabilityZones;
    }

    public String getDefaultAwsRegions() {
        return defaultAwsRegions;
    }

    public void setDefaultAwsRegions(String defaultAwsRegions) {
        this.defaultAwsRegions = defaultAwsRegions;
    }

    public String getEnabledAvailabilityZones() {
        return enabledAvailabilityZones;
    }

    public void setEnabledAvailabilityZones(String enabledAvailabilityZones) {
        this.enabledAvailabilityZones = enabledAvailabilityZones;
    }

    public String getEnabledI3AvailabilityZones() {
        return enabledI3AvailabilityZones;
    }

    public void setEnabledI3AvailabilityZones(String enabledI3AvailabilityZones) {
        this.enabledI3AvailabilityZones = enabledI3AvailabilityZones;
    }

    public String getEnableUploadLogsS3() {
        return enableUploadLogsS3;
    }

    public void setEnableUploadLogsS3(String enableUploadLogsS3) {
        this.enableUploadLogsS3 = enableUploadLogsS3;
    }

    public String getEnabledM5MetalAvailabilityZones() {
        return enabledM5MetalAvailabilityZones;
    }

    public void setEnabledM5MetalAvailabilityZones(String enabledM5MetalAvailabilityZones) {
        this.enabledM5MetalAvailabilityZones = enabledM5MetalAvailabilityZones;
    }

    public String getEnabledR5AvailabilityZones() {
        return enabledR5AvailabilityZones;
    }

    public void setEnabledR5AvailabilityZones(String enabledR5AvailabilityZones) {
        this.enabledR5AvailabilityZones = enabledR5AvailabilityZones;
    }

    public String getEnableZeroCloudCloudProvider() {
        return enableZeroCloudCloudProvider;
    }

    public void setEnableZeroCloudCloudProvider(String enableZeroCloudCloudProvider) {
        this.enableZeroCloudCloudProvider = enableZeroCloudCloudProvider;
    }

    public String getSddcTypes() {
        return sddcTypes;
    }

    public void setSddcTypes(String sddcTypes) {
        this.sddcTypes = sddcTypes;
    }

    public String getMinHostsPerSddc() {
        return minHostsPerSddc;
    }

    public void setMinHostsPerSddc(String minHostsPerSddc) {
        this.minHostsPerSddc = minHostsPerSddc;
    }

    public String getMaxClustersPerSDDCMultiAz() {
        return maxClustersPerSDDCMultiAz;
    }

    public void setMaxClustersPerSDDCMultiAz(String maxClustersPerSDDCMultiAz) {
        this.maxClustersPerSDDCMultiAz = maxClustersPerSDDCMultiAz;
    }

    public String getAccountLinkingOptional() {
        return accountLinkingOptional;
    }

    public void setAccountLinkingOptional(String accountLinkingOptional) {
        this.accountLinkingOptional = accountLinkingOptional;
    }

    public String getEnableAWSCloudProvider() {
        return enableAWSCloudProvider;
    }

    public void setEnableAWSCloudProvider(String enableAWSCloudProvider) {
        this.enableAWSCloudProvider = enableAWSCloudProvider;
    }

    public String getMaxHostsPerSddc() {
        return maxHostsPerSddc;
    }

    public void setMaxHostsPerSddc(String maxHostsPerSddc) {
        this.maxHostsPerSddc = maxHostsPerSddc;
    }

    public String getDefaultHostsPerSddc() {
        return defaultHostsPerSddc;
    }

    public void setDefaultHostsPerSddc(String defaultHostsPerSddc) {
        this.defaultHostsPerSddc = defaultHostsPerSddc;
    }

    public String getMaxClustersPerSDDC() {
        return maxClustersPerSDDC;
    }

    public void setMaxClustersPerSDDC(String maxClustersPerSDDC) {
        this.maxClustersPerSDDC = maxClustersPerSDDC;
    }

    public String getEnabledI3ENMetalAvailabilityZones() {
        return enabledI3ENMetalAvailabilityZones;
    }

    public void setEnabledI3ENMetalAvailabilityZones(String enabledI3ENMetalAvailabilityZones) {
        this.enabledI3ENMetalAvailabilityZones = enabledI3ENMetalAvailabilityZones;
    }

    public String getEnableGssChat() {
        return enableGssChat;
    }

    public void setEnableGssChat(String enableGssChat) {
        this.enableGssChat = enableGssChat;
    }

    public String getMinHostsPerSddcMultiAz() {
        return minHostsPerSddcMultiAz;
    }

    public void setMinHostsPerSddcMultiAz(String minHostsPerSddcMultiAz) {
        this.minHostsPerSddcMultiAz = minHostsPerSddcMultiAz;
    }

    public String getCertificateValidDays() {
        return certificateValidDays;
    }

    public void setCertificateValidDays(String certificateValidDays) {
        this.certificateValidDays = certificateValidDays;
    }

    public String getSddcLimit() {
        return sddcLimit;
    }

    public void setSddcLimit(String sddcLimit) {
        this.sddcLimit = sddcLimit;
    }

    public String getMaxHostsPerSddcMultiAz() {
        return maxHostsPerSddcMultiAz;
    }

    public void setMaxHostsPerSddcMultiAz(String maxHostsPerSddcMultiAz) {
        this.maxHostsPerSddcMultiAz = maxHostsPerSddcMultiAz;
    }

    public String getHostLimit() {
        return hostLimit;
    }

    public void setHostLimit(String hostLimit) {
        this.hostLimit = hostLimit;
    }

    public String getMaxHostsPerSddcOnCreate() {
        return maxHostsPerSddcOnCreate;
    }

    public void setMaxHostsPerSddcOnCreate(String maxHostsPerSddcOnCreate) {
        this.maxHostsPerSddcOnCreate = maxHostsPerSddcOnCreate;
    }

    public String getMaxHostsPerSddcOnCreateMultiAz() {
        return maxHostsPerSddcOnCreateMultiAz;
    }

    public void setMaxHostsPerSddcOnCreateMultiAz(String maxHostsPerSddcOnCreateMultiAz) {
        this.maxHostsPerSddcOnCreateMultiAz = maxHostsPerSddcOnCreateMultiAz;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);

    }
}

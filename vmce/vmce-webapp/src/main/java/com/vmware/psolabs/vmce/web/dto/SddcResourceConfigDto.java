package com.vmware.psolabs.vmce.web.dto;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonAlias;

import org.apache.commons.lang.builder.ToStringBuilder;

public class SddcResourceConfigDto implements Serializable {

    // TODO[fcarta] need to find all fields with nested objects

    /**
     *
     */
    private static final long serialVersionUID = 843252641386367090L;

    @JsonAlias("sddc_id")
    private UUID sddcId;
    @JsonAlias("region")
    private String region;
    /*
     * 
     * "public_ip_pool":[ ], "agents":[ ], "sddc_manifest":{ },
     * "pop_agent_xeni_connection":null, "esx_hosts":[ ], "custom_properties":{ },
     * "vpc_info":{ },
     */
    @JsonAlias("vc_ip")
    private String vcIp;
    @JsonAlias("vc_url")
    private String vcUrl;
    @JsonAlias("vc_instance_id")
    private String vcInstanceId;
    @JsonAlias("psc_ip")
    private String pscIp;
    @JsonAlias("psc_url")
    private String pscUrl;
    @JsonAlias("nsx_mgr_ip")
    private String nsxMgrIp;
    @JsonAlias("nsx_mgr_url")
    private String nsxMgrUrl;
    @JsonAlias("vc_management_ip")
    private String vcManagementIp;
    @JsonAlias("nfs_mode")
    private Boolean nfsMode;
    @JsonAlias("vc_public_ip")
    private String vcPublicIp;
    @JsonAlias("vc_containerized_permissions_enabled")
    private Boolean vcContainerizedPermissionsEnabled;
    @JsonAlias("psc_management_ip")
    private String pscManagementIp;
    @JsonAlias("nsx_mgr_management_ip")
    private String nsxMgrManagementIp;
    // @JsonAlias("nsx_controller_ips")
    // private String nsxControllerIps; = null - could be list
    @JsonAlias("vxlan_subnet")
    private String vxlanSubnet;
    @JsonAlias("skip_creating_vxlan")
    private Boolean skipCreatingVxlan;
    /*
     * "cgws":[ ], "mgw_id":null, "sddc_networks":[ ],
     */
    @JsonAlias("provider")
    private String provider;
    @JsonAlias("esx_cluster_id")
    private String esxClusterId;
    @JsonAlias("sso_domain")
    private String ssoDomain;
    @JsonAlias("admin_username")
    private String adminUsername;
    @JsonAlias("admin_password")
    private String adminPassword;
    /*
     * "temp_vc_admin_password":null,
     */
    @JsonAlias("cloud_username")
    private String cloudUsername;
    @JsonAlias("cloud_password")
    private String cloudPassword;
    @JsonAlias("cloud_user_group")
    private String cloudUserGroup;
    @JsonAlias("nsx_manager_username")
    private String nsxManagerUsername;
    @JsonAlias("nsx_manager_password")
    private String nsxManagerPassword;
    @JsonAlias("nsx_manager_audit_username")
    private String nsxManagerAuditUsername;
    @JsonAlias("nsx_manager_audit_password")
    private String nsxManagerAuditPassword;
    @JsonAlias("root_nsx_controller_password")
    private String rootNsxControllerPassword;
    @JsonAlias("root_nsx_edge_password")
    private String rootNsxEdgePassword;
    @JsonAlias("nsx_proxy_username")
    private String nsxProxyUsername;
    @JsonAlias("nsx_proxy_password")
    private String nsxProxyPassword;
    /*
     * "sddc_manager_credentials":{ },
     */
    @JsonAlias("management_rp")
    private String managementRp;
    @JsonAlias("management_ds")
    private String managementDs;
    // @JsonAlias("vc_ssh_credential")
    // private String vcSshCredential; :{ }
    @JsonAlias("sub_domain")
    private String subDomain;
    @JsonAlias("nsx_reverse_proxy_url")
    private String nsxReverseProxyUrl;
    @JsonAlias("nsx_api_public_endpoint_url")
    private String nsxApiPublicEndpointUrl;
    /*
     * "certificates":{ }, "management_vms":{ },
     */
    @JsonAlias("dns_with_management_vm_private_ip")
    private Boolean dnsWithManagementVmPrivateIp;
    @JsonAlias("fleet_management_queue_user")
    private String fleetManagementQueueUser;
    @JsonAlias("fleet_management_queue_password")
    private String fleetManagementQueuePassword;
    @JsonAlias("fleet_management_username")
    private String fleetManagementUsername;
    @JsonAlias("fleet_management_password")
    private String fleetManagementPassword;
    @JsonAlias("backup_restore_vc_username")
    private String backupRestoreVcUsername;
    @JsonAlias("backup_restore_vc_password")
    private String backupRestoreVcPassword;
    /*
     * "clusters":[ ],
     */
    @JsonAlias("deployment_type")
    private String deploymentType;
    /*
     * "availability_zones":[ ],
     */
    // @JsonAlias("witness_availability_zone")
    // private String witnessAvailabilityZone; = null?
    @JsonAlias("esx_host_subnet")
    private String esxHostSubnet;
    @JsonAlias("mgmt_appliance_network_name")
    private String mgmtApplianceNetworkName;
    /*
     * "mgmt_appliance_connectivity_logical_switch_id":null, "nsxt_addons":null,
     * "vc_oauth_client":null, "vuln_scanner_admin_user":null,
     * "vuln_scanner_password":null, "sddc_size":{ }, "vpc_claim_type":null,
     * "vpc_info_peered_agent":null, "kms_vpc_endpoint":{ },
     * "vsan_encryption_config":{ },
     */
    @JsonAlias("max_num_public_ip")
    private String maxNumPublicIp;
    // @JsonAlias("mgw_public_ip_pool")
    // private String mgwPublicIpPool; "mgw_public_ip_pool":[],
    /*
     * "internal_public_ip_pool":[ ], "internal_public_ips":{ },
     */
    @JsonAlias("use_ip_as_esx_hostname")
    private Boolean useIpAsEsxHostname;
    /*
     * "no_nat":null, "intermediate_ip_pool":null, "esx_instance_profile":{ },
     */
    @JsonAlias("agent_hostname")
    private String agentzhostname;
    @JsonAlias("edge_vmci_auth_token")
    private String edgeVmciAuthToken;
    @JsonAlias("dvs_uuid")
    private UUID dvsUuid;
    /*
     * "mgw_intermediate_ip":null,
     */
    @JsonAlias("placement_group_name")
    private String placementGroupName;
    @JsonAlias("backup_restore_bucket")
    private String backupRestoreBucket;
    @JsonAlias("nsxt_csp_mode_on")
    private Boolean nsxtCspModeOn;
    /*
     * "nsx_user_client":{ }, "nsx_service_client":{ },
     */
    @JsonAlias("vswitch_name")
    private String vswitchName;
    @JsonAlias("nsxt")
    private Boolean nsxt;
    /*
     * "non_master_agents":[ ],
     */
    @JsonAlias("pop_xeni_connected")
    private Boolean popXeniConnected;
    @JsonAlias("vc_secondary_hostname_enabled")
    private Boolean vcSecondaryHostnameEnabled;
    @JsonAlias("mgmt_appliance_connectivity_enabled")
    private Boolean mgmtApplianceConnectivityEnabled;
    /*
     * "agent":{ },
     */
    @JsonAlias("sddc_desired_state")
    private Boolean sddcDesiredState;

    public UUID getSddcId() {
        return sddcId;
    }

    public void setSddcId(UUID sddcId) {
        this.sddcId = sddcId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getVcIp() {
        return vcIp;
    }

    public void setVcIp(String vcIp) {
        this.vcIp = vcIp;
    }

    public String getVcUrl() {
        return vcUrl;
    }

    public void setVcUrl(String vcUrl) {
        this.vcUrl = vcUrl;
    }

    public String getVcInstanceId() {
        return vcInstanceId;
    }

    public void setVcInstanceId(String vcInstanceId) {
        this.vcInstanceId = vcInstanceId;
    }

    public String getPscIp() {
        return pscIp;
    }

    public void setPscIp(String pscIp) {
        this.pscIp = pscIp;
    }

    public String getPscUrl() {
        return pscUrl;
    }

    public void setPscUrl(String pscUrl) {
        this.pscUrl = pscUrl;
    }

    public String getNsxMgrIp() {
        return nsxMgrIp;
    }

    public void setNsxMgrIp(String nsxMgrIp) {
        this.nsxMgrIp = nsxMgrIp;
    }

    public String getNsxMgrUrl() {
        return nsxMgrUrl;
    }

    public void setNsxMgrUrl(String nsxMgrUrl) {
        this.nsxMgrUrl = nsxMgrUrl;
    }

    public String getVcManagementIp() {
        return vcManagementIp;
    }

    public void setVcManagementIp(String vcManagementIp) {
        this.vcManagementIp = vcManagementIp;
    }

    public Boolean getNfsMode() {
        return nfsMode;
    }

    public void setNfsMode(Boolean nfsMode) {
        this.nfsMode = nfsMode;
    }

    public String getVcPublicIp() {
        return vcPublicIp;
    }

    public void setVcPublicIp(String vcPublicIp) {
        this.vcPublicIp = vcPublicIp;
    }

    public Boolean getVcContainerizedPermissionsEnabled() {
        return vcContainerizedPermissionsEnabled;
    }

    public void setVcContainerizedPermissionsEnabled(Boolean vcContainerizedPermissionsEnabled) {
        this.vcContainerizedPermissionsEnabled = vcContainerizedPermissionsEnabled;
    }

    public String getPscManagementIp() {
        return pscManagementIp;
    }

    public void setPscManagementIp(String pscManagementIp) {
        this.pscManagementIp = pscManagementIp;
    }

    public String getNsxMgrManagementIp() {
        return nsxMgrManagementIp;
    }

    public void setNsxMgrManagementIp(String nsxMgrManagementIp) {
        this.nsxMgrManagementIp = nsxMgrManagementIp;
    }

    public String getVxlanSubnet() {
        return vxlanSubnet;
    }

    public void setVxlanSubnet(String vxlanSubnet) {
        this.vxlanSubnet = vxlanSubnet;
    }

    public Boolean getSkipCreatingVxlan() {
        return skipCreatingVxlan;
    }

    public void setSkipCreatingVxlan(Boolean skipCreatingVxlan) {
        this.skipCreatingVxlan = skipCreatingVxlan;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getEsxClusterId() {
        return esxClusterId;
    }

    public void setEsxClusterId(String esxClusterId) {
        this.esxClusterId = esxClusterId;
    }

    public String getSsoDomain() {
        return ssoDomain;
    }

    public void setSsoDomain(String ssoDomain) {
        this.ssoDomain = ssoDomain;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getCloudUsername() {
        return cloudUsername;
    }

    public void setCloudUsername(String cloudUsername) {
        this.cloudUsername = cloudUsername;
    }

    public String getCloudPassword() {
        return cloudPassword;
    }

    public void setCloudPassword(String cloudPassword) {
        this.cloudPassword = cloudPassword;
    }

    public String getCloudUserGroup() {
        return cloudUserGroup;
    }

    public void setCloudUserGroup(String cloudUserGroup) {
        this.cloudUserGroup = cloudUserGroup;
    }

    public String getNsxManagerUsername() {
        return nsxManagerUsername;
    }

    public void setNsxManagerUsername(String nsxManagerUsername) {
        this.nsxManagerUsername = nsxManagerUsername;
    }

    public String getNsxManagerPassword() {
        return nsxManagerPassword;
    }

    public void setNsxManagerPassword(String nsxManagerPassword) {
        this.nsxManagerPassword = nsxManagerPassword;
    }

    public String getNsxManagerAuditUsername() {
        return nsxManagerAuditUsername;
    }

    public void setNsxManagerAuditUsername(String nsxManagerAuditUsername) {
        this.nsxManagerAuditUsername = nsxManagerAuditUsername;
    }

    public String getNsxManagerAuditPassword() {
        return nsxManagerAuditPassword;
    }

    public void setNsxManagerAuditPassword(String nsxManagerAuditPassword) {
        this.nsxManagerAuditPassword = nsxManagerAuditPassword;
    }

    public String getRootNsxControllerPassword() {
        return rootNsxControllerPassword;
    }

    public void setRootNsxControllerPassword(String rootNsxControllerPassword) {
        this.rootNsxControllerPassword = rootNsxControllerPassword;
    }

    public String getRootNsxEdgePassword() {
        return rootNsxEdgePassword;
    }

    public void setRootNsxEdgePassword(String rootNsxEdgePassword) {
        this.rootNsxEdgePassword = rootNsxEdgePassword;
    }

    public String getNsxProxyUsername() {
        return nsxProxyUsername;
    }

    public void setNsxProxyUsername(String nsxProxyUsername) {
        this.nsxProxyUsername = nsxProxyUsername;
    }

    public String getNsxProxyPassword() {
        return nsxProxyPassword;
    }

    public void setNsxProxyPassword(String nsxProxyPassword) {
        this.nsxProxyPassword = nsxProxyPassword;
    }

    public String getManagementRp() {
        return managementRp;
    }

    public void setManagementRp(String managementRp) {
        this.managementRp = managementRp;
    }

    public String getManagementDs() {
        return managementDs;
    }

    public void setManagementDs(String managementDs) {
        this.managementDs = managementDs;
    }

    public String getSubDomain() {
        return subDomain;
    }

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    public String getNsxReverseProxyUrl() {
        return nsxReverseProxyUrl;
    }

    public void setNsxReverseProxyUrl(String nsxReverseProxyUrl) {
        this.nsxReverseProxyUrl = nsxReverseProxyUrl;
    }

    public String getNsxApiPublicEndpointUrl() {
        return nsxApiPublicEndpointUrl;
    }

    public void setNsxApiPublicEndpointUrl(String nsxApiPublicEndpointUrl) {
        this.nsxApiPublicEndpointUrl = nsxApiPublicEndpointUrl;
    }

    public Boolean getDnsWithManagementVmPrivateIp() {
        return dnsWithManagementVmPrivateIp;
    }

    public void setDnsWithManagementVmPrivateIp(Boolean dnsWithManagementVmPrivateIp) {
        this.dnsWithManagementVmPrivateIp = dnsWithManagementVmPrivateIp;
    }

    public String getFleetManagementQueueUser() {
        return fleetManagementQueueUser;
    }

    public void setFleetManagementQueueUser(String fleetManagementQueueUser) {
        this.fleetManagementQueueUser = fleetManagementQueueUser;
    }

    public String getFleetManagementQueuePassword() {
        return fleetManagementQueuePassword;
    }

    public void setFleetManagementQueuePassword(String fleetManagementQueuePassword) {
        this.fleetManagementQueuePassword = fleetManagementQueuePassword;
    }

    public String getFleetManagementUsername() {
        return fleetManagementUsername;
    }

    public void setFleetManagementUsername(String fleetManagementUsername) {
        this.fleetManagementUsername = fleetManagementUsername;
    }

    public String getFleetManagementPassword() {
        return fleetManagementPassword;
    }

    public void setFleetManagementPassword(String fleetManagementPassword) {
        this.fleetManagementPassword = fleetManagementPassword;
    }

    public String getBackupRestoreVcUsername() {
        return backupRestoreVcUsername;
    }

    public void setBackupRestoreVcUsername(String backupRestoreVcUsername) {
        this.backupRestoreVcUsername = backupRestoreVcUsername;
    }

    public String getBackupRestoreVcPassword() {
        return backupRestoreVcPassword;
    }

    public void setBackupRestoreVcPassword(String backupRestoreVcPassword) {
        this.backupRestoreVcPassword = backupRestoreVcPassword;
    }

    public String getDeploymentType() {
        return deploymentType;
    }

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    public String getEsxHostSubnet() {
        return esxHostSubnet;
    }

    public void setEsxHostSubnet(String esxHostSubnet) {
        this.esxHostSubnet = esxHostSubnet;
    }

    public String getMgmtApplianceNetworkName() {
        return mgmtApplianceNetworkName;
    }

    public void setMgmtApplianceNetworkName(String mgmtApplianceNetworkName) {
        this.mgmtApplianceNetworkName = mgmtApplianceNetworkName;
    }

    public String getMaxNumPublicIp() {
        return maxNumPublicIp;
    }

    public void setMaxNumPublicIp(String maxNumPublicIp) {
        this.maxNumPublicIp = maxNumPublicIp;
    }

    public Boolean getUseIpAsEsxHostname() {
        return useIpAsEsxHostname;
    }

    public void setUseIpAsEsxHostname(Boolean useIpAsEsxHostname) {
        this.useIpAsEsxHostname = useIpAsEsxHostname;
    }

    public String getAgentzhostname() {
        return agentzhostname;
    }

    public void setAgentzhostname(String agentzhostname) {
        this.agentzhostname = agentzhostname;
    }

    public String getEdgeVmciAuthToken() {
        return edgeVmciAuthToken;
    }

    public void setEdgeVmciAuthToken(String edgeVmciAuthToken) {
        this.edgeVmciAuthToken = edgeVmciAuthToken;
    }

    public UUID getDvsUuid() {
        return dvsUuid;
    }

    public void setDvsUuid(UUID dvsUuid) {
        this.dvsUuid = dvsUuid;
    }

    public String getPlacementGroupName() {
        return placementGroupName;
    }

    public void setPlacementGroupName(String placementGroupName) {
        this.placementGroupName = placementGroupName;
    }

    public String getBackupRestoreBucket() {
        return backupRestoreBucket;
    }

    public void setBackupRestoreBucket(String backupRestoreBucket) {
        this.backupRestoreBucket = backupRestoreBucket;
    }

    public Boolean getNsxtCspModeOn() {
        return nsxtCspModeOn;
    }

    public void setNsxtCspModeOn(Boolean nsxtCspModeOn) {
        this.nsxtCspModeOn = nsxtCspModeOn;
    }

    public String getVswitchName() {
        return vswitchName;
    }

    public void setVswitchName(String vswitchName) {
        this.vswitchName = vswitchName;
    }

    public Boolean getNsxt() {
        return nsxt;
    }

    public void setNsxt(Boolean nsxt) {
        this.nsxt = nsxt;
    }

    public Boolean getPopXeniConnected() {
        return popXeniConnected;
    }

    public void setPopXeniConnected(Boolean popXeniConnected) {
        this.popXeniConnected = popXeniConnected;
    }

    public Boolean getVcSecondaryHostnameEnabled() {
        return vcSecondaryHostnameEnabled;
    }

    public void setVcSecondaryHostnameEnabled(Boolean vcSecondaryHostnameEnabled) {
        this.vcSecondaryHostnameEnabled = vcSecondaryHostnameEnabled;
    }

    public Boolean getMgmtApplianceConnectivityEnabled() {
        return mgmtApplianceConnectivityEnabled;
    }

    public void setMgmtApplianceConnectivityEnabled(Boolean mgmtApplianceConnectivityEnabled) {
        this.mgmtApplianceConnectivityEnabled = mgmtApplianceConnectivityEnabled;
    }

    public Boolean getSddcDesiredState() {
        return sddcDesiredState;
    }

    public void setSddcDesiredState(Boolean sddcDesiredState) {
        this.sddcDesiredState = sddcDesiredState;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        SddcResourceConfigDto other = (SddcResourceConfigDto) obj;
        if (sddcId == null) {
            if (other.sddcId != null)
                return false;
        } else if (!sddcId.equals(other.sddcId))
            return false;
        return true;
    }    

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

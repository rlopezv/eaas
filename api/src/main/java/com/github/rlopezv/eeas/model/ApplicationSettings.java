package com.github.rlopezv.eeas.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicationSettings   {
    @JsonProperty("appLabelKey")
    private String appLabelKey;
  
//     @JsonProperty("configManagementPlugins")
//     @Valid
//     private List<ConfigManagementPlugin> configManagementPlugins = null;
  
//     @JsonProperty("help")
//     private ProviderHelp help;
  
//     @JsonProperty("accessConfig")
//     private ProviderAccessConfig accessConfig;
  
//     @JsonProperty("passwordPattern")
//     private String passwordPattern;
  
//     @JsonProperty("plugins")
//     @Valid
//     private List<ProviderPlugin> plugins = null;
  
//     @JsonProperty("resourceOverrides")
//     @Valid
//     private Map<String, ResourceOverride> resourceOverrides = null;
  
//     @JsonProperty("statusBadgeEnabled")
//     private Boolean statusBadgeEnabled;
  
//     @JsonProperty("uiBannerContent")
//     private String uiBannerContent;
  
//     @JsonProperty("uiBannerURL")
//     private String uiBannerURL;
  
//     @JsonProperty("uiCssURL")
//     private String uiCssURL;
  
//     @JsonProperty("url")
//     private String url;
  
//     @JsonProperty("userLoginsDisabled")
//     private Boolean userLoginsDisabled;
  
//     public ProviderSettings appLabelKey(String appLabelKey) {
//       this.appLabelKey = appLabelKey;
//       return this;
//     }
  
//     /**
//      * Get appLabelKey
//      * @return appLabelKey
//     */
//    @Schema(defaultValue =  "")
//    public String getAppLabelKey() {
//       return appLabelKey;
//     }
  
//     public void setAppLabelKey(String appLabelKey) {
//       this.appLabelKey = appLabelKey;
//     }
  
//     public ProviderSettings configManagementPlugins(List<ConfigManagementPlugin> configManagementPlugins) {
//       this.configManagementPlugins = configManagementPlugins;
//       return this;
//     }
  
//     public ProviderSettings addConfigManagementPluginsItem(ConfigManagementPlugin configManagementPluginsItem) {
//       if (this.configManagementPlugins == null) {
//         this.configManagementPlugins = new ArrayList<>();
//       }
//       this.configManagementPlugins.add(configManagementPluginsItem);
//       return this;
//     }
  
//     /**
//      * Get configManagementPlugins
//      * @return configManagementPlugins
//     */
//    @Schema(defaultValue = "")
//     @Valid
  
//     public List<ConfigManagementPlugin> getConfigManagementPlugins() {
//       return configManagementPlugins;
//     }
  
//     public void setConfigManagementPlugins(List<ConfigManagementPlugin> configManagementPlugins) {
//       this.configManagementPlugins = configManagementPlugins;
//     }
  
//     public ProviderSettings help(ProviderHelp help) {
//       this.help = help;
//       return this;
//     }
  
//     /**
//      * Get help
//      * @return help
//     */
//    @Schema(defaultValue = "")
//     @Valid
  
//     public ProviderHelp getHelp() {
//       return help;
//     }
  
//     public void setHelp(ProviderHelp help) {
//       this.help = help;
//     }
  
//     public ProviderSettings accessConfig(ProviderAccessConfig accessConfig) {
//       this.accessConfig = accessConfig;
//       return this;
//     }
  
//     /**
//      * Get accessConfig
//      * @return accessConfig
//     */
//    @Schema(defaultValue = "")
//     @Valid
  
//     public ProviderAccessConfig getAccessConfig() {
//       return accessConfig;
//     }
  
//     public void setAccessConfig(ProviderAccessConfig accessConfig) {
//       this.accessConfig = accessConfig;
//     }
  
//     public ProviderSettings passwordPattern(String passwordPattern) {
//       this.passwordPattern = passwordPattern;
//       return this;
//     }
  
//     /**
//      * Get passwordPattern
//      * @return passwordPattern
//     */
//    @Schema(defaultValue =  "")
//    public String getPasswordPattern() {
//       return passwordPattern;
//     }
  
//     public void setPasswordPattern(String passwordPattern) {
//       this.passwordPattern = passwordPattern;
//     }
  
//     public ProviderSettings plugins(List<ProviderPlugin> plugins) {
//       this.plugins = plugins;
//       return this;
//     }
  
//     public ProviderSettings addPluginsItem(ProviderPlugin pluginsItem) {
//       if (this.plugins == null) {
//         this.plugins = new ArrayList<>();
//       }
//       this.plugins.add(pluginsItem);
//       return this;
//     }
  
//     /**
//      * Get plugins
//      * @return plugins
//     */
//    @Schema(defaultValue = "")
//     @Valid
  
//     public List<ProviderPlugin> getPlugins() {
//       return plugins;
//     }
  
//     public void setPlugins(List<ProviderPlugin> plugins) {
//       this.plugins = plugins;
//     }
  
//     public ProviderSettings resourceOverrides(Map<String, ResourceOverride> resourceOverrides) {
//       this.resourceOverrides = resourceOverrides;
//       return this;
//     }
  
//     public ProviderSettings putResourceOverridesItem(String key, ResourceOverride resourceOverridesItem) {
//       if (this.resourceOverrides == null) {
//         this.resourceOverrides = new HashMap<>();
//       }
//       this.resourceOverrides.put(key, resourceOverridesItem);
//       return this;
//     }
  
//     /**
//      * Get resourceOverrides
//      * @return resourceOverrides
//     */
//    @Schema(defaultValue = "")
//     @Valid
  
//     public Map<String, ResourceOverride> getResourceOverrides() {
//       return resourceOverrides;
//     }
  
//     public void setResourceOverrides(Map<String, ResourceOverride> resourceOverrides) {
//       this.resourceOverrides = resourceOverrides;
//     }
  
//     public ProviderSettings statusBadgeEnabled(Boolean statusBadgeEnabled) {
//       this.statusBadgeEnabled = statusBadgeEnabled;
//       return this;
//     }
  
//     /**
//      * Get statusBadgeEnabled
//      * @return statusBadgeEnabled
//     */
//    @Schema(defaultValue =  "")
//    public Boolean getStatusBadgeEnabled() {
//       return statusBadgeEnabled;
//     }
  
//     public void setStatusBadgeEnabled(Boolean statusBadgeEnabled) {
//       this.statusBadgeEnabled = statusBadgeEnabled;
//     }
  
//     public ProviderSettings uiBannerContent(String uiBannerContent) {
//       this.uiBannerContent = uiBannerContent;
//       return this;
//     }
  
//     /**
//      * Get uiBannerContent
//      * @return uiBannerContent
//     */
//    @Schema(defaultValue =  "")
//    public String getUiBannerContent() {
//       return uiBannerContent;
//     }
  
//     public void setUiBannerContent(String uiBannerContent) {
//       this.uiBannerContent = uiBannerContent;
//     }
  
//     public ProviderSettings uiBannerURL(String uiBannerURL) {
//       this.uiBannerURL = uiBannerURL;
//       return this;
//     }
  
//     /**
//      * Get uiBannerURL
//      * @return uiBannerURL
//     */
//    @Schema(defaultValue =  "")
//    public String getUiBannerURL() {
//       return uiBannerURL;
//     }
  
//     public void setUiBannerURL(String uiBannerURL) {
//       this.uiBannerURL = uiBannerURL;
//     }
  
//     public ProviderSettings uiCssURL(String uiCssURL) {
//       this.uiCssURL = uiCssURL;
//       return this;
//     }
  
//     /**
//      * Get uiCssURL
//      * @return uiCssURL
//     */
//    @Schema(defaultValue =  "")
//    public String getUiCssURL() {
//       return uiCssURL;
//     }
  
//     public void setUiCssURL(String uiCssURL) {
//       this.uiCssURL = uiCssURL;
//     }
  
//     public ProviderSettings url(String url) {
//       this.url = url;
//       return this;
//     }
  
//     /**
//      * Get url
//      * @return url
//     */
//    @Schema(defaultValue =  "")
//    public String getUrl() {
//       return url;
//     }
  
//     public void setUrl(String url) {
//       this.url = url;
//     }
  
//     public ProviderSettings userLoginsDisabled(Boolean userLoginsDisabled) {
//       this.userLoginsDisabled = userLoginsDisabled;
//       return this;
//     }
  
//     /**
//      * Get userLoginsDisabled
//      * @return userLoginsDisabled
//     */
//    @Schema(defaultValue =  "")
//    public Boolean getUserLoginsDisabled() {
//       return userLoginsDisabled;
//     }
  
//     public void setUserLoginsDisabled(Boolean userLoginsDisabled) {
//       this.userLoginsDisabled = userLoginsDisabled;
//     }
  
  
//     @Override
//     public boolean equals(Object o) {
//       if (this == o) {
//         return true;
//       }
//       if (o == null || getClass() != o.getClass()) {
//         return false;
//       }
//       ProviderSettings providerSettings = (ProviderSettings) o;
//       return Objects.equals(this.appLabelKey, providerSettings.appLabelKey) &&
//           Objects.equals(this.configManagementPlugins, providerSettings.configManagementPlugins) &&
//           Objects.equals(this.help, providerSettings.help) &&
//           Objects.equals(this.accessConfig, providerSettings.accessConfig) &&
//           Objects.equals(this.passwordPattern, providerSettings.passwordPattern) &&
//           Objects.equals(this.plugins, providerSettings.plugins) &&
//           Objects.equals(this.resourceOverrides, providerSettings.resourceOverrides) &&
//           Objects.equals(this.statusBadgeEnabled, providerSettings.statusBadgeEnabled) &&
//           Objects.equals(this.uiBannerContent, providerSettings.uiBannerContent) &&
//           Objects.equals(this.uiBannerURL, providerSettings.uiBannerURL) &&
//           Objects.equals(this.uiCssURL, providerSettings.uiCssURL) &&
//           Objects.equals(this.url, providerSettings.url) &&
//           Objects.equals(this.userLoginsDisabled, providerSettings.userLoginsDisabled);
//     }
  
//     @Override
//     public int hashCode() {
//       return Objects.hash(appLabelKey, configManagementPlugins, help, accessConfig, passwordPattern, plugins, resourceOverrides, statusBadgeEnabled, uiBannerContent, uiBannerURL, uiCssURL, url, userLoginsDisabled);
//     }
  
//     @Override
//     public String toString() {
//       StringBuilder sb = new StringBuilder();
//       sb.append("class ProviderSettings {\n");
      
//       sb.append("    appLabelKey: ").append(toIndentedString(appLabelKey)).append("\n");
//       sb.append("    configManagementPlugins: ").append(toIndentedString(configManagementPlugins)).append("\n");
//       sb.append("    help: ").append(toIndentedString(help)).append("\n");
//       sb.append("    accessConfig: ").append(toIndentedString(accessConfig)).append("\n");
//       sb.append("    passwordPattern: ").append(toIndentedString(passwordPattern)).append("\n");
//       sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
//       sb.append("    resourceOverrides: ").append(toIndentedString(resourceOverrides)).append("\n");
//       sb.append("    statusBadgeEnabled: ").append(toIndentedString(statusBadgeEnabled)).append("\n");
//       sb.append("    uiBannerContent: ").append(toIndentedString(uiBannerContent)).append("\n");
//       sb.append("    uiBannerURL: ").append(toIndentedString(uiBannerURL)).append("\n");
//       sb.append("    uiCssURL: ").append(toIndentedString(uiCssURL)).append("\n");
//       sb.append("    url: ").append(toIndentedString(url)).append("\n");
//       sb.append("    userLoginsDisabled: ").append(toIndentedString(userLoginsDisabled)).append("\n");
//       sb.append("}");
//       return sb.toString();
//     }
  
//     /**
//      * Convert the given object to string with each line indented by 4 spaces
//      * (except the first line).
//      */
//     private String toIndentedString(Object o) {
//       if (o == null) {
//         return "null";
//       }
//       return o.toString().replace("\n", "\n    ");
//     }
  }

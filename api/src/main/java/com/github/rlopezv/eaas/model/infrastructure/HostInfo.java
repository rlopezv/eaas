package com.github.rlopezv.eaas.model.infrastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * HostInfo holds host name and resources included with information regarding its characteristics
 */
@Schema(description = "HostInfo holds host name and resources included with information regarding its characteristics")
public class HostInfo   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("resourcesInfo")
  @Valid
  private List<HostResourceInfo> resourcesInfo = null;

  @JsonProperty("systemInfo")
  private HostSystemInfo systemInfo;

  public HostInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
 @Schema(defaultValue =  "")
 public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HostInfo resourcesInfo(List<HostResourceInfo> resourcesInfo) {
    this.resourcesInfo = resourcesInfo;
    return this;
  }

  public HostInfo addResourcesInfoItem(HostResourceInfo resourcesInfoItem) {
    if (this.resourcesInfo == null) {
      this.resourcesInfo = new ArrayList<>();
    }
    this.resourcesInfo.add(resourcesInfoItem);
    return this;
  }

  /**
   * Get resourcesInfo
   * @return resourcesInfo
  */
 @Schema(defaultValue = "")
  @Valid

  public List<HostResourceInfo> getResourcesInfo() {
    return resourcesInfo;
  }

  public void setResourcesInfo(List<HostResourceInfo> resourcesInfo) {
    this.resourcesInfo = resourcesInfo;
  }

  public HostInfo systemInfo(HostSystemInfo systemInfo) {
    this.systemInfo = systemInfo;
    return this;
  }

  /**
   * Get systemInfo
   * @return systemInfo
  */
 @Schema(defaultValue = "")
  @Valid

  public HostSystemInfo getSystemInfo() {
    return systemInfo;
  }

  public void setSystemInfo(HostSystemInfo systemInfo) {
    this.systemInfo = systemInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostInfo HostInfo = (HostInfo) o;
    return Objects.equals(this.name, HostInfo.name) &&
        Objects.equals(this.resourcesInfo, HostInfo.resourcesInfo) &&
        Objects.equals(this.systemInfo, HostInfo.systemInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resourcesInfo, systemInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourcesInfo: ").append(toIndentedString(resourcesInfo)).append("\n");
    sb.append("    systemInfo: ").append(toIndentedString(systemInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


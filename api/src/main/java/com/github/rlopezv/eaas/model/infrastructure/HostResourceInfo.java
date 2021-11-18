package com.github.rlopezv.eaas.model.infrastructure;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "TODO: categorize resource type")
public class HostResourceInfo   {
  @JsonProperty("capacity")
  private String capacity;

  @JsonProperty("resourceName")
  private String resourceName;

  @JsonProperty("requestedByApp")
  private String requestedByApp;

  @JsonProperty("requestedByNeighbors")
  private String requestedByNeighbors;

  public HostResourceInfo capacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  */
 @Schema(defaultValue =  "")
 public String getCapacity() {
    return capacity;
  }

  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }

  public HostResourceInfo requestedByApp(String requestedByApp) {
    this.requestedByApp = requestedByApp;
    return this;
  }

  /**
   * Get requestedByApp
   * @return requestedByApp
  */
 @Schema(defaultValue =  "")
 public String getRequestedByApp() {
    return requestedByApp;
  }

  /**
   * 
   * @param requestedByApp
   */
  public void setRequestedByApp(String requestedByApp) {
    this.requestedByApp = requestedByApp;
  }

  public HostResourceInfo requestedByNeighbors(String requestedByNeighbors) {
    this.requestedByNeighbors = requestedByNeighbors;
    return this;
  }

  /**
   * Get requestedByNeighbors
   * @return requestedByNeighbors
  */
 @Schema(defaultValue =  "")
 public String getRequestedByNeighbors() {
    return requestedByNeighbors;
  }

  public void setRequestedByNeighbors(String requestedByNeighbors) {
    this.requestedByNeighbors = requestedByNeighbors;
  }

  public HostResourceInfo resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Get resourceName
   * @return resourceName
  */
 @Schema(defaultValue =  "")
 public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostResourceInfo HostResourceInfo = (HostResourceInfo) o;
    return Objects.equals(this.capacity, HostResourceInfo.capacity) &&
        Objects.equals(this.requestedByApp, HostResourceInfo.requestedByApp) &&
        Objects.equals(this.requestedByNeighbors, HostResourceInfo.requestedByNeighbors) &&
        Objects.equals(this.resourceName, HostResourceInfo.resourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, requestedByApp, requestedByNeighbors, resourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostResourceInfo {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    requestedByApp: ").append(toIndentedString(requestedByApp)).append("\n");
    sb.append("    requestedByNeighbors: ").append(toIndentedString(requestedByNeighbors)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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


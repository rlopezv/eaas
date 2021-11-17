package com.github.rlopezv.eeas.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

public class ContentAny   {

    @JsonProperty("type_url")
    private String typeUrl;
  
    @JsonProperty("value")
    private byte[] value;
  
    public ContentAny typeUrl(String typeUrl) {
      this.typeUrl = typeUrl;
      return this;
    }
  
    /**
     * Get typeUrl
     * @return typeUrl
    */
   @Schema(defaultValue = "")
   public String getTypeUrl() {
      return typeUrl;
    }
  
    public void setTypeUrl(String typeUrl) {
      this.typeUrl = typeUrl;
    }
  
    public ContentAny value(byte[] value) {
      this.value = value;
      return this;
    }
  
    /**
     * Get value
     * @return value
    */
   @Schema(defaultValue =  "")
   public byte[] getValue() {
      return value;
    }
  
    public void setValue(byte[] value) {
      this.value = value;
    }
  
  
    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      ContentAny contentAny = (ContentAny) o;
      return Objects.equals(this.typeUrl, contentAny.typeUrl) &&
          Arrays.equals(this.value, contentAny.value);
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(typeUrl, Arrays.hashCode(value));
    }
  
     /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("ContentAny [typeUrl=").append(typeUrl).append(", value=").append(Arrays.toString(value))
          .append("]");
      return builder.toString();
    }
  
  }

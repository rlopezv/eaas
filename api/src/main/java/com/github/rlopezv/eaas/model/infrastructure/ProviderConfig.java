package com.github.rlopezv.eaas.model.infrastructure;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ProviderConfig is the configuration attributes. This structure should be subset of the go-client rest.Config with annotations added for marshalling.
 */
@Schema(description = "ProviderConfig contains the configuration attributes.")
public class ProviderConfig   {

  @JsonProperty("bearerToken")
  private String bearerToken;

  @JsonProperty("execProviderConfig")
  private ExecProviderConfig execProviderConfig;

  @JsonProperty("password")
  private String password;

  // @JsonProperty("tlsClientConfig")
  // private TLSClientConfig tlsClientConfig;

  @JsonProperty("username")
  private String username;

  public ProviderConfig bearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
    return this;
  }

  /**
   * Server requires Bearer authentication. This client will not attempt to use refresh tokens for an OAuth2 flow.
   * @return bearerToken
  */
 @Schema(defaultValue = "Server requires Bearer authentication. This client will not attempt to use refresh tokens for an OAuth2 flow.")


  public String getBearerToken() {
    return bearerToken;
  }

  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }

  public ProviderConfig execProviderConfig(ExecProviderConfig execProviderConfig) {
    this.execProviderConfig = execProviderConfig;
    return this;
  }

  /**
   * Get execProviderConfig
   * @return execProviderConfig
  */
 @Schema(defaultValue = "")
  @Valid

  public ExecProviderConfig getExecProviderConfig() {
    return execProviderConfig;
  }

  public void setExecProviderConfig(ExecProviderConfig execProviderConfig) {
    this.execProviderConfig = execProviderConfig;
  }

  public ProviderConfig password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
 @Schema(defaultValue =  "")
 public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  // public ProviderConfig tlsClientConfig(TLSClientConfig tlsClientConfig) {
  //   this.tlsClientConfig = tlsClientConfig;
  //   return this;
  // }

  /**
   * Get tlsClientConfig
   * @return tlsClientConfig
  */
 @Schema(defaultValue = "")
  @Valid

  // public TLSClientConfig getTlsClientConfig() {
  //   return tlsClientConfig;
  // }

  // public void setTlsClientConfig(TLSClientConfig tlsClientConfig) {
  //   this.tlsClientConfig = tlsClientConfig;
  // }

  public ProviderConfig username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Server requires Basic authentication
   * @return username
  */
 @Schema(defaultValue = "Server requires Basic authentication")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderConfig ProviderConfig = (ProviderConfig) o;
    return Objects.equals(this.bearerToken, ProviderConfig.bearerToken) &&
        Objects.equals(this.execProviderConfig, ProviderConfig.execProviderConfig) &&
        Objects.equals(this.password, ProviderConfig.password) &&
        //Objects.equals(this.tlsClientConfig, ProviderConfig.tlsClientConfig) &&
        Objects.equals(this.username, ProviderConfig.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bearerToken, execProviderConfig, password, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderConfig {\n");
    
    sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
    sb.append("    execProviderConfig: ").append(toIndentedString(execProviderConfig)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    // sb.append("    tlsClientConfig: ").append(toIndentedString(tlsClientConfig)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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


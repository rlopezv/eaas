package com.github.rlopezv.eaas.model.infrastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ExecProviderConfig is config used to call an external command to perform provider authentication
 */
@Schema(description = "ExecProviderConfig is config used to call an external command to perform provider authentication")
public class ExecProviderConfig   {
  @JsonProperty("apiVersion")
  private String apiVersion;

  @JsonProperty("args")
  @Valid
  private List<String> args = null;

  @JsonProperty("command")
  private String command;

  @JsonProperty("env")
  @Valid
  private Map<String, String> env = null;

  @JsonProperty("installHint")
  private String installHint;

  public ExecProviderConfig apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Preferred input version of the ExecInfo
   * @return apiVersion
  */
 @Schema(defaultValue = "Preferred input version of the ExecInfo")


  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ExecProviderConfig args(List<String> args) {
    this.args = args;
    return this;
  }

  public ExecProviderConfig addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Arguments to pass to the command when executing it
   * @return args
  */
 @Schema(defaultValue = "Arguments to pass to the command when executing it")


  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public ExecProviderConfig command(String command) {
    this.command = command;
    return this;
  }

  /**
   * Command to execute
   * @return command
  */
 @Schema(defaultValue = "Command to execute")


  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public ExecProviderConfig env(Map<String, String> env) {
    this.env = env;
    return this;
  }

  public ExecProviderConfig putEnvItem(String key, String envItem) {
    if (this.env == null) {
      this.env = new HashMap<>();
    }
    this.env.put(key, envItem);
    return this;
  }

  /**
   * Env defines additional workSpace variables to expose to the process
   * @return env
  */
 @Schema(defaultValue = "Env defines additional workSpace variables to expose to the process")


  public Map<String, String> getEnv() {
    return env;
  }

  public void setEnv(Map<String, String> env) {
    this.env = env;
  }

  public ExecProviderConfig installHint(String installHint) {
    this.installHint = installHint;
    return this;
  }

  /**
   * This text is shown to the user when the executable doesn't seem to be present
   * @return installHint
  */
 @Schema(defaultValue = "This text is shown to the user when the executable doesn't seem to be present")
  public String getInstallHint() {
    return installHint;
  }

  public void setInstallHint(String installHint) {
    this.installHint = installHint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecProviderConfig ExecProviderConfig = (ExecProviderConfig) o;
    return Objects.equals(this.apiVersion, ExecProviderConfig.apiVersion) &&
        Objects.equals(this.args, ExecProviderConfig.args) &&
        Objects.equals(this.command, ExecProviderConfig.command) &&
        Objects.equals(this.env, ExecProviderConfig.env) &&
        Objects.equals(this.installHint, ExecProviderConfig.installHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, args, command, env, installHint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecProviderConfig {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    installHint: ").append(toIndentedString(installHint)).append("\n");
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


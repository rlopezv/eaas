package com.github.rlopezv.eaas.model.common;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
 */
@Schema(description = "Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")
public class Time   {
  @JsonProperty("nanos")
  private Integer nanos;

  @JsonProperty("seconds")
  private String seconds;

  public Time nanos(Integer nanos) {
    this.nanos = nanos;
    return this;
  }

  /**
   * Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive. This field may be limited in precision depending on context.
   * @return nanos
  */
 @Schema(defaultValue = "Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive. This field may be limited in precision depending on context.")
  public Integer getNanos() {
    return nanos;
  }

  public void setNanos(Integer nanos) {
    this.nanos = nanos;
  }

  public Time seconds(String seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive.
   * @return seconds
  */
 @Schema(defaultValue = "Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive.")
  public String getSeconds() {
    return seconds;
  }

  public void setSeconds(String seconds) {
    this.seconds = seconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Time Time = (Time) o;
    return Objects.equals(this.nanos, Time.nanos) &&
        Objects.equals(this.seconds, Time.seconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nanos, seconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Time {\n");
    
    sb.append("    nanos: ").append(toIndentedString(nanos)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
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


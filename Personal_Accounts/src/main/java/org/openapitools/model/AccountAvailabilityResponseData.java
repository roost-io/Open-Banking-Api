package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ParamName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccountAvailabilityResponseData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:00.174725+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AccountAvailabilityResponseData {

  private ParamName paramName;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    TRUE("true"),
    
    FALSE("false"),
    
    RETRY("Retry"),
    
    NOTAVAILABLE("NotAvailable"),
    
    ERROR("Error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  public AccountAvailabilityResponseData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccountAvailabilityResponseData(ParamName paramName, StatusEnum status) {
    this.paramName = paramName;
    this.status = status;
  }

  public AccountAvailabilityResponseData paramName(ParamName paramName) {
    this.paramName = paramName;
    return this;
  }

  /**
   * Get paramName
   * @return paramName
  */
  @NotNull @Valid 
  @Schema(name = "paramName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paramName")
  public ParamName getParamName() {
    return paramName;
  }

  public void setParamName(ParamName paramName) {
    this.paramName = paramName;
  }

  public AccountAvailabilityResponseData status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAvailabilityResponseData accountAvailabilityResponseData = (AccountAvailabilityResponseData) o;
    return Objects.equals(this.paramName, accountAvailabilityResponseData.paramName) &&
        Objects.equals(this.status, accountAvailabilityResponseData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAvailabilityResponseData {\n");
    sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


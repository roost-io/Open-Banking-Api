package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.HKError1;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An array of detail error codes, and messages, and URLs to documentation to help remediation.
 */

@Schema(name = "errorInfo", description = "An array of detail error codes, and messages, and URLs to documentation to help remediation.")
@JsonTypeName("errorInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:00.174725+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class ErrorInfo {

  private String id;

  @Valid
  private List<@Valid HKError1> errors = new ArrayList<>();

  public ErrorInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorInfo(List<@Valid HKError1> errors) {
    this.errors = errors;
  }

  public ErrorInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.
   * @return id
  */
  @Size(min = 1, max = 40) 
  @Schema(name = "id", description = "A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ErrorInfo errors(List<@Valid HKError1> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorInfo addErrorsItem(HKError1 errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errors")
  public List<@Valid HKError1> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid HKError1> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorInfo errorInfo = (ErrorInfo) o;
    return Objects.equals(this.id, errorInfo.id) &&
        Objects.equals(this.errors, errorInfo.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Provide details for the error
 */

@Schema(name = "HKError1_extendedDetails", description = "Provide details for the error")
@JsonTypeName("HKError1_extendedDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:00.174725+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class HKError1ExtendedDetails {

  private String path;

  public HKError1ExtendedDetails path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency
   * @return path
  */
  @Size(min = 1, max = 500) 
  @Schema(name = "path", description = "Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HKError1ExtendedDetails hkError1ExtendedDetails = (HKError1ExtendedDetails) o;
    return Objects.equals(this.path, hkError1ExtendedDetails.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HKError1ExtendedDetails {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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


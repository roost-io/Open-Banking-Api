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
 * Reject Reason List-Entry
 */

@Schema(name = "rejectReasonEntry", description = "Reject Reason List-Entry")
@JsonTypeName("rejectReasonEntry")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:18.316995+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class RejectReasonEntry {

  private String rejectReasonCode;

  private String rejectReasonInfomation;

  public RejectReasonEntry rejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
    return this;
  }

  /**
   * Reject Reason List-Entry-Element: Code.
   * @return rejectReasonCode
  */
  @Size(max = 10) 
  @Schema(name = "rejectReasonCode", description = "Reject Reason List-Entry-Element: Code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectReasonCode")
  public String getRejectReasonCode() {
    return rejectReasonCode;
  }

  public void setRejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
  }

  public RejectReasonEntry rejectReasonInfomation(String rejectReasonInfomation) {
    this.rejectReasonInfomation = rejectReasonInfomation;
    return this;
  }

  /**
   * Reject Reason List-Entry-Element: Information
   * @return rejectReasonInfomation
  */
  @Size(max = 105) 
  @Schema(name = "rejectReasonInfomation", description = "Reject Reason List-Entry-Element: Information", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectReasonInfomation")
  public String getRejectReasonInfomation() {
    return rejectReasonInfomation;
  }

  public void setRejectReasonInfomation(String rejectReasonInfomation) {
    this.rejectReasonInfomation = rejectReasonInfomation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectReasonEntry rejectReasonEntry = (RejectReasonEntry) o;
    return Objects.equals(this.rejectReasonCode, rejectReasonEntry.rejectReasonCode) &&
        Objects.equals(this.rejectReasonInfomation, rejectReasonEntry.rejectReasonInfomation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectReasonCode, rejectReasonInfomation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectReasonEntry {\n");
    sb.append("    rejectReasonCode: ").append(toIndentedString(rejectReasonCode)).append("\n");
    sb.append("    rejectReasonInfomation: ").append(toIndentedString(rejectReasonInfomation)).append("\n");
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


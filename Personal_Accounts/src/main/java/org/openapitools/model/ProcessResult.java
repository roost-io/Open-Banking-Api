package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RejectReasonEntry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProcessResult
 */

@JsonTypeName("processResult")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:32:56.573489+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class ProcessResult {

  /**
   * Response code 
   */
  public enum ResponseCodeEnum {
    _00("00"),
    
    _99("99");

    private String value;

    ResponseCodeEnum(String value) {
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
    public static ResponseCodeEnum fromValue(String value) {
      for (ResponseCodeEnum b : ResponseCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ResponseCodeEnum responseCode;

  @Valid
  private List<@Valid RejectReasonEntry> rejectReasonList;

  public ProcessResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProcessResult(ResponseCodeEnum responseCode) {
    this.responseCode = responseCode;
  }

  public ProcessResult responseCode(ResponseCodeEnum responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Response code 
   * @return responseCode
  */
  @NotNull @Size(max = 4) 
  @Schema(name = "responseCode", description = "Response code ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("responseCode")
  public ResponseCodeEnum getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(ResponseCodeEnum responseCode) {
    this.responseCode = responseCode;
  }

  public ProcessResult rejectReasonList(List<@Valid RejectReasonEntry> rejectReasonList) {
    this.rejectReasonList = rejectReasonList;
    return this;
  }

  public ProcessResult addRejectReasonListItem(RejectReasonEntry rejectReasonListItem) {
    if (this.rejectReasonList == null) {
      this.rejectReasonList = new ArrayList<>();
    }
    this.rejectReasonList.add(rejectReasonListItem);
    return this;
  }

  /**
   * Get rejectReasonList
   * @return rejectReasonList
  */
  @Valid 
  @Schema(name = "rejectReasonList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectReasonList")
  public List<@Valid RejectReasonEntry> getRejectReasonList() {
    return rejectReasonList;
  }

  public void setRejectReasonList(List<@Valid RejectReasonEntry> rejectReasonList) {
    this.rejectReasonList = rejectReasonList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessResult processResult = (ProcessResult) o;
    return Objects.equals(this.responseCode, processResult.responseCode) &&
        Objects.equals(this.rejectReasonList, processResult.rejectReasonList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseCode, rejectReasonList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessResult {\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    rejectReasonList: ").append(toIndentedString(rejectReasonList)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.model.ProcessResult;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReportingResponse
 */

@JsonTypeName("reportingResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:18.316995+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class ReportingResponse {

  private ProcessResult processResult;

  private byte[] reportContent;

  public ReportingResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReportingResponse(ProcessResult processResult, byte[] reportContent) {
    this.processResult = processResult;
    this.reportContent = reportContent;
  }

  public ReportingResponse processResult(ProcessResult processResult) {
    this.processResult = processResult;
    return this;
  }

  /**
   * Get processResult
   * @return processResult
  */
  @NotNull @Valid 
  @Schema(name = "processResult", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("processResult")
  public ProcessResult getProcessResult() {
    return processResult;
  }

  public void setProcessResult(ProcessResult processResult) {
    this.processResult = processResult;
  }

  public ReportingResponse reportContent(byte[] reportContent) {
    this.reportContent = reportContent;
    return this;
  }

  /**
   * Report Content.Encoded in BASE64.
   * @return reportContent
  */
  @NotNull 
  @Schema(name = "reportContent", description = "Report Content.Encoded in BASE64.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reportContent")
  public byte[] getReportContent() {
    return reportContent;
  }

  public void setReportContent(byte[] reportContent) {
    this.reportContent = reportContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingResponse reportingResponse = (ReportingResponse) o;
    return Objects.equals(this.processResult, reportingResponse.processResult) &&
        Arrays.equals(this.reportContent, reportingResponse.reportContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processResult, Arrays.hashCode(reportContent));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingResponse {\n");
    sb.append("    processResult: ").append(toIndentedString(processResult)).append("\n");
    sb.append("    reportContent: ").append(toIndentedString(reportContent)).append("\n");
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


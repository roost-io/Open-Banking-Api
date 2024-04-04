package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ProcessResult;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object to hold response of direct debit authorisation status
 */

@Schema(name = "eDDAStatusPullEnquiryResponse", description = "Object to hold response of direct debit authorisation status")
@JsonTypeName("eDDAStatusPullEnquiryResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:32:56.573489+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class EDDAStatusPullEnquiryResponse {

  private ProcessResult processResult;

  private String mandateIdentification;

  /**
   * Status of the mandate request.
   */
  public enum MandateStatusEnum {
    ERROR("ERROR"),
    
    PDOU("PDOU"),
    
    ACTIVE("ACTIVE"),
    
    EXPIRED("EXPIRED"),
    
    DORMANT("DORMANT"),
    
    SUSPENDED("SUSPENDED"),
    
    CANCELLED("CANCELLED"),
    
    DELETED("DELETED"),
    
    PDNG("PDNG"),
    
    PDFP("PDFP");

    private String value;

    MandateStatusEnum(String value) {
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
    public static MandateStatusEnum fromValue(String value) {
      for (MandateStatusEnum b : MandateStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MandateStatusEnum mandateStatus;

  public EDDAStatusPullEnquiryResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EDDAStatusPullEnquiryResponse(ProcessResult processResult, String mandateIdentification, MandateStatusEnum mandateStatus) {
    this.processResult = processResult;
    this.mandateIdentification = mandateIdentification;
    this.mandateStatus = mandateStatus;
  }

  public EDDAStatusPullEnquiryResponse processResult(ProcessResult processResult) {
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

  public EDDAStatusPullEnquiryResponse mandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

  /**
   * DDA Reference No.
   * @return mandateIdentification
  */
  @NotNull @Size(min = 1, max = 35) 
  @Schema(name = "mandateIdentification", description = "DDA Reference No.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mandateIdentification")
  public String getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public EDDAStatusPullEnquiryResponse mandateStatus(MandateStatusEnum mandateStatus) {
    this.mandateStatus = mandateStatus;
    return this;
  }

  /**
   * Status of the mandate request.
   * @return mandateStatus
  */
  @NotNull @Size(max = 10) 
  @Schema(name = "mandateStatus", description = "Status of the mandate request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mandateStatus")
  public MandateStatusEnum getMandateStatus() {
    return mandateStatus;
  }

  public void setMandateStatus(MandateStatusEnum mandateStatus) {
    this.mandateStatus = mandateStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EDDAStatusPullEnquiryResponse eDDAStatusPullEnquiryResponse = (EDDAStatusPullEnquiryResponse) o;
    return Objects.equals(this.processResult, eDDAStatusPullEnquiryResponse.processResult) &&
        Objects.equals(this.mandateIdentification, eDDAStatusPullEnquiryResponse.mandateIdentification) &&
        Objects.equals(this.mandateStatus, eDDAStatusPullEnquiryResponse.mandateStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processResult, mandateIdentification, mandateStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EDDAStatusPullEnquiryResponse {\n");
    sb.append("    processResult: ").append(toIndentedString(processResult)).append("\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    mandateStatus: ").append(toIndentedString(mandateStatus)).append("\n");
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


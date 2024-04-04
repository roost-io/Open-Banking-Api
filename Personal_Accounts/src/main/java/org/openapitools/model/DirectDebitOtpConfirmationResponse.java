package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ProcessResult;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Response Object of OTP confirmation for DD Authorisation
 */

@Schema(name = "directDebitOtpConfirmationResponse", description = "Response Object of OTP confirmation for DD Authorisation")
@JsonTypeName("directDebitOtpConfirmationResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:32:56.573489+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class DirectDebitOtpConfirmationResponse {

  private ProcessResult processResult;

  private String mandateIdentification;

  private String creditorReference;

  public DirectDebitOtpConfirmationResponse processResult(ProcessResult processResult) {
    this.processResult = processResult;
    return this;
  }

  /**
   * Get processResult
   * @return processResult
  */
  @Valid 
  @Schema(name = "processResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processResult")
  public ProcessResult getProcessResult() {
    return processResult;
  }

  public void setProcessResult(ProcessResult processResult) {
    this.processResult = processResult;
  }

  public DirectDebitOtpConfirmationResponse mandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

  /**
   * HSBC DDA Reference No.
   * @return mandateIdentification
  */
  @Size(max = 64) 
  @Schema(name = "mandateIdentification", description = "HSBC DDA Reference No.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mandateIdentification")
  public String getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public DirectDebitOtpConfirmationResponse creditorReference(String creditorReference) {
    this.creditorReference = creditorReference;
    return this;
  }

  /**
   * Creditor reference of the DDA. This CreditorReference will be sent to Payer Bank through FPS for record.
   * @return creditorReference
  */
  @Size(max = 35) 
  @Schema(name = "creditorReference", description = "Creditor reference of the DDA. This CreditorReference will be sent to Payer Bank through FPS for record.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditorReference")
  public String getCreditorReference() {
    return creditorReference;
  }

  public void setCreditorReference(String creditorReference) {
    this.creditorReference = creditorReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDebitOtpConfirmationResponse directDebitOtpConfirmationResponse = (DirectDebitOtpConfirmationResponse) o;
    return Objects.equals(this.processResult, directDebitOtpConfirmationResponse.processResult) &&
        Objects.equals(this.mandateIdentification, directDebitOtpConfirmationResponse.mandateIdentification) &&
        Objects.equals(this.creditorReference, directDebitOtpConfirmationResponse.creditorReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processResult, mandateIdentification, creditorReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitOtpConfirmationResponse {\n");
    sb.append("    processResult: ").append(toIndentedString(processResult)).append("\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    creditorReference: ").append(toIndentedString(creditorReference)).append("\n");
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


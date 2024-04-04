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

@Schema(name = "directDebitInstructionResponse", description = "Object to hold response of direct debit authorisation status")
@JsonTypeName("directDebitInstructionResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:18.316995+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class DirectDebitInstructionResponse {

  /**
   * Payment Status.Status for On-US :\"ACSC\" - Accepted Settlement Completed (Processed by Bank).\"RJCT\" - Rejected by Bank.\"ACCP\"AcceptedCustomerProfile - Preceding check of technical validation was successful. Customer profile check was also successful.Status for Off-us:\"ACSP\" - AcceptedSettlementInProcess - Pending to FPS.
   */
  public enum PaymentInformationStatusEnum {
    ACSC("ACSC"),
    
    RJCT("RJCT"),
    
    ACCP("ACCP"),
    
    ACSP("ACSP");

    private String value;

    PaymentInformationStatusEnum(String value) {
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
    public static PaymentInformationStatusEnum fromValue(String value) {
      for (PaymentInformationStatusEnum b : PaymentInformationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PaymentInformationStatusEnum paymentInformationStatus;

  private ProcessResult processResult;

  private String transactionIdentification;

  public DirectDebitInstructionResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DirectDebitInstructionResponse(PaymentInformationStatusEnum paymentInformationStatus, ProcessResult processResult, String transactionIdentification) {
    this.paymentInformationStatus = paymentInformationStatus;
    this.processResult = processResult;
    this.transactionIdentification = transactionIdentification;
  }

  public DirectDebitInstructionResponse paymentInformationStatus(PaymentInformationStatusEnum paymentInformationStatus) {
    this.paymentInformationStatus = paymentInformationStatus;
    return this;
  }

  /**
   * Payment Status.Status for On-US :\"ACSC\" - Accepted Settlement Completed (Processed by Bank).\"RJCT\" - Rejected by Bank.\"ACCP\"AcceptedCustomerProfile - Preceding check of technical validation was successful. Customer profile check was also successful.Status for Off-us:\"ACSP\" - AcceptedSettlementInProcess - Pending to FPS.
   * @return paymentInformationStatus
  */
  @NotNull @Size(max = 4) 
  @Schema(name = "paymentInformationStatus", description = "Payment Status.Status for On-US :\"ACSC\" - Accepted Settlement Completed (Processed by Bank).\"RJCT\" - Rejected by Bank.\"ACCP\"AcceptedCustomerProfile - Preceding check of technical validation was successful. Customer profile check was also successful.Status for Off-us:\"ACSP\" - AcceptedSettlementInProcess - Pending to FPS.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentInformationStatus")
  public PaymentInformationStatusEnum getPaymentInformationStatus() {
    return paymentInformationStatus;
  }

  public void setPaymentInformationStatus(PaymentInformationStatusEnum paymentInformationStatus) {
    this.paymentInformationStatus = paymentInformationStatus;
  }

  public DirectDebitInstructionResponse processResult(ProcessResult processResult) {
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

  public DirectDebitInstructionResponse transactionIdentification(String transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
    return this;
  }

  /**
   * Transaction Reference No.Unique transaction id provided by the bank.
   * @return transactionIdentification
  */
  @NotNull @Size(max = 35) 
  @Schema(name = "transactionIdentification", description = "Transaction Reference No.Unique transaction id provided by the bank.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transactionIdentification")
  public String getTransactionIdentification() {
    return transactionIdentification;
  }

  public void setTransactionIdentification(String transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDebitInstructionResponse directDebitInstructionResponse = (DirectDebitInstructionResponse) o;
    return Objects.equals(this.paymentInformationStatus, directDebitInstructionResponse.paymentInformationStatus) &&
        Objects.equals(this.processResult, directDebitInstructionResponse.processResult) &&
        Objects.equals(this.transactionIdentification, directDebitInstructionResponse.transactionIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInformationStatus, processResult, transactionIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitInstructionResponse {\n");
    sb.append("    paymentInformationStatus: ").append(toIndentedString(paymentInformationStatus)).append("\n");
    sb.append("    processResult: ").append(toIndentedString(processResult)).append("\n");
    sb.append("    transactionIdentification: ").append(toIndentedString(transactionIdentification)).append("\n");
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


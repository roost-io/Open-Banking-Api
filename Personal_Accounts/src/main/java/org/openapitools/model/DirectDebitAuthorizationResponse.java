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
 * DirectDebitAuthorizationResponse
 */

@JsonTypeName("directDebitAuthorizationResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:32:56.573489+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class DirectDebitAuthorizationResponse {

  private ProcessResult processResult;

  private String mandateIdentification;

  private String otpIdentificationNumber;

  private String mobileNumber;

  /**
   * Status of the mandate request. PDNG - Pending to DDAE response; PDFP - Pending to FPS eDDA response; PDOU - Pending to on-us DDA response.
   */
  public enum MandateStatusEnum {
    PDNG("PDNG"),
    
    PDFP("PDFP"),
    
    PDOU("PDOU"),
    
    ERROR("ERROR"),
    
    ACTIVE("ACTIVE");

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

  public DirectDebitAuthorizationResponse processResult(ProcessResult processResult) {
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

  public DirectDebitAuthorizationResponse mandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

  /**
   * DDA Reference No.Unique at DDA record level.Merchant will use this value for subsequent registration process
   * @return mandateIdentification
  */
  @Size(max = 35) 
  @Schema(name = "mandateIdentification", description = "DDA Reference No.Unique at DDA record level.Merchant will use this value for subsequent registration process", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mandateIdentification")
  public String getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public DirectDebitAuthorizationResponse otpIdentificationNumber(String otpIdentificationNumber) {
    this.otpIdentificationNumber = otpIdentificationNumber;
    return this;
  }

  /**
   * One time password (OTP) identification number - for payer to identify the particular SMS message going to be received via mobile phone for Payer Bank's authentication. Usually, this OtpIdentificationNumber come as the first few characters of the receiving OTP. E.g. \"YU88X\" of the OTP \"YU88X-467854\"
   * @return otpIdentificationNumber
  */
  @Size(max = 10) 
  @Schema(name = "otpIdentificationNumber", description = "One time password (OTP) identification number - for payer to identify the particular SMS message going to be received via mobile phone for Payer Bank's authentication. Usually, this OtpIdentificationNumber come as the first few characters of the receiving OTP. E.g. \"YU88X\" of the OTP \"YU88X-467854\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("otpIdentificationNumber")
  public String getOtpIdentificationNumber() {
    return otpIdentificationNumber;
  }

  public void setOtpIdentificationNumber(String otpIdentificationNumber) {
    this.otpIdentificationNumber = otpIdentificationNumber;
  }

  public DirectDebitAuthorizationResponse mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Masked mobile number which OTP is sent to.Exclude non-numeric character (e.g. \"-\" / \"+\"& space).Mask from last digit to the position of 50% or more than that of field length.Use \"*\" for mask.
   * @return mobileNumber
  */
  @Size(max = 35) 
  @Schema(name = "mobileNumber", description = "Masked mobile number which OTP is sent to.Exclude non-numeric character (e.g. \"-\" / \"+\"& space).Mask from last digit to the position of 50% or more than that of field length.Use \"*\" for mask.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileNumber")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public DirectDebitAuthorizationResponse mandateStatus(MandateStatusEnum mandateStatus) {
    this.mandateStatus = mandateStatus;
    return this;
  }

  /**
   * Status of the mandate request. PDNG - Pending to DDAE response; PDFP - Pending to FPS eDDA response; PDOU - Pending to on-us DDA response.
   * @return mandateStatus
  */
  @Size(max = 6) 
  @Schema(name = "mandateStatus", description = "Status of the mandate request. PDNG - Pending to DDAE response; PDFP - Pending to FPS eDDA response; PDOU - Pending to on-us DDA response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    DirectDebitAuthorizationResponse directDebitAuthorizationResponse = (DirectDebitAuthorizationResponse) o;
    return Objects.equals(this.processResult, directDebitAuthorizationResponse.processResult) &&
        Objects.equals(this.mandateIdentification, directDebitAuthorizationResponse.mandateIdentification) &&
        Objects.equals(this.otpIdentificationNumber, directDebitAuthorizationResponse.otpIdentificationNumber) &&
        Objects.equals(this.mobileNumber, directDebitAuthorizationResponse.mobileNumber) &&
        Objects.equals(this.mandateStatus, directDebitAuthorizationResponse.mandateStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processResult, mandateIdentification, otpIdentificationNumber, mobileNumber, mandateStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitAuthorizationResponse {\n");
    sb.append("    processResult: ").append(toIndentedString(processResult)).append("\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    otpIdentificationNumber: ").append(toIndentedString(otpIdentificationNumber)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
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


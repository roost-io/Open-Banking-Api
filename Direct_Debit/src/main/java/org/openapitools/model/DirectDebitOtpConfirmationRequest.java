package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CashAccount;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request Object to confirm OTP for DD Authorisations
 */

@Schema(name = "directDebitOtpConfirmationRequest", description = "Request Object to confirm OTP for DD Authorisations")
@JsonTypeName("directDebitOtpConfirmationRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:18.316995+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class DirectDebitOtpConfirmationRequest {

  private String mandateIdentification;

  private String otpIdentificationNumber;

  private String otpPassword;

  private CashAccount creditorAccount;

  public DirectDebitOtpConfirmationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DirectDebitOtpConfirmationRequest(String mandateIdentification, CashAccount creditorAccount) {
    this.mandateIdentification = mandateIdentification;
    this.creditorAccount = creditorAccount;
  }

  public DirectDebitOtpConfirmationRequest mandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

  /**
   * HSBC DDA Reference No.
   * @return mandateIdentification
  */
  @NotNull @Size(min = 1, max = 35) 
  @Schema(name = "mandateIdentification", description = "HSBC DDA Reference No.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mandateIdentification")
  public String getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public DirectDebitOtpConfirmationRequest otpIdentificationNumber(String otpIdentificationNumber) {
    this.otpIdentificationNumber = otpIdentificationNumber;
    return this;
  }

  /**
   * OTP identity number.
   * @return otpIdentificationNumber
  */
  @Size(max = 10) 
  @Schema(name = "otpIdentificationNumber", description = "OTP identity number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("otpIdentificationNumber")
  public String getOtpIdentificationNumber() {
    return otpIdentificationNumber;
  }

  public void setOtpIdentificationNumber(String otpIdentificationNumber) {
    this.otpIdentificationNumber = otpIdentificationNumber;
  }

  public DirectDebitOtpConfirmationRequest otpPassword(String otpPassword) {
    this.otpPassword = otpPassword;
    return this;
  }

  /**
   * OTP password.
   * @return otpPassword
  */
  @Size(max = 10) 
  @Schema(name = "otpPassword", description = "OTP password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("otpPassword")
  public String getOtpPassword() {
    return otpPassword;
  }

  public void setOtpPassword(String otpPassword) {
    this.otpPassword = otpPassword;
  }

  public DirectDebitOtpConfirmationRequest creditorAccount(CashAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
  */
  @NotNull @Valid 
  @Schema(name = "creditorAccount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creditorAccount")
  public CashAccount getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(CashAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDebitOtpConfirmationRequest directDebitOtpConfirmationRequest = (DirectDebitOtpConfirmationRequest) o;
    return Objects.equals(this.mandateIdentification, directDebitOtpConfirmationRequest.mandateIdentification) &&
        Objects.equals(this.otpIdentificationNumber, directDebitOtpConfirmationRequest.otpIdentificationNumber) &&
        Objects.equals(this.otpPassword, directDebitOtpConfirmationRequest.otpPassword) &&
        Objects.equals(this.creditorAccount, directDebitOtpConfirmationRequest.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandateIdentification, otpIdentificationNumber, otpPassword, creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitOtpConfirmationRequest {\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    otpIdentificationNumber: ").append(toIndentedString(otpIdentificationNumber)).append("\n");
    sb.append("    otpPassword: ").append(toIndentedString(otpPassword)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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


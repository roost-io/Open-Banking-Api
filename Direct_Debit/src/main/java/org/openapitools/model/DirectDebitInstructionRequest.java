package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CashAccount;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Account summary for the customer, could be language specific
 */

@Schema(name = "directDebitInstructionRequest", description = "Account summary for the customer, could be language specific")
@JsonTypeName("directDebitInstructionRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:18.316995+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class DirectDebitInstructionRequest {

  private String merchantInstructionIdentification;

  private String mandateIdentification;

  private String debtorName;

  private CashAccount debtorAccount;

  private CashAccount creditorAccount;

  private String creditorReference;

  private String instructedAmountCurrency;

  private String instructedAmount;

  private String remittanceInformation;

  /**
   * User preferred language. This language will be used in SMS for communication.
   */
  public enum SmsLanguageCodeEnum {
    ENG("eng"),
    
    ZH_S("zh-s"),
    
    ZH_T("zh-t");

    private String value;

    SmsLanguageCodeEnum(String value) {
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
    public static SmsLanguageCodeEnum fromValue(String value) {
      for (SmsLanguageCodeEnum b : SmsLanguageCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SmsLanguageCodeEnum smsLanguageCode;

  public DirectDebitInstructionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DirectDebitInstructionRequest(String merchantInstructionIdentification, CashAccount creditorAccount, String instructedAmountCurrency, String instructedAmount) {
    this.merchantInstructionIdentification = merchantInstructionIdentification;
    this.creditorAccount = creditorAccount;
    this.instructedAmountCurrency = instructedAmountCurrency;
    this.instructedAmount = instructedAmount;
  }

  public DirectDebitInstructionRequest merchantInstructionIdentification(String merchantInstructionIdentification) {
    this.merchantInstructionIdentification = merchantInstructionIdentification;
    return this;
  }

  /**
   * Merchant Instruction Reference No. Unique instruction id generated by merchant.
   * @return merchantInstructionIdentification
  */
  @NotNull @Size(min = 1, max = 30) 
  @Schema(name = "merchantInstructionIdentification", description = "Merchant Instruction Reference No. Unique instruction id generated by merchant.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantInstructionIdentification")
  public String getMerchantInstructionIdentification() {
    return merchantInstructionIdentification;
  }

  public void setMerchantInstructionIdentification(String merchantInstructionIdentification) {
    this.merchantInstructionIdentification = merchantInstructionIdentification;
  }

  public DirectDebitInstructionRequest mandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

  /**
   * The reference uniquely identify the DDA mandate at the payee bank record. Mutually exclusive with \"DebtorAccount\" and \"CreditorReference\". MandateIdentification is mandatory only if the above are not provided.
   * @return mandateIdentification
  */
  @Size(max = 35) 
  @Schema(name = "mandateIdentification", description = "The reference uniquely identify the DDA mandate at the payee bank record. Mutually exclusive with \"DebtorAccount\" and \"CreditorReference\". MandateIdentification is mandatory only if the above are not provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mandateIdentification")
  public String getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public DirectDebitInstructionRequest debtorName(String debtorName) {
    this.debtorName = debtorName;
    return this;
  }

  /**
   * Debtor account owner name.
   * @return debtorName
  */
  @Size(min = 1, max = 140) 
  @Schema(name = "debtorName", description = "Debtor account owner name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debtorName")
  public String getDebtorName() {
    return debtorName;
  }

  public void setDebtorName(String debtorName) {
    this.debtorName = debtorName;
  }

  public DirectDebitInstructionRequest debtorAccount(CashAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  */
  @Valid 
  @Schema(name = "debtorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debtorAccount")
  public CashAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(CashAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public DirectDebitInstructionRequest creditorAccount(CashAccount creditorAccount) {
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

  public DirectDebitInstructionRequest creditorReference(String creditorReference) {
    this.creditorReference = creditorReference;
    return this;
  }

  /**
   * Creditor reference of the DDA. This CreditorReference will be sent to Payer Bank through FPS for record. Mutually exclusive with MandateIdentification. \"DebtorAccount\" and \"CreditorReference\" will be mandatory once field MandateIdentification is not provided.
   * @return creditorReference
  */
  @Size(max = 35) 
  @Schema(name = "creditorReference", description = "Creditor reference of the DDA. This CreditorReference will be sent to Payer Bank through FPS for record. Mutually exclusive with MandateIdentification. \"DebtorAccount\" and \"CreditorReference\" will be mandatory once field MandateIdentification is not provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditorReference")
  public String getCreditorReference() {
    return creditorReference;
  }

  public void setCreditorReference(String creditorReference) {
    this.creditorReference = creditorReference;
  }

  public DirectDebitInstructionRequest instructedAmountCurrency(String instructedAmountCurrency) {
    this.instructedAmountCurrency = instructedAmountCurrency;
    return this;
  }

  /**
   * Instructed amount currency.
   * @return instructedAmountCurrency
  */
  @NotNull @Pattern(regexp = "^[A-Z]{3,3}$") @Size(max = 3) 
  @Schema(name = "instructedAmountCurrency", description = "Instructed amount currency.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("instructedAmountCurrency")
  public String getInstructedAmountCurrency() {
    return instructedAmountCurrency;
  }

  public void setInstructedAmountCurrency(String instructedAmountCurrency) {
    this.instructedAmountCurrency = instructedAmountCurrency;
  }

  public DirectDebitInstructionRequest instructedAmount(String instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Instructed amount.
   * @return instructedAmount
  */
  @NotNull @Pattern(regexp = "^[0-9]{1,15}(\\.[0-9]{1,2}){0,1}$") @Size(max = 18) 
  @Schema(name = "instructedAmount", description = "Instructed amount.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("instructedAmount")
  public String getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(String instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public DirectDebitInstructionRequest remittanceInformation(String remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
    return this;
  }

  /**
   * Remittance information from payer.
   * @return remittanceInformation
  */
  @Size(max = 140) 
  @Schema(name = "remittanceInformation", description = "Remittance information from payer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remittanceInformation")
  public String getRemittanceInformation() {
    return remittanceInformation;
  }

  public void setRemittanceInformation(String remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
  }

  public DirectDebitInstructionRequest smsLanguageCode(SmsLanguageCodeEnum smsLanguageCode) {
    this.smsLanguageCode = smsLanguageCode;
    return this;
  }

  /**
   * User preferred language. This language will be used in SMS for communication.
   * @return smsLanguageCode
  */
  @Size(max = 10) 
  @Schema(name = "smsLanguageCode", description = "User preferred language. This language will be used in SMS for communication.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("smsLanguageCode")
  public SmsLanguageCodeEnum getSmsLanguageCode() {
    return smsLanguageCode;
  }

  public void setSmsLanguageCode(SmsLanguageCodeEnum smsLanguageCode) {
    this.smsLanguageCode = smsLanguageCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDebitInstructionRequest directDebitInstructionRequest = (DirectDebitInstructionRequest) o;
    return Objects.equals(this.merchantInstructionIdentification, directDebitInstructionRequest.merchantInstructionIdentification) &&
        Objects.equals(this.mandateIdentification, directDebitInstructionRequest.mandateIdentification) &&
        Objects.equals(this.debtorName, directDebitInstructionRequest.debtorName) &&
        Objects.equals(this.debtorAccount, directDebitInstructionRequest.debtorAccount) &&
        Objects.equals(this.creditorAccount, directDebitInstructionRequest.creditorAccount) &&
        Objects.equals(this.creditorReference, directDebitInstructionRequest.creditorReference) &&
        Objects.equals(this.instructedAmountCurrency, directDebitInstructionRequest.instructedAmountCurrency) &&
        Objects.equals(this.instructedAmount, directDebitInstructionRequest.instructedAmount) &&
        Objects.equals(this.remittanceInformation, directDebitInstructionRequest.remittanceInformation) &&
        Objects.equals(this.smsLanguageCode, directDebitInstructionRequest.smsLanguageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantInstructionIdentification, mandateIdentification, debtorName, debtorAccount, creditorAccount, creditorReference, instructedAmountCurrency, instructedAmount, remittanceInformation, smsLanguageCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitInstructionRequest {\n");
    sb.append("    merchantInstructionIdentification: ").append(toIndentedString(merchantInstructionIdentification)).append("\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    debtorName: ").append(toIndentedString(debtorName)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorReference: ").append(toIndentedString(creditorReference)).append("\n");
    sb.append("    instructedAmountCurrency: ").append(toIndentedString(instructedAmountCurrency)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
    sb.append("    smsLanguageCode: ").append(toIndentedString(smsLanguageCode)).append("\n");
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


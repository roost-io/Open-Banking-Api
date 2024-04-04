package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CashAccount
 */

@JsonTypeName("cashAccount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:18.316995+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class CashAccount {

  private String bankCode;

  private String accountIdentification;

  private String currency;

  /**
   * Scheme code.If not provided \\BBAN\\ will be the default value.
   */
  public enum AccountSchemeNameEnum {
    BBAN("BBAN");

    private String value;

    AccountSchemeNameEnum(String value) {
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
    public static AccountSchemeNameEnum fromValue(String value) {
      for (AccountSchemeNameEnum b : AccountSchemeNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AccountSchemeNameEnum accountSchemeName;

  private String accountSubType;

  public CashAccount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CashAccount(String bankCode, String accountIdentification, String currency) {
    this.bankCode = bankCode;
    this.accountIdentification = accountIdentification;
    this.currency = currency;
  }

  public CashAccount bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * Bank Code.
   * @return bankCode
  */
  @NotNull @Pattern(regexp = "^[0-9]{3,3}") @Size(max = 3) 
  @Schema(name = "bankCode", description = "Bank Code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bankCode")
  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public CashAccount accountIdentification(String accountIdentification) {
    this.accountIdentification = accountIdentification;
    return this;
  }

  /**
   * Account number / Schema ID.No hyphen full stop nor special character.
   * @return accountIdentification
  */
  @NotNull @Pattern(regexp = "^[a-zA-Z0-9]{1,35}") @Size(min = 1, max = 35) 
  @Schema(name = "accountIdentification", description = "Account number / Schema ID.No hyphen full stop nor special character.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accountIdentification")
  public String getAccountIdentification() {
    return accountIdentification;
  }

  public void setAccountIdentification(String accountIdentification) {
    this.accountIdentification = accountIdentification;
  }

  public CashAccount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Account currency.
   * @return currency
  */
  @NotNull @Pattern(regexp = "^[A-Z]{3,3}") @Size(max = 3) 
  @Schema(name = "currency", description = "Account currency.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CashAccount accountSchemeName(AccountSchemeNameEnum accountSchemeName) {
    this.accountSchemeName = accountSchemeName;
    return this;
  }

  /**
   * Scheme code.If not provided \\BBAN\\ will be the default value.
   * @return accountSchemeName
  */
  @Size(max = 4) 
  @Schema(name = "accountSchemeName", description = "Scheme code.If not provided \\BBAN\\ will be the default value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountSchemeName")
  public AccountSchemeNameEnum getAccountSchemeName() {
    return accountSchemeName;
  }

  public void setAccountSchemeName(AccountSchemeNameEnum accountSchemeName) {
    this.accountSchemeName = accountSchemeName;
  }

  public CashAccount accountSubType(String accountSubType) {
    this.accountSubType = accountSubType;
    return this;
  }

  /**
   * Specifies the sub type of account (product family group). Channel specific description. This is the field where the response for cashAccountType field will be mapped as per STET standard . For greece and Malta, this field will be used to map the product category code
   * @return accountSubType
  */
  @Size(max = 35) 
  @Schema(name = "accountSubType", example = "Current Account, Savings Account, Student Account, CACC, CARD, DDA – Current & Savings Accounts or CDA – Term Deposits or ILA – Loans or CCA – Credit Cards or OTH - Other", description = "Specifies the sub type of account (product family group). Channel specific description. This is the field where the response for cashAccountType field will be mapped as per STET standard . For greece and Malta, this field will be used to map the product category code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountSubType")
  public String getAccountSubType() {
    return accountSubType;
  }

  public void setAccountSubType(String accountSubType) {
    this.accountSubType = accountSubType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashAccount cashAccount = (CashAccount) o;
    return Objects.equals(this.bankCode, cashAccount.bankCode) &&
        Objects.equals(this.accountIdentification, cashAccount.accountIdentification) &&
        Objects.equals(this.currency, cashAccount.currency) &&
        Objects.equals(this.accountSchemeName, cashAccount.accountSchemeName) &&
        Objects.equals(this.accountSubType, cashAccount.accountSubType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankCode, accountIdentification, currency, accountSchemeName, accountSubType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashAccount {\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    accountIdentification: ").append(toIndentedString(accountIdentification)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountSchemeName: ").append(toIndentedString(accountSchemeName)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
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


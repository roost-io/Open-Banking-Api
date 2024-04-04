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
 * Object to hold details required to fetch direct debit authorisation status
 */

@Schema(name = "directDebitAuthStatusRequest", description = "Object to hold details required to fetch direct debit authorisation status")
@JsonTypeName("directDebitAuthStatusRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:32:56.573489+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class DirectDebitAuthStatusRequest {

  private String merchantRequestIdentification;

  private CashAccount creditorAccount;

  public DirectDebitAuthStatusRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DirectDebitAuthStatusRequest(String merchantRequestIdentification, CashAccount creditorAccount) {
    this.merchantRequestIdentification = merchantRequestIdentification;
    this.creditorAccount = creditorAccount;
  }

  public DirectDebitAuthStatusRequest merchantRequestIdentification(String merchantRequestIdentification) {
    this.merchantRequestIdentification = merchantRequestIdentification;
    return this;
  }

  /**
   * Merchant Request Reference No. Unique instruction id generated by merchant.
   * @return merchantRequestIdentification
  */
  @NotNull @Size(min = 1, max = 30) 
  @Schema(name = "merchantRequestIdentification", description = "Merchant Request Reference No. Unique instruction id generated by merchant.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantRequestIdentification")
  public String getMerchantRequestIdentification() {
    return merchantRequestIdentification;
  }

  public void setMerchantRequestIdentification(String merchantRequestIdentification) {
    this.merchantRequestIdentification = merchantRequestIdentification;
  }

  public DirectDebitAuthStatusRequest creditorAccount(CashAccount creditorAccount) {
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
    DirectDebitAuthStatusRequest directDebitAuthStatusRequest = (DirectDebitAuthStatusRequest) o;
    return Objects.equals(this.merchantRequestIdentification, directDebitAuthStatusRequest.merchantRequestIdentification) &&
        Objects.equals(this.creditorAccount, directDebitAuthStatusRequest.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantRequestIdentification, creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitAuthStatusRequest {\n");
    sb.append("    merchantRequestIdentification: ").append(toIndentedString(merchantRequestIdentification)).append("\n");
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


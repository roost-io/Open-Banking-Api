package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.BalanceTypeCode;
import org.openapitools.model.CreditDebitCode;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Provides further details on an entry in the report.
 */

@Schema(name = "BalanceData", description = "Provides further details on an entry in the report.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:00.174725+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class BalanceData {

  private BalanceTypeCode type;

  private CreditDebitCode creditDebitIndicator;

  private String amount;

  private String currency;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime datetime;

  public BalanceData type(BalanceTypeCode type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public BalanceTypeCode getType() {
    return type;
  }

  public void setType(BalanceTypeCode type) {
    this.type = type;
  }

  public BalanceData creditDebitIndicator(CreditDebitCode creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  */
  @Valid 
  @Schema(name = "creditDebitIndicator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditDebitIndicator")
  public CreditDebitCode getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public BalanceData amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
   * @return amount
  */
  @Pattern(regexp = "^\\d{1,13}$|^\\d{1,13}\\.\\d{1,5}$") 
  @Schema(name = "amount", description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public BalanceData currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @Pattern(regexp = "^[A-Z]{3,3}$") 
  @Schema(name = "currency", example = "HKD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BalanceData datetime(OffsetDateTime datetime) {
    this.datetime = datetime;
    return this;
  }

  /**
   * Specifies the date and time of the account balance.
   * @return datetime
  */
  @Valid 
  @Schema(name = "datetime", description = "Specifies the date and time of the account balance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datetime")
  public OffsetDateTime getDatetime() {
    return datetime;
  }

  public void setDatetime(OffsetDateTime datetime) {
    this.datetime = datetime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceData balanceData = (BalanceData) o;
    return Objects.equals(this.type, balanceData.type) &&
        Objects.equals(this.creditDebitIndicator, balanceData.creditDebitIndicator) &&
        Objects.equals(this.amount, balanceData.amount) &&
        Objects.equals(this.currency, balanceData.currency) &&
        Objects.equals(this.datetime, balanceData.datetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, creditDebitIndicator, amount, currency, datetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceData {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
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


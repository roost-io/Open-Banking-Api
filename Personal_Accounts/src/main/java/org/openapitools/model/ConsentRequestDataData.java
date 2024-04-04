package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ExternalPermissionCode;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConsentRequestDataData
 */

@JsonTypeName("ConsentRequestData_data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:00.174725+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class ConsentRequestDataData {

  @Valid
  private List<ExternalPermissionCode> permissions = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expirationDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime transactionFromDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime transactionToDate;

  public ConsentRequestDataData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConsentRequestDataData(List<ExternalPermissionCode> permissions) {
    this.permissions = permissions;
  }

  public ConsentRequestDataData permissions(List<ExternalPermissionCode> permissions) {
    this.permissions = permissions;
    return this;
  }

  public ConsentRequestDataData addPermissionsItem(ExternalPermissionCode permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("permissions")
  public List<ExternalPermissionCode> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<ExternalPermissionCode> permissions) {
    this.permissions = permissions;
  }

  public ConsentRequestDataData expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format. All date-time fields in responses must include the timezone. An example is below: 2017-04-05T00:07:00Z
   * @return expirationDate
  */
  @Valid 
  @Schema(name = "expirationDate", description = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format. All date-time fields in responses must include the timezone. An example is below: 2017-04-05T00:07:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public ConsentRequestDataData transactionFromDate(OffsetDateTime transactionFromDate) {
    this.transactionFromDate = transactionFromDate;
    return this;
  }

  /**
   * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format. All date-time fields in responses must include the timezone. An example is below: 2017-04-05T00:07:00Z
   * @return transactionFromDate
  */
  @Valid 
  @Schema(name = "transactionFromDate", description = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format. All date-time fields in responses must include the timezone. An example is below: 2017-04-05T00:07:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionFromDate")
  public OffsetDateTime getTransactionFromDate() {
    return transactionFromDate;
  }

  public void setTransactionFromDate(OffsetDateTime transactionFromDate) {
    this.transactionFromDate = transactionFromDate;
  }

  public ConsentRequestDataData transactionToDate(OffsetDateTime transactionToDate) {
    this.transactionToDate = transactionToDate;
    return this;
  }

  /**
   * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format. All date-time fields in responses must include the timezone. An example is below: 2017-04-05T00:07:00Z
   * @return transactionToDate
  */
  @Valid 
  @Schema(name = "transactionToDate", description = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format. All date-time fields in responses must include the timezone. An example is below: 2017-04-05T00:07:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionToDate")
  public OffsetDateTime getTransactionToDate() {
    return transactionToDate;
  }

  public void setTransactionToDate(OffsetDateTime transactionToDate) {
    this.transactionToDate = transactionToDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequestDataData consentRequestDataData = (ConsentRequestDataData) o;
    return Objects.equals(this.permissions, consentRequestDataData.permissions) &&
        Objects.equals(this.expirationDate, consentRequestDataData.expirationDate) &&
        Objects.equals(this.transactionFromDate, consentRequestDataData.transactionFromDate) &&
        Objects.equals(this.transactionToDate, consentRequestDataData.transactionToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, expirationDate, transactionFromDate, transactionToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRequestDataData {\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    transactionFromDate: ").append(toIndentedString(transactionFromDate)).append("\n");
    sb.append("    transactionToDate: ").append(toIndentedString(transactionToDate)).append("\n");
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


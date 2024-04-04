package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConsentStatusCode;
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
 * AccountConsentsResponseData
 */

@JsonTypeName("AccountConsentsResponse_data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:00.174725+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AccountConsentsResponseData {

  private String consentId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDate;

  private ConsentStatusCode status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime statusUpdateDate;

  @Valid
  private List<ExternalPermissionCode> permissions = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expirationDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime transactionFromDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime transactionToDate;

  public AccountConsentsResponseData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccountConsentsResponseData(String consentId, OffsetDateTime creationDate, ConsentStatusCode status, OffsetDateTime statusUpdateDate, List<ExternalPermissionCode> permissions) {
    this.consentId = consentId;
    this.creationDate = creationDate;
    this.status = status;
    this.statusUpdateDate = statusUpdateDate;
    this.permissions = permissions;
  }

  public AccountConsentsResponseData consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Unique identification as assigned to identify the account access consent resource.
   * @return consentId
  */
  @NotNull @Size(min = 1, max = 128) 
  @Schema(name = "consentId", description = "Unique identification as assigned to identify the account access consent resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("consentId")
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public AccountConsentsResponseData creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.All date-time fields in responses must include the timezone. An example is below: 2017-04-05T00:07:00Z
   * @return creationDate
  */
  @NotNull @Valid 
  @Schema(name = "creationDate", description = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.All date-time fields in responses must include the timezone. An example is below: 2017-04-05T00:07:00Z", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creationDate")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public AccountConsentsResponseData status(ConsentStatusCode status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public ConsentStatusCode getStatus() {
    return status;
  }

  public void setStatus(ConsentStatusCode status) {
    this.status = status;
  }

  public AccountConsentsResponseData statusUpdateDate(OffsetDateTime statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
    return this;
  }

  /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format. All date-time fields in responses must include the timezone. An example is below: 2017-04-05T00:07:00Z
   * @return statusUpdateDate
  */
  @NotNull @Valid 
  @Schema(name = "statusUpdateDate", description = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format. All date-time fields in responses must include the timezone. An example is below: 2017-04-05T00:07:00Z", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statusUpdateDate")
  public OffsetDateTime getStatusUpdateDate() {
    return statusUpdateDate;
  }

  public void setStatusUpdateDate(OffsetDateTime statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
  }

  public AccountConsentsResponseData permissions(List<ExternalPermissionCode> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AccountConsentsResponseData addPermissionsItem(ExternalPermissionCode permissionsItem) {
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

  public AccountConsentsResponseData expirationDate(OffsetDateTime expirationDate) {
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

  public AccountConsentsResponseData transactionFromDate(OffsetDateTime transactionFromDate) {
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

  public AccountConsentsResponseData transactionToDate(OffsetDateTime transactionToDate) {
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
    AccountConsentsResponseData accountConsentsResponseData = (AccountConsentsResponseData) o;
    return Objects.equals(this.consentId, accountConsentsResponseData.consentId) &&
        Objects.equals(this.creationDate, accountConsentsResponseData.creationDate) &&
        Objects.equals(this.status, accountConsentsResponseData.status) &&
        Objects.equals(this.statusUpdateDate, accountConsentsResponseData.statusUpdateDate) &&
        Objects.equals(this.permissions, accountConsentsResponseData.permissions) &&
        Objects.equals(this.expirationDate, accountConsentsResponseData.expirationDate) &&
        Objects.equals(this.transactionFromDate, accountConsentsResponseData.transactionFromDate) &&
        Objects.equals(this.transactionToDate, accountConsentsResponseData.transactionToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, creationDate, status, statusUpdateDate, permissions, expirationDate, transactionFromDate, transactionToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountConsentsResponseData {\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDate: ").append(toIndentedString(statusUpdateDate)).append("\n");
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


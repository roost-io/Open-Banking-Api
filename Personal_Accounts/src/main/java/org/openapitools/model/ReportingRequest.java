package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.model.CashAccount;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReportingRequest
 */

@JsonTypeName("reportingRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:32:56.573489+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class ReportingRequest {

  /**
   * Type of report.
   */
  public enum ReportTypeEnum {
    DDAREPORT("DDAReport"),
    
    DDIREPORT("DDIReport");

    private String value;

    ReportTypeEnum(String value) {
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
    public static ReportTypeEnum fromValue(String value) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReportTypeEnum reportType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate reportingDate;

  private CashAccount creditorAccount;

  public ReportingRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReportingRequest(ReportTypeEnum reportType, LocalDate reportingDate, CashAccount creditorAccount) {
    this.reportType = reportType;
    this.reportingDate = reportingDate;
    this.creditorAccount = creditorAccount;
  }

  public ReportingRequest reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * Type of report.
   * @return reportType
  */
  @NotNull @Size(max = 10) 
  @Schema(name = "reportType", description = "Type of report.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reportType")
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public ReportingRequest reportingDate(LocalDate reportingDate) {
    this.reportingDate = reportingDate;
    return this;
  }

  /**
   * Date of report.
   * @return reportingDate
  */
  @NotNull @Valid 
  @Schema(name = "reportingDate", description = "Date of report.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reportingDate")
  public LocalDate getReportingDate() {
    return reportingDate;
  }

  public void setReportingDate(LocalDate reportingDate) {
    this.reportingDate = reportingDate;
  }

  public ReportingRequest creditorAccount(CashAccount creditorAccount) {
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
    ReportingRequest reportingRequest = (ReportingRequest) o;
    return Objects.equals(this.reportType, reportingRequest.reportType) &&
        Objects.equals(this.reportingDate, reportingRequest.reportingDate) &&
        Objects.equals(this.creditorAccount, reportingRequest.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, reportingDate, creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingRequest {\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    reportingDate: ").append(toIndentedString(reportingDate)).append("\n");
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


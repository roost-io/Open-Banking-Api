package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Occurrences
 */

@JsonTypeName("occurrences")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:32:56.573489+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class Occurrences {

  /**
   * Frequency type
   */
  public enum FrequencyTypeEnum {
    MNTH("MNTH"),
    
    ADHO("ADHO");

    private String value;

    FrequencyTypeEnum(String value) {
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
    public static FrequencyTypeEnum fromValue(String value) {
      for (FrequencyTypeEnum b : FrequencyTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FrequencyTypeEnum frequencyType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate durationFromDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate durationToDate;

  public Occurrences() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Occurrences(FrequencyTypeEnum frequencyType, LocalDate durationToDate) {
    this.frequencyType = frequencyType;
    this.durationToDate = durationToDate;
  }

  public Occurrences frequencyType(FrequencyTypeEnum frequencyType) {
    this.frequencyType = frequencyType;
    return this;
  }

  /**
   * Frequency type
   * @return frequencyType
  */
  @NotNull @Size(max = 4) 
  @Schema(name = "frequencyType", description = "Frequency type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("frequencyType")
  public FrequencyTypeEnum getFrequencyType() {
    return frequencyType;
  }

  public void setFrequencyType(FrequencyTypeEnum frequencyType) {
    this.frequencyType = frequencyType;
  }

  public Occurrences durationFromDate(LocalDate durationFromDate) {
    this.durationFromDate = durationFromDate;
    return this;
  }

  /**
   * From Date (aka effective date).Always null
   * @return durationFromDate
  */
  @Valid 
  @Schema(name = "durationFromDate", description = "From Date (aka effective date).Always null", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationFromDate")
  public LocalDate getDurationFromDate() {
    return durationFromDate;
  }

  public void setDurationFromDate(LocalDate durationFromDate) {
    this.durationFromDate = durationFromDate;
  }

  public Occurrences durationToDate(LocalDate durationToDate) {
    this.durationToDate = durationToDate;
    return this;
  }

  /**
   * To Date (aka expiry date).Date this registration will be expired.Value must be \\\"9999-12-31\\\" if never expired.
   * @return durationToDate
  */
  @NotNull @Valid 
  @Schema(name = "durationToDate", description = "To Date (aka expiry date).Date this registration will be expired.Value must be \\\"9999-12-31\\\" if never expired.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("durationToDate")
  public LocalDate getDurationToDate() {
    return durationToDate;
  }

  public void setDurationToDate(LocalDate durationToDate) {
    this.durationToDate = durationToDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Occurrences occurrences = (Occurrences) o;
    return Objects.equals(this.frequencyType, occurrences.frequencyType) &&
        Objects.equals(this.durationFromDate, occurrences.durationFromDate) &&
        Objects.equals(this.durationToDate, occurrences.durationToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyType, durationFromDate, durationToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Occurrences {\n");
    sb.append("    frequencyType: ").append(toIndentedString(frequencyType)).append("\n");
    sb.append("    durationFromDate: ").append(toIndentedString(durationFromDate)).append("\n");
    sb.append("    durationToDate: ").append(toIndentedString(durationToDate)).append("\n");
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


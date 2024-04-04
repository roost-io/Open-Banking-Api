package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.HKError1ExtendedDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * HKError1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:18.316995+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class HKError1 {

  private String code;

  private String causes;

  private HKError1ExtendedDetails extendedDetails;

  public HKError1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HKError1(String code, String causes) {
    this.code = code;
    this.causes = causes;
  }

  public HKError1 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Low level textual error code, e.g., HK.HKMA.Field.Missing
   * @return code
  */
  @NotNull 
  @Schema(name = "code", description = "Low level textual error code, e.g., HK.HKMA.Field.Missing", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public HKError1 causes(String causes) {
    this.causes = causes;
    return this;
  }

  /**
   * A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future' HKMA doesn't standardise this field
   * @return causes
  */
  @NotNull @Size(min = 1, max = 500) 
  @Schema(name = "causes", description = "A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future' HKMA doesn't standardise this field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("causes")
  public String getCauses() {
    return causes;
  }

  public void setCauses(String causes) {
    this.causes = causes;
  }

  public HKError1 extendedDetails(HKError1ExtendedDetails extendedDetails) {
    this.extendedDetails = extendedDetails;
    return this;
  }

  /**
   * Get extendedDetails
   * @return extendedDetails
  */
  @Valid 
  @Schema(name = "extendedDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extendedDetails")
  public HKError1ExtendedDetails getExtendedDetails() {
    return extendedDetails;
  }

  public void setExtendedDetails(HKError1ExtendedDetails extendedDetails) {
    this.extendedDetails = extendedDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HKError1 hkError1 = (HKError1) o;
    return Objects.equals(this.code, hkError1.code) &&
        Objects.equals(this.causes, hkError1.causes) &&
        Objects.equals(this.extendedDetails, hkError1.extendedDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, causes, extendedDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HKError1 {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    causes: ").append(toIndentedString(causes)).append("\n");
    sb.append("    extendedDetails: ").append(toIndentedString(extendedDetails)).append("\n");
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


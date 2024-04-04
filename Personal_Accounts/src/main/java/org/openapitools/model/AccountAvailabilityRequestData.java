package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ParamName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccountAvailabilityRequestData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:00.174725+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AccountAvailabilityRequestData {

  private ParamName paramName;

  private String paramValue;

  public AccountAvailabilityRequestData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccountAvailabilityRequestData(ParamName paramName) {
    this.paramName = paramName;
  }

  public AccountAvailabilityRequestData paramName(ParamName paramName) {
    this.paramName = paramName;
    return this;
  }

  /**
   * Get paramName
   * @return paramName
  */
  @NotNull @Valid 
  @Schema(name = "paramName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paramName")
  public ParamName getParamName() {
    return paramName;
  }

  public void setParamName(ParamName paramName) {
    this.paramName = paramName;
  }

  public AccountAvailabilityRequestData paramValue(String paramValue) {
    this.paramValue = paramValue;
    return this;
  }

  /**
   * <p>&nbsp;</p> <p>Generic validation rules:</p> <ul>   <li>The comparison at source is case-insensitive.</li>   <li>The parameter value will be checked at source, if it matches then response will be 'Yes'. If a blank value is passed, a 'No' response should be expected where the bank has an existing value.</li> </ul> <p><b>HKID</b> validation rules:</p> <ul>   <li>     All non-alphanumeric characters are removed from the record retrieved from the source within the banking system      before conducting the comparison with the value from the request.   </li>   <li>The value can have minimum 4 non-masked characters. This means, it's at the discretion of the API consumer to send a clear text value in full or apply masking.</li>   <li>Each TPP can mask randomly different set of characters.</li> </ul> <p><b>Travel Document Number</b> validation rules:</p> <ul>   <li>     All non-alphanumeric characters are removed from the record retrieved from the source within the banking system      before conducting the comparison with the value from the request.   </li>   <li>Any travel document is accepted except HKID. For instance Passport, China National ID, etc. are accepted.</li>   <li>     At least half the length of the value should be in clear text. For instance      a passport number with length of 12 characters will require minimum 6 non-masked characters, ie. A**2**86*53*.      This means, it's at the discretion of the API consumer to send a clear text value in full or apply masking.   </li>   <li>Each TPP can mask randomly different set of characters.</li> </ul> <p><b>First Name</b> and <b>Last Name</b> validation rules:</p> <ul>   <li>Character allowed are alphanumeric and punctuation ,. ; : / \\ < > ? ! + - * = | “ # ‘ ( ^ { } ) _  ¨ [ ] ´ ‘ % & space.</li>   <li>     Only characters from UTF-8 set are supported. Names that use Unicode characters (like Chinese etc.) is not supported yet.      If a Unicode character is used, the request is still valid, in which case the API will respond with 'No'.   </li>   <li>     If data stored at source within the banking system has more than one space between each word, before validation is applied,      the redundant space characters are removed from the source so that only a single space is left between words, then      the validation is applied against the value from the request.     For instance if data stored within the bank is 'TAI&nbsp;&nbsp;MAN' (two spaces between TAI and MAN), after      redundant space is removed the value used to compare with is 'TAI MAN' (one space between TAI and MAN).   </li> </ul> 
   * @return paramValue
  */
  
  @Schema(name = "paramValue", example = "Personal", description = "<p>&nbsp;</p> <p>Generic validation rules:</p> <ul>   <li>The comparison at source is case-insensitive.</li>   <li>The parameter value will be checked at source, if it matches then response will be 'Yes'. If a blank value is passed, a 'No' response should be expected where the bank has an existing value.</li> </ul> <p><b>HKID</b> validation rules:</p> <ul>   <li>     All non-alphanumeric characters are removed from the record retrieved from the source within the banking system      before conducting the comparison with the value from the request.   </li>   <li>The value can have minimum 4 non-masked characters. This means, it's at the discretion of the API consumer to send a clear text value in full or apply masking.</li>   <li>Each TPP can mask randomly different set of characters.</li> </ul> <p><b>Travel Document Number</b> validation rules:</p> <ul>   <li>     All non-alphanumeric characters are removed from the record retrieved from the source within the banking system      before conducting the comparison with the value from the request.   </li>   <li>Any travel document is accepted except HKID. For instance Passport, China National ID, etc. are accepted.</li>   <li>     At least half the length of the value should be in clear text. For instance      a passport number with length of 12 characters will require minimum 6 non-masked characters, ie. A**2**86*53*.      This means, it's at the discretion of the API consumer to send a clear text value in full or apply masking.   </li>   <li>Each TPP can mask randomly different set of characters.</li> </ul> <p><b>First Name</b> and <b>Last Name</b> validation rules:</p> <ul>   <li>Character allowed are alphanumeric and punctuation ,. ; : / \\ < > ? ! + - * = | “ # ‘ ( ^ { } ) _  ¨ [ ] ´ ‘ % & space.</li>   <li>     Only characters from UTF-8 set are supported. Names that use Unicode characters (like Chinese etc.) is not supported yet.      If a Unicode character is used, the request is still valid, in which case the API will respond with 'No'.   </li>   <li>     If data stored at source within the banking system has more than one space between each word, before validation is applied,      the redundant space characters are removed from the source so that only a single space is left between words, then      the validation is applied against the value from the request.     For instance if data stored within the bank is 'TAI&nbsp;&nbsp;MAN' (two spaces between TAI and MAN), after      redundant space is removed the value used to compare with is 'TAI MAN' (one space between TAI and MAN).   </li> </ul> ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paramValue")
  public String getParamValue() {
    return paramValue;
  }

  public void setParamValue(String paramValue) {
    this.paramValue = paramValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAvailabilityRequestData accountAvailabilityRequestData = (AccountAvailabilityRequestData) o;
    return Objects.equals(this.paramName, accountAvailabilityRequestData.paramName) &&
        Objects.equals(this.paramValue, accountAvailabilityRequestData.paramValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramName, paramValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAvailabilityRequestData {\n");
    sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
    sb.append("    paramValue: ").append(toIndentedString(paramValue)).append("\n");
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


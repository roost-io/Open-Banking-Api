package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates whether the amount is a credit or a debit. Usage: A zero amount is considered to be a credit amount.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:00.174725+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public enum CreditDebitCode {
  
  CREDIT("Credit"),
  
  DEBIT("Debit");

  private String value;

  CreditDebitCode(String value) {
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
  public static CreditDebitCode fromValue(String value) {
    for (CreditDebitCode b : CreditDebitCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


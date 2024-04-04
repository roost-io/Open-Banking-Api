package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Links relevant to the payload
 */

@Schema(name = "Links", description = "Links relevant to the payload")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:18.316995+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class Links {

  private URI self;

  private URI prev;

  private URI next;

  public Links() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Links(URI self) {
    this.self = self;
  }

  public Links self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  @NotNull @Valid 
  @Schema(name = "self", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public Links prev(URI prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * @return prev
  */
  @Valid 
  @Schema(name = "prev", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prev")
  public URI getPrev() {
    return prev;
  }

  public void setPrev(URI prev) {
    this.prev = prev;
  }

  public Links next(URI next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  */
  @Valid 
  @Schema(name = "next", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next")
  public URI getNext() {
    return next;
  }

  public void setNext(URI next) {
    this.next = next;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.self, links.self) &&
        Objects.equals(this.prev, links.prev) &&
        Objects.equals(this.next, links.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, prev, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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


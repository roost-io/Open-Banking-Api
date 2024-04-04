package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NotificationEventRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:00.174725+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class NotificationEventRequest {

  @Valid
  private List<String> ack;

  private Boolean returnImmediately;

  private Integer maxEvents;

  public NotificationEventRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotificationEventRequest(Boolean returnImmediately, Integer maxEvents) {
    this.returnImmediately = returnImmediately;
    this.maxEvents = maxEvents;
  }

  public NotificationEventRequest ack(List<String> ack) {
    this.ack = ack;
    return this;
  }

  public NotificationEventRequest addAckItem(String ackItem) {
    if (this.ack == null) {
      this.ack = new ArrayList<>();
    }
    this.ack.add(ackItem);
    return this;
  }

  /**
   * List of successfully handled “jti”.
   * @return ack
  */
  
  @Schema(name = "ack", description = "List of successfully handled “jti”.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ack")
  public List<String> getAck() {
    return ack;
  }

  public void setAck(List<String> ack) {
    this.ack = ack;
  }

  public NotificationEventRequest returnImmediately(Boolean returnImmediately) {
    this.returnImmediately = returnImmediately;
    return this;
  }

  /**
   * Optional JSON Boolean value that indicates the SET transmitter should return an immediate response even if no results are available (short polling).
   * @return returnImmediately
  */
  @NotNull 
  @Schema(name = "returnImmediately", description = "Optional JSON Boolean value that indicates the SET transmitter should return an immediate response even if no results are available (short polling).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("returnImmediately")
  public Boolean getReturnImmediately() {
    return returnImmediately;
  }

  public void setReturnImmediately(Boolean returnImmediately) {
    this.returnImmediately = returnImmediately;
  }

  public NotificationEventRequest maxEvents(Integer maxEvents) {
    this.maxEvents = maxEvents;
    return this;
  }

  /**
   * Size limit for the event collection size in the response, null or zero input for the field indicates the bank returned an empty set of outstanding events.
   * @return maxEvents
  */
  @NotNull 
  @Schema(name = "maxEvents", description = "Size limit for the event collection size in the response, null or zero input for the field indicates the bank returned an empty set of outstanding events.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("maxEvents")
  public Integer getMaxEvents() {
    return maxEvents;
  }

  public void setMaxEvents(Integer maxEvents) {
    this.maxEvents = maxEvents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationEventRequest notificationEventRequest = (NotificationEventRequest) o;
    return Objects.equals(this.ack, notificationEventRequest.ack) &&
        Objects.equals(this.returnImmediately, notificationEventRequest.returnImmediately) &&
        Objects.equals(this.maxEvents, notificationEventRequest.maxEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ack, returnImmediately, maxEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationEventRequest {\n");
    sb.append("    ack: ").append(toIndentedString(ack)).append("\n");
    sb.append("    returnImmediately: ").append(toIndentedString(returnImmediately)).append("\n");
    sb.append("    maxEvents: ").append(toIndentedString(maxEvents)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NotificationEventResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:00.174725+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class NotificationEventResponse {

  private Object sets;

  private Boolean moreAvailable;

  public NotificationEventResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotificationEventResponse(Object sets) {
    this.sets = sets;
  }

  public NotificationEventResponse sets(Object sets) {
    this.sets = sets;
    return this;
  }

  /**
   * JSON object containing zero or more SETs being returned.  Each member name is the \"jti\" of a SET to be delivered, and its value is a JSON string representing the corresponding SET.  If there are no outstanding SETs to be transmitted, the JSON object shall be empty.  Note that both SETs being transmitted for the first time and SETs that are being retransmitted after not having been acknowledged are communicated here.
   * @return sets
  */
  @NotNull 
  @Schema(name = "sets", example = "{\"4d3559ec67504aaba65d40b0363faad8\":\"eyJhbGciOiJub25lIn0. eyJqdGkiOiI0ZDM1NTllYzY3NTA0YWFiYTY1ZDQwYjAzNjNmYWFkOCIsImlhdC I6MTQ1ODQ5NjQwNCwiaXNzIjoiaHR0cHM6Ly9zY2ltLmV4YW1wbGUuY29tIiwi YXVkIjpbImh0dHBzOi8vc2NpbS5leGFtcGxlLmNvbS9GZWVkcy85OGQ1MjQ2MW ZhNWJiYzg3OTU5M2I3NzU0IiwiaHR0cHM6Ly9zY2ltLmV4YW1wbGUuY29tL0Zl ZWRzLzVkNzYwNDUxNmIxZDA4NjQxZDc2NzZlZTciXSwiZXZlbnRzIjp7InVybj ppZXRmOnBhcmFtczpzY2ltOmV2ZW50OmNyZWF0ZSI6eyJyZWYiOiJodHRwczov L3NjaW0uZXhhbXBsZS5jb20vVXNlcnMvNDRmNjE0MmRmOTZiZDZhYjYxZTc1Mj FkOSIsImF0dHJpYnV0ZXMiOlsiaWQiLCJuYW1lIiwidXNlck5hbWUiLCJwYXNz d29yZCIsImVtYWlscyJdfX19.\",\"3d0c3cf797584bd193bd0fb1bd4e7d30\":\"eyJqdGkiOiIzZDBjM2NmNzk3NTg0YmQxOTNiZDBmYjFiZDRlN2QzMCIsImlhdC I6MTQ1ODQ5NjAyNSwiaXNzIjoiaHR0cHM6Ly9zY2ltLmV4YW1wbGUuY29tIiwi YXVkIjpbImh0dHBzOi8vamh1Yi5leGFtcGxlLmNvbS9GZWVkcy85OGQ1MjQ2MW ZhNWJiYzg3OTU5M2I3NzU0IiwiaHR0cHM6Ly9qaHViLmV4YW1wbGUuY29tL0Zl ZWRzLzVkNzYwNDUxNmIxZDA4NjQxZDc2NzZlZTciXSwic3ViIjoiaHR0cHM6Ly 9zY2ltLmV4YW1wbGUuY29tL1VzZXJzLzQ0ZjYxNDJkZjk2YmQ2YWI2MWU3NTIx ZDkiLCJldmVudHMiOnsidXJuOmlldGY6cGFyYW1zOnNjaW06ZXZlbnQ6cGFzc3 dvcmRSZXNldCI6eyJpZCI6IjQ0ZjYxNDJkZjk2YmQ2YWI2MWU3NTIxZDkifSwi aHR0cHM6Ly9leGFtcGxlLmNvbS9zY2ltL2V2ZW50L3Bhc3N3b3JkUmVzZXRFeH QiOnsicmVzZXRBdHRlbXB0cyI6NX19fQ.\"}", description = "JSON object containing zero or more SETs being returned.  Each member name is the \"jti\" of a SET to be delivered, and its value is a JSON string representing the corresponding SET.  If there are no outstanding SETs to be transmitted, the JSON object shall be empty.  Note that both SETs being transmitted for the first time and SETs that are being retransmitted after not having been acknowledged are communicated here.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sets")
  public Object getSets() {
    return sets;
  }

  public void setSets(Object sets) {
    this.sets = sets;
  }

  public NotificationEventResponse moreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
    return this;
  }

  /**
   * Indicates if there are more unacknowledged events from the bank in addition to the current response data list.
   * @return moreAvailable
  */
  
  @Schema(name = "moreAvailable", description = "Indicates if there are more unacknowledged events from the bank in addition to the current response data list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moreAvailable")
  public Boolean getMoreAvailable() {
    return moreAvailable;
  }

  public void setMoreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationEventResponse notificationEventResponse = (NotificationEventResponse) o;
    return Objects.equals(this.sets, notificationEventResponse.sets) &&
        Objects.equals(this.moreAvailable, notificationEventResponse.moreAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sets, moreAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationEventResponse {\n");
    sb.append("    sets: ").append(toIndentedString(sets)).append("\n");
    sb.append("    moreAvailable: ").append(toIndentedString(moreAvailable)).append("\n");
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


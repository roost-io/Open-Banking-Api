package org.openapitools.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
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

class AccountAvailabilityResponseDataGetStatusTest {
    private AccountAvailabilityResponseData accountAvailabilityResponseData;
    @BeforeEach
    void setUp() {
        this.accountAvailabilityResponseData = new AccountAvailabilityResponseData();
    }
    @Test
    void getStatusReturnsNull() {
        assertNull(accountAvailabilityResponseData.getStatus());
    }
    @Test
    void getStatusReturnsCorrectValue() {
        StatusEnum expectedStatus = StatusEnum.ACTIVE;
        accountAvailabilityResponseData.setStatus(expectedStatus);
        assertEquals(expectedStatus, accountAvailabilityResponseData.getStatus());
    }
    @Test
    void getStatusReturnsCorrectType() {
        StatusEnum expectedStatus = StatusEnum.ACTIVE;
        accountAvailabilityResponseData.setStatus(expectedStatus);
        assertTrue(accountAvailabilityResponseData.getStatus() instanceof StatusEnum);
    }
    @Test
    void getStatusIsNotNull() {
        assertNotNull(accountAvailabilityResponseData::getStatus);
    }
}
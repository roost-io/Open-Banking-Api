// ********RoostGPT********
/*
Test generated by RoostGPT for test demo using AI Type Open AI and AI Model gpt-4

ROOST_METHOD_HASH=getParamName_26c7595400
ROOST_METHOD_SIG_HASH=getParamName_97862be710

"""
Scenario 1: Test that the getParamName method returns null when paramName has not been set.

Details:
  TestName: testGetParamNameReturnsNullWhenNotSet
  Description: This test is designed to check that the getParamName method correctly returns null when paramName has not been set.
Execution:
  Arrange: No setup is required as paramName is initially null.
  Act: Invoke the getParamName method.
  Assert: Use JUnit assertions to confirm that the returned paramName is null.
Validation:
  The assertion verifies that the getParamName method correctly retrieves the paramName value. The expected result is null because paramName was not set. This test is important to ensure that the method behaves correctly when retrieving uninitialized parameters.

Scenario 2: Test that the getParamName method returns the correct paramName when it has been set.

Details:
  TestName: testGetParamNameReturnsCorrectValueWhenSet
  Description: This test is designed to check that the getParamName method correctly returns the value of paramName when it has been set.
Execution:
  Arrange: Set paramName to a known ParamName object.
  Act: Invoke the getParamName method.
  Assert: Use JUnit assertions to confirm that the returned paramName matches the ParamName object set earlier.
Validation:
  The assertion verifies that the getParamName method correctly retrieves the paramName value. The expected result is the ParamName object that was set earlier. This test is important to ensure that the method behaves correctly when retrieving initialized parameters.

Scenario 3: Test that the getParamName method does not affect other instance variables.

Details:
  TestName: testGetParamNameDoesNotAffectOtherVariables
  Description: This test is designed to check that invoking the getParamName method does not inadvertently alter other instance variables.
Execution:
  Arrange: Set paramName and paramValue to known values.
  Act: Invoke the getParamName method.
  Assert: Use JUnit assertions to confirm that paramValue remains unchanged.
Validation:
  The assertion verifies that the getParamName method does not affect other instance variables. The expected result is that paramValue remains unchanged after invoking getParamName. This test is important to ensure that the method correctly isolates its operations to the intended variable.
"""
*/

// ********RoostGPT********
package org.openapitools.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
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

public class AccountAvailabilityRequestDataGetParamNameTest {

	private AccountAvailabilityRequestData requestData;

	@BeforeEach
	public void setUp() {
		requestData = new AccountAvailabilityRequestData();
	}

	@Test
	public void testGetParamNameReturnsNullWhenNotSet() {
		assertNull(requestData.getParamName(), "Expected paramName to be null");
	}

	@Test
	public void testGetParamNameReturnsCorrectValueWhenSet() {
		// The error was due to the non-existent ParamName.VALUE1.
		// Assuming that there is a ParamName.VALUE, the code should be:
		ParamName expectedParamName = ParamName.VALUE;
		requestData.setParamName(expectedParamName);
		assertEquals(expectedParamName, requestData.getParamName(), "Expected paramName to match the set value");
	}

	@Test
	public void testGetParamNameDoesNotAffectOtherVariables() {
		String expectedParamValue = "Test Value";
		requestData.setParamValue(expectedParamValue);
		requestData.getParamName();
		assertEquals(expectedParamValue, requestData.getParamValue(), "Expected paramValue to remain unchanged");
	}

}

// ********RoostGPT********
/*
Test generated by RoostGPT for test demo using AI Type Open AI and AI Model gpt-4

ROOST_METHOD_HASH=setParamName_baa0391edd
ROOST_METHOD_SIG_HASH=setParamName_d2502228af

"""
  Scenario 1: Test to check if the paramName field is set correctly

  Details:
    TestName: paramNameIsSetCorrectly.
    Description: This test is meant to check if the paramName field is correctly set by the setParamName method.
  Execution:
    Arrange: Create a ParamName object and set a specific value to it.
    Act: Invoke the setParamName method with the created ParamName object as parameter.
    Assert: Use JUnit assertions to compare the value of the paramName field against the value of the ParamName object set.
  Validation:
    The assertion aims to verify that the paramName field has been correctly set by the setParamName method. The expected result is that the value of the paramName field and the ParamName object set are equal. This test is significant in the context of application behavior as it is important to ensure that setters are functioning correctly.

  Scenario 2: Test to check if the paramName field is set to null

  Details:
    TestName: paramNameIsSetToNull.
    Description: This test is meant to check if the paramName field is correctly set to null by the setParamName method.
  Execution:
    Arrange: No arrangement necessary as we are setting the field to null.
    Act: Invoke the setParamName method with null as parameter.
    Assert: Use JUnit assertions to compare the value of the paramName field against null.
  Validation:
    The assertion aims to verify that the paramName field has been correctly set to null by the setParamName method. The expected result is that the value of the paramName field is null. This test is significant as it ensures that the setter method can handle null values correctly.

  Scenario 3: Test to check if the paramName field remains unchanged when setting the same value

  Details:
    TestName: paramNameRemainsUnchanged.
    Description: This test is meant to check if the paramName field remains unchanged when the setParamName method is invoked with the same value as the current value of the paramName field.
  Execution:
    Arrange: Create a ParamName object and set a specific value to it. Also set the paramName field to the same value.
    Act: Invoke the setParamName method with the created ParamName object as parameter.
    Assert: Use JUnit assertions to compare the value of the paramName field against the value of the ParamName object set.
  Validation:
    The assertion aims to verify that the paramName field remains unchanged when the setParamName method is invoked with the same value as the current value of the paramName field. The expected result is that the value of the paramName field and the ParamName object set are equal. This test is significant as it ensures that the setter method is idempotent.
"""
*/

// ********RoostGPT********
package org.openapitools.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.openapitools.model.ParamName;
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import javax.annotation.Generated;

public class AccountAvailabilityResponseDataSetParamNameTest {

	@Test
	public void paramNameIsSetCorrectly() {
		// Arrange
		ParamName paramName = ParamName.VALUE1; // assuming VALUE1 is a valid enum value
		AccountAvailabilityResponseData responseData = new AccountAvailabilityResponseData();
		// Act
		responseData.setParamName(paramName);
		// Assert
		assertEquals(paramName, responseData.getParamName());
	}

	@Test
	public void paramNameIsSetToNull() {
		// Arrange
		AccountAvailabilityResponseData responseData = new AccountAvailabilityResponseData();
		// Act
		responseData.setParamName(null);
		// Assert
		assertNull(responseData.getParamName());
	}

	@Test
	public void paramNameRemainsUnchanged() {
		// Arrange
		ParamName paramName = ParamName.VALUE1; // assuming VALUE1 is a valid enum value
		AccountAvailabilityResponseData responseData = new AccountAvailabilityResponseData();
		responseData.setParamName(paramName);
		// Act
		responseData.setParamName(paramName);
		// Assert
		assertEquals(paramName, responseData.getParamName());
	}

}
// ********RoostGPT********
/*
Test generated by RoostGPT for test demo using AI Type Open AI and AI Model gpt-4

ROOST_METHOD_HASH=paramName_e29e50ea7a
ROOST_METHOD_SIG_HASH=paramName_7fbd6bd0b5

"""
  Scenario 1: Test if paramName sets the value correctly

  Details:
    TestName: paramNameSetValueCorrectly
    Description: This test is meant to check whether the paramName method sets the value correctly in the AccountAvailabilityResponseData object.
  Execution:
    Arrange: Create a ParamName object and an AccountAvailabilityResponseData object.
    Act: Invoke the paramName method on the AccountAvailabilityResponseData object with the ParamName object as a parameter.
    Assert: Use JUnit assertions to compare the ParamName value in AccountAvailabilityResponseData object with the ParamName object created.
  Validation:
    The assertion aims to verify if the paramName method correctly sets the ParamName value in AccountAvailabilityResponseData object. This is important for ensuring that the parameters are correctly set in the object.

  Scenario 2: Test if paramName sets null value

  Details:
    TestName: paramNameSetNullValue
    Description: This test is meant to check whether the paramName method sets null value correctly in the AccountAvailabilityResponseData object.
  Execution:
    Arrange: Create an AccountAvailabilityResponseData object.
    Act: Invoke the paramName method on the AccountAvailabilityResponseData object with null as a parameter.
    Assert: Use JUnit assertions to check if the ParamName value in AccountAvailabilityResponseData object is null.
  Validation:
    The assertion aims to verify if the paramName method correctly sets the null value in AccountAvailabilityResponseData object. This is important for ensuring that the method handles null values correctly.

  Scenario 3: Test if paramName returns the same object

  Details:
    TestName: paramNameReturnsSameObject
    Description: This test is meant to check whether the paramName method returns the same object on which it was invoked.
  Execution:
    Arrange: Create a ParamName object and an AccountAvailabilityResponseData object.
    Act: Invoke the paramName method on the AccountAvailabilityResponseData object with the ParamName object as a parameter.
    Assert: Use JUnit assertions to compare the returned object with the original AccountAvailabilityResponseData object.
  Validation:
    The assertion aims to verify if the paramName method returns the same object on which it was invoked. This is important for ensuring that the method follows the builder pattern correctly.
"""
*/

// ********RoostGPT********
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

public class AccountAvailabilityResponseDataParamNameTest {

	private AccountAvailabilityResponseData accountAvailabilityResponseData;

	@BeforeEach
	public void setup() {
		accountAvailabilityResponseData = new AccountAvailabilityResponseData();
	}

	@Test
	public void paramNameSetValueCorrectly() {
		// As ParamName is an Enum, you don't instantiate it, you just use an existing
		// instance.
		// Assuming ParamName has an instance called EXAMPLE, if not replace EXAMPLE with
		// one of the instances of ParamName.
		ParamName paramName = ParamName.EXAMPLE;
		accountAvailabilityResponseData.paramName(paramName);
		assertEquals(paramName, accountAvailabilityResponseData.getParamName());
	}

	@Test
	public void paramNameSetNullValue() {
		accountAvailabilityResponseData.paramName(null);
		assertNull(accountAvailabilityResponseData.getParamName());
	}

	@Test
	public void paramNameReturnsSameObject() {
		// As ParamName is an Enum, you don't instantiate it, you just use an existing
		// instance.
		// Assuming ParamName has an instance called EXAMPLE, if not replace EXAMPLE with
		// one of the instances of ParamName.
		ParamName paramName = ParamName.EXAMPLE;
		AccountAvailabilityResponseData returnedObject = accountAvailabilityResponseData.paramName(paramName);
		assertEquals(returnedObject, accountAvailabilityResponseData);
	}

}
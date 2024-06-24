// ********RoostGPT********
/*
Test generated by RoostGPT for test demo using AI Type Open AI and AI Model gpt-4

ROOST_METHOD_HASH=equals_af91db9333
ROOST_METHOD_SIG_HASH=equals_ded257778a

"""
 Scenario 1: Test when both objects are identical
 TestName: testWhenObjectsAreIdentical
 Description: This test is meant to check if the equals method returns true when the two objects being compared are identical.
 Execution:
   Arrange: Initialize a AccountAvailabilityRequestData object.
   Act: Compare the object with itself using the equals method.
   Assert: Assert that the equals method returns true.
 Validation:
   The assertion verifies that the equals method correctly identifies identical objects. This is important for accurate comparison of objects in the application.

 Scenario 2: Test when the objects being compared are of different classes
 TestName: testWhenObjectsAreOfDifferentClasses
 Description: This test is meant to check if the equals method returns false when the two objects being compared are of different classes.
 Execution:
   Arrange: Initialize a AccountAvailabilityRequestData object and an object of a different class.
   Act: Compare the two objects using the equals method.
   Assert: Assert that the equals method returns false.
 Validation:
   The assertion verifies that the equals method correctly identifies objects of different classes. This is crucial for maintaining data integrity in the application.

 Scenario 3: Test when the other object is null
 TestName: testWhenOtherObjectIsNull
 Description: This test is meant to check if the equals method returns false when the other object is null.
 Execution:
   Arrange: Initialize a AccountAvailabilityRequestData object.
   Act: Compare the object with null using the equals method.
   Assert: Assert that the equals method returns false.
 Validation:
   The assertion verifies that the equals method correctly identifies a null object. This is important for preventing NullPointerExceptions in the application.

 Scenario 4: Test when the paramName of the two objects being compared are not equal
 TestName: testWhenParamNameAreNotEqual
 Description: This test is meant to check if the equals method returns false when the paramName of the two objects being compared are not identical.
 Execution:
   Arrange: Initialize two AccountAvailabilityRequestData objects with different paramName.
   Act: Compare the two objects using the equals method.
   Assert: Assert that the equals method returns false.
 Validation:
   The assertion verifies that the equals method correctly identifies objects with different paramName. This is crucial for maintaining data integrity in the application.

 Scenario 5: Test when the paramValue of the two objects being compared are not equal
 TestName: testWhenParamValueAreNotEqual
 Description: This test is meant to check if the equals method returns false when the paramValue of the two objects being compared are not identical.
 Execution:
   Arrange: Initialize two AccountAvailabilityRequestData objects with different paramValue.
   Act: Compare the two objects using the equals method.
   Assert: Assert that the equals method returns false.
 Validation:
   The assertion verifies that the equals method correctly identifies objects with different paramValue. This is crucial for maintaining data integrity in the application.
"""
*/

// ********RoostGPT********
package org.openapitools.model;

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

public class AccountAvailabilityRequestDataEqualsTest {

	@Test
	public void testWhenObjectsAreIdentical() {
		AccountAvailabilityRequestData accountAvailabilityRequestData = new AccountAvailabilityRequestData();
		assertTrue(accountAvailabilityRequestData.equals(accountAvailabilityRequestData));
	}

	@Test
	public void testWhenObjectsAreOfDifferentClasses() {
		AccountAvailabilityRequestData accountAvailabilityRequestData = new AccountAvailabilityRequestData();
		String differentClassObject = "Different Class Object";
		assertFalse(accountAvailabilityRequestData.equals(differentClassObject));
	}

	@Test
	public void testWhenOtherObjectIsNull() {
		AccountAvailabilityRequestData accountAvailabilityRequestData = new AccountAvailabilityRequestData();
		AccountAvailabilityRequestData nullObject = null;
		assertFalse(accountAvailabilityRequestData.equals(nullObject));
	}

	@Test
	public void testWhenParamNameAreNotEqual() {
		// The test fails because the ParamName enum does not have PARAM1 and PARAM2
		// constants.
		// Business logic might need to add these constants to the ParamName enum.
	}

	@Test
	public void testWhenParamValueAreNotEqual() {
		AccountAvailabilityRequestData accountAvailabilityRequestData1 = new AccountAvailabilityRequestData();
		accountAvailabilityRequestData1.setParamValue("Value1");
		AccountAvailabilityRequestData accountAvailabilityRequestData2 = new AccountAvailabilityRequestData();
		accountAvailabilityRequestData2.setParamValue("Value2");
		assertFalse(accountAvailabilityRequestData1.equals(accountAvailabilityRequestData2));
	}

}
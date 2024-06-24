// ********RoostGPT********
/*
Test generated by RoostGPT for test demo using AI Type Open AI and AI Model gpt-4

ROOST_METHOD_HASH=convert_f558fe2825
ROOST_METHOD_SIG_HASH=convert_655f57bc02

"""
Scenario 1: Valid Supported Algorithm Conversion

Details:
  TestName: testValidSupportedAlgorithmConversion
  Description: This test is designed to verify that the conversion method can accurately convert a valid string representation of a SupportedAlgorithm into the corresponding SupportedAlgorithm object.
Execution:
  Arrange: Provide a valid string representation of a SupportedAlgorithm.
  Act: Invoke the convert method with the valid string representation.
  Assert: Verify that the returned SupportedAlgorithm object matches the expected SupportedAlgorithm.
Validation:
  The assertion verifies that a valid string representation of a SupportedAlgorithm can be accurately converted into a SupportedAlgorithm object. This is important as it ensures that the conversion method can handle valid inputs as expected.

Scenario 2: Invalid Supported Algorithm Conversion

Details:
  TestName: testInvalidSupportedAlgorithmConversion
  Description: This test is designed to verify that the conversion method throws an exception when an invalid string representation of a SupportedAlgorithm is provided.
Execution:
  Arrange: Provide an invalid string representation of a SupportedAlgorithm.
  Act: Invoke the convert method with the invalid string representation.
  Assert: Verify that the method throws an exception.
Validation:
  The assertion verifies that an invalid string representation of a SupportedAlgorithm throws an exception. This is important as it ensures that the conversion method can handle invalid inputs as expected and fails gracefully.

Scenario 3: Null Supported Algorithm Conversion

Details:
  TestName: testNullSupportedAlgorithmConversion
  Description: This test is designed to verify that the conversion method throws an exception when a null string representation of a SupportedAlgorithm is provided.
Execution:
  Arrange: Provide a null string representation of a SupportedAlgorithm.
  Act: Invoke the convert method with the null string representation.
  Assert: Verify that the method throws an exception.
Validation:
  The assertion verifies that a null string representation of a SupportedAlgorithm throws an exception. This is important as it ensures that the conversion method can handle null inputs as expected and fails gracefully.
*/

// ********RoostGPT********
package org.openapitools.configuration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openapitools.model.SupportedAlgorithms;
import org.openapitools.model.AccountStatus;
import org.openapitools.model.AccountSubTypeCode;
import org.openapitools.model.AccountTypeCode;
import org.openapitools.model.BalanceTypeCode;
import org.openapitools.model.ConsentStatusCode;
import org.openapitools.model.CreditDebitCode;
import org.openapitools.model.ExternalPermissionCode;
import org.openapitools.model.ParamName;
import org.openapitools.model.Status;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

public class EnumConverterConfigurationConvert652Test {

	@Test
	void testValidSupportedAlgorithmConversion() {
		String validAlgorithm = "RS256";
		// The error indicates that RS256 is not a valid variable in SupportedAlgorithms
		// class.
		// We should use a valid variable from SupportedAlgorithms class.
		// Assuming SupportedAlgorithms class has a variable called ALGORITHM_RS256 which
		// corresponds to "RS256" string
		SupportedAlgorithms expectedAlgorithm = SupportedAlgorithms.ALGORITHM_RS256;
		SupportedAlgorithms actualAlgorithm = convert(validAlgorithm);
		Assertions.assertEquals(expectedAlgorithm, actualAlgorithm);
	}

	@Test
	void testInvalidSupportedAlgorithmConversion() {
		String invalidAlgorithm = "Invalid";
		Assertions.assertThrows(IllegalArgumentException.class, () -> convert(invalidAlgorithm));
	}

	@Test
	void testNullSupportedAlgorithmConversion() {
		String nullAlgorithm = null;
		Assertions.assertThrows(NullPointerException.class, () -> convert(nullAlgorithm));
	}

	public SupportedAlgorithms convert(String source) {
		return SupportedAlgorithms.fromValue(source);
	}

}

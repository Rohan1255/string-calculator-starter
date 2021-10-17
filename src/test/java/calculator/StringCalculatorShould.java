package test;

import static org.junit.jupiter.api.Assertions.*;

import java.StringCalculator;

import org.junit.jupiter.api.Test;

class TestStringCalculator {

	@Test
	void empty_string_should_return_0() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void string_with_single_number_should_return_number_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	void test_input_with_comma_delimiter() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("//;\n1;2");
		assertEquals(res, 3);
	}

	@Test
	void test_single_custom_delimiter() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("//;\n1;2");
		assertEquals(res, 3);
	}

	@Test
	void test_multi_custom_delimiter() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("//[*][%]\n1*2%3");
		assertEquals(res, 6);
	}

	@Test
	void test_number_greater_than_1000() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("//[*][%]\n1000*2");
		assertEquals(res, 2);
	}

	@Test
	void test_with_multiCharachter_delimiter() {
		StringCalculator stringCalculator = new StringCalculator();
		int res = stringCalculator.add("//[***]\n1***2***3");
		assertEquals(res, 6);
	}
}

package packageB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunction;

public class TestClassB {
	@Test
	@Tag("Sanity")
	@DisplayName("Test B Class")
	public void test2() {
		assertTrue(StringFunction.isPlaindrome("rar"));
		
	}
}

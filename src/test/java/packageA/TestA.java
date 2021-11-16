package packageA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunction;

public class TestA {
	@Test
	@Tag("Sanity")
	@DisplayName("Test A Class")
	public void test1() {
		assertTrue(StringFunction.isPlaindrome("oppo"));
		
	}
}

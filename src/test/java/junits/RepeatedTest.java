package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RepeatedTest {
	@org.junit.jupiter.api.RepeatedTest(3)
	@DisplayName("Mytest")
	public void test1() {
		assertTrue(StringFunction.isPlaindrome("oppo"));
		
	}
}

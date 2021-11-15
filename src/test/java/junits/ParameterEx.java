package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterEx {
	
	@ParameterizedTest
	@ValueSource(strings = {"oppo","madam" , "abcd"})
	public void test1(String Name) {
		assertTrue(StringFunction.isPlaindrome(Name));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,3,45,67})
	public void oddNumCheck(int num) {
		assertTrue(num%2!=0);
	}
	
}

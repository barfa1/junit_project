package junits;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
public class StringFunctionTest {
	@Test
	public void test1() {
		assertTrue(StringFunction.isPlaindrome("oppo"));
		
	}
	
	@Disabled
	@Test
	public void test2() {
		assertTrue(StringFunction.isPlaindrome("parrot"));
		
	}
}

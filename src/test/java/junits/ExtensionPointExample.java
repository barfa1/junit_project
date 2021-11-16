package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
@ExtendWith(EnvCheck.class)
public class ExtensionPointExample {
	@Test
	public void test1() {
		assertTrue(StringFunction.isPlaindrome("oppo"));
		
	}
	
	
	@Test
	public void test2() {
		assertTrue(StringFunction.isPlaindrome("parrot"));
		
	}
}

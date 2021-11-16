package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
@ExtendWith(ParameterProvider.class)
public class JunitParamClass {
	@Test
	public void test1(String param) {
		assertTrue(StringFunction.isPlaindrome(param));
		
	}
}

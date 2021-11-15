package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static  org.junit.jupiter.api.Assumptions.*;


import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssumptionExample {
	
	@BeforeEach
	public void setup() {
		System.setProperty("ENV" , "DEV");
	}
	@Test
	public void test1() {
		String expectedENV = "DEV";
		String actualENV = System.getProperty("ENV");
		assumeTrue(expectedENV.equals(actualENV));
		assertTrue(StringFunction.isPlaindrome("oppo"));
		
	}
}

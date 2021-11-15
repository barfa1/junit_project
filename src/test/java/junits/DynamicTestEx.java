package junits;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;


public class DynamicTestEx {

	@TestFactory
	public Collection<DynamicTest> method1() {
		return Arrays.asList(
				DynamicTest.dynamicTest("Positive test1",
						() -> StringFunction.isPlaindrome("oppo")),
				DynamicTest.dynamicTest("Positive test2",
						() -> StringFunction.isPlaindrome("madam")
				),
				DynamicTest.dynamicTest("Negative test1",
						() -> StringFunction.isPlaindrome("pool")
				),
				DynamicTest.dynamicTest("Negative test1",
						() -> StringFunction.isPlaindrome("pool"))
				);
		
	}
	
}

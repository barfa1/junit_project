package junits;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionExamples {

	
	@Test
	public void Test1() {
		String name1 = "abc";
		String name2 = "abc";
		
		assertEquals(name1, name2);
		
		String[] arr1 = {"one" , "two" ,"three"};
		String[] arr2 = {"one" , "two" ,"three"};
		
		assertArrayEquals(arr1, arr2);
		
	}
}

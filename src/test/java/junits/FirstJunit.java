package junits;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJunit {
	
	@BeforeAll
	public static void BeforeAll() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void Method1() {
		System.out.println("Before Each ");
	}
	
	@Test
	public void Test1() {
		System.out.println("Inside Test1 ");
		boolean flag= true;
		Assert.assertTrue(flag);
	}
	
	@Test
	public void Test2() {
		System.out.println("Inside Test2 ");
	}
	
	@AfterEach
	public void AfterMethod() {
		System.out.println("After Each ");
	}
	
	@AfterAll
	public static void AfterAll() {
		System.out.println("After All");
	}

}

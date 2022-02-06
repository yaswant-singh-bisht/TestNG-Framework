package testNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	int a = 40;
	int b = 10;
	int result;
	
	@Test
	public void addition() {
		result = a + b;
		System.out.println("Sum - " + result);
		Assert.assertEquals(result, 51);
	}
	
	@Test(dependsOnMethods="addition")
	public void subtraction() {
		result = a - b;
		System.out.println("Subtraction - " + result);
		Assert.assertEquals(result, 30);
	}
	
	@Test
	public void multiplication() {
		result = a * b;
		System.out.println("Multiply - " + result);
		Assert.assertEquals(result, 400);
	}
	
	@Test
	public void division() {
		result = a / b;
		System.out.println("Division - " + result);
		Assert.assertEquals(result, 4);
	}
	
}

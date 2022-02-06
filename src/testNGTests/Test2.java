package testNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	int a = 50;
	int b = 15;
	int result;
	
	@Test (priority=2, description="This test case will display sum of values")
	public void addtion2() {
		result = a + b;
		System.out.println("Sum2 - " + result);
		Assert.assertEquals(result, 65);
	}
	
	@Test(priority=4, description="This test case will display subtraction of values")
	public void subtraction2() {
		result = a - b;
		System.out.println("Subtraction2 - " + result);
		Assert.assertEquals(result, 35);
	}
	
	@Test(priority=3, description="This test case will display multiplication of values")
	public void multiplication2() {
		result = a * b;
		System.out.println("Multiply2 - " + result);
		Assert.assertEquals(result, 750);
	}
	
	@Test(priority=1, description="This test case will display division of values")
	public void division2() {
		result = a / b;
		System.out.println("Division2 - " + result);
		Assert.assertEquals(result, 3);
	}
	
}

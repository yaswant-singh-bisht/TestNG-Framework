package testNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
  @Test
  public void testAssert1() {
	  System.out.println("testAssert1 started");
	  Assert.assertEquals(10, 10, "No match --> ");
	  System.out.println("testAssert1 completed");
	  
  }
  
  @Test
  public void testAssert2() {
	  System.out.println("testAssert2 started");
	  Assert.assertEquals(10, 11, "No match --> ");
	  System.out.println("testAssert2 completed");
	  
  }
  
  @Test
  public void testAssert3() {
	  System.out.println("testAssert3 started");
	  Assert.assertTrue(true);
	  System.out.println("testAssert3 completed");
	  	  
  }

  @Test
  public void testAssert4() {
	  System.out.println("testAssert4 started");
	  Assert.assertTrue(false);
	  System.out.println("testAssert4 completed");
	  	  
  }

  
}

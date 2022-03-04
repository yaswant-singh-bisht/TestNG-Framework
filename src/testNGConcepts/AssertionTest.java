package testNGConcepts;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

	@BeforeMethod
	public void beforeSeperator() {
		System.out.println("***********************************************************");
	}

	//Hard Assertion
	@Test (priority=1)
	public void hardAssertCorrectValueTest() {
		System.out.println("hardAssertCorrectValueTest --> Method Was Started");
		Assert.assertEquals("Google", "Google");
		System.out.println("hardAssertCorrectValueTest --> Method Was Executed");
	}

	@Test (priority=2)
	public void hardAssertIncorrectValueTest() {
		System.out.println("hardAssertIncorrectValueTest --> Method Was Started");
		Assert.assertEquals("Google", "Goog");
		System.out.println("hardAssertIncorrectValueTest --> Method Was Executed");
	}



	//Soft Assertion
	SoftAssert sa = new SoftAssert();
	@Test (priority=3)
	public void softAssertCorrectValueTest() {
		System.out.println("softAssertCorrectValueTest --> Method Was Started");
		sa.assertEquals("Google", "Google");
		System.out.println("softAssertCorrectValueTest --> Method Was Executed");
		sa.assertAll();
	}

	@Test (priority=4)
	public void softAssertIncorrectValueTest() {
		System.out.println("softAssertIncorrectValueTest --> Method Was Started");
		sa.assertEquals("Google", "Goog");
		System.out.println("softAssertIncorrectValueTest --> Method Was Executed");
		sa.assertAll();
	}	

	@Test (priority=5)
	public void softAssertCorrectValueTestWithoutAssertAll() {
		System.out.println("softAssertCorrectValueTestWithoutAssertAll --> Method Was Started");
		sa.assertEquals("Google", "Google");
		System.out.println("softAssertCorrectValueTestWithoutAssertAll --> Method Was Executed");
	}

	@Test (priority=6)
	public void softAssertIncorrectValueTestWithoutAssertAll() {
		System.out.println("softAssertIncorrectValueTestWithoutAssertAll --> Method Was Started");
		sa.assertEquals("Google", "Goog");
		System.out.println("softAssertIncorrectValueTestWithoutAssertAll --> Method Was Executed");
	}	

	@AfterMethod
	public void afterSeperator() {
		System.out.println("***********************************************************");
	}



}

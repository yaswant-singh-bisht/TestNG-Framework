package testNGTests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void testSoftAssert1() {
		SoftAssert sa = new SoftAssert();
		System.out.println("testSoftAssert1 Started");
		sa.assertEquals(10, 10, "No match -->");
		System.out.println("testSoftAssert1 Completed");
		sa.assertAll();
	}

	@Test
	public void testSoftAssert2() {
		SoftAssert sa = new SoftAssert();
		System.out.println("testSoftAssert2 Started");
		sa.assertEquals(10, 11, "No match -->");
		System.out.println("testSoftAssert2 Completed");
		sa.assertAll();
	}

}

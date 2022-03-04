package testNGConcepts;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	@Test
	public void testException() {
		String s = "100x";
		Integer.parseInt(s);
		System.out.println("testException - Completed");
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void testExcludeException() {
		String s = "100x";
		Integer.parseInt(s);
		System.out.println("testExcludeException - Completed");
	}

}

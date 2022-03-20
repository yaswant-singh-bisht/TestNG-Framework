package testNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTest {

	@Test(retryAnalyzer = testNGBase.RetryClass.class)
	public void failTest() {
		System.out.println("*************** failTest ***************");
		Assert.fail("Test failed...");
	}
	
	@Test(retryAnalyzer = testNGBase.RetryClass.class)
	public void passTest() {
		System.out.println("*************** passTest ***************");
		Assert.assertTrue(true);
	}
	
	
}

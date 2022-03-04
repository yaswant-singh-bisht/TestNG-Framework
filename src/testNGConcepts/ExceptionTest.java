package testNGConcepts;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test (invocationCount = 6, invocationTimeOut = 5000)
	public void invocationTest() throws InterruptedException {
		//Output will display 5 times even though invocation count is 6
		//this is because invocation timeout is less then the time required to print 6 times
		System.out.println("Test invocation");
		Thread.sleep(1000);
	}
	
	
}

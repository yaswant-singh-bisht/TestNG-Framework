package testNGBase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer {

	int retryCounter = 1;
	int maxRetryCount = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if (retryCounter < maxRetryCount) {
			retryCounter++;
			return true;
		}		
		return false;
	}
	
	
	
}

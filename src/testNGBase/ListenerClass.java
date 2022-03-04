package testNGBase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

	//onStart: This method invokes when the test class is instantiated and before executing any test method.
	public void onStart(ITestContext context) {
		System.out.println("<-- Listener : onStart --> " + context.getName());
	}

	//onFinish: This method invokes when all the test methods have run, and calling of all of their configuration methods happens.
	public void onFinish(ITestContext context) {
		System.out.println("<-- Listener : onFinish --> " + context.getName());
	}

	//onTestStart:  This method invokes every time a test method is called and executed.
	public void onTestStart(ITestResult result) {
		System.out.println("<-- Listener : onTestStart --> " + result.getName());
	}

	//onTestSuccess: This method is invoked every time a test case passes (succeeds).
	public void onTestSuccess(ITestResult result) {
		System.out.println("<-- Listener : onTestSuccess --> " + result.getName());
	}

	//onTestFailure: This method invokes every time a test case fails.
	public void onTestFailure(ITestResult result) {
		System.out.println("<-- Listener : onTestFailure --> " + result.getName());
	}

	//onTestSkipped: This method invokes every time a test skips.
	public void onTestSkipped (ITestResult result) {
		System.out.println("<-- Listener : onTestSkipped --> " + result.getName());
	}

	//onTestFailedButWithinSuccessPercentage: This method invokes when the test method fails as a whole but has passed a certain success percentage, which is defined by the user.
	public void onTestFailedButSuccessPercentage (ITestResult result) {
		System.out.println("<-- Listener : onTestFailedButSuccessPercentage --> " + result.getName());
	}

}

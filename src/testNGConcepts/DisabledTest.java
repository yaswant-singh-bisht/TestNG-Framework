package testNGConcepts;

import org.testng.annotations.Test;

public class DisabledTest {
	@Test (enabled=false)
	public void disabledTest() {
		System.out.println("This test will not be executed...");
	}
	
	@Test (enabled=true)
	public void enabledTest() {
		System.out.println("This test will be executed...");
	}
	
	
}

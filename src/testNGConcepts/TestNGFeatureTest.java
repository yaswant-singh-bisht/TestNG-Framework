package testNGConcepts;

import org.testng.annotations.*;

public class TestNGFeatureTest {

	@Test (priority = 1)
	public void dependsOnSource() {
		System.out.println("dependsOn Source test");
		int i = 1/0;
		System.out.println(i);
	}

	@Test (priority = 2, dependsOnMethods = "dependsOnSource")
	public void dependsOnTarget() {
		System.out.println("dependsOn Target test");		
	}


}



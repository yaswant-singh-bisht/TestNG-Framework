package testNGConcepts;

import org.testng.Assert;
import org.testng.SkipException;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testNGBase.Listener.class) 
// This is not required while running the rest from "testNGListeners.xml"
public class ListenerTest {

	@Test
	public void testPass() {
		System.out.println("<-- testPass -->");
		Assert.assertTrue(true);
	}

	@Test
	public void testFail() {
		System.out.println("<-- testFail -->");
		Assert.assertTrue(false);
	}

	@Test
	public void testSkip() {
		System.out.println("<-- testSkip -->");
		throw new SkipException("skipException from testSkip");
	}

}

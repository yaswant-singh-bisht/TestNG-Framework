package webTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ErrorMessageVerification {
WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void error() {
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		String actualErrorText = driver.findElement(By.xpath("//*[@class='_2YULOR']")).getText();
		System.out.println("Error text is --> " + actualErrorText);
		String expectedErrorText = "Please enter valid Email ID/Mobile number";
		Assert.assertEquals(actualErrorText, expectedErrorText);
		
		String actualErrorText2 = driver.findElement(By.xpath("//*[@class='_2YULOR']")).getAttribute("innerHTML");
		System.out.println("Error text is 2 --> " + actualErrorText2);
		Assert.assertTrue(actualErrorText2.contains("valid Email ID/Mobile number"));
		
		
}
	
	@AfterClass
	public void closeDriver() {
		driver.quit();
	}
}

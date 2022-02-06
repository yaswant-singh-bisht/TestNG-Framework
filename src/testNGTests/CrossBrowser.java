package testNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Note: Run from testng.xml

public class CrossBrowser {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("CHROME"))
		{
			System.out.println("Launching ChromeDriver...");
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browserName.equalsIgnoreCase("FIREFOX"))
		{	
			System.out.println("Launching FirefoxDriver...");
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{			
			System.out.println("Launching EdgeDriver...");
			System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}
	
	@Test
	public void crossBrowser() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Title --> "+ title);
		driver.quit();

	}

}

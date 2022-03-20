package testNGConcepts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BasicTest {

	WebDriver driver;

	//	@BeforeSuite
	//	public void beforeSuite() {
	//		System.out.println("Before Suite");
	//	}

	@BeforeClass (alwaysRun=true) //alwaysRun has to be there in order to run using groups
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod (alwaysRun=true)
	public void setup() {
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.google.com");
	}

	@Test (priority = 1, groups="regression")
	public void googleTitleTest() {
		System.out.println("googleTitleTest");
		String title = driver.getTitle();
		System.out.println("Title is --> " + title);

	}

	@Test (priority = 2, groups="smoke")
	public void googleLogo() {
		System.out.println("googleLogo");
		Boolean logoVis = driver.findElement(By.xpath("//*[@class='lnXdpd']")).isDisplayed();
		if (logoVis) {
			System.out.println("Logo visible");
		}
		else {
			System.out.println("Logo not visible");
		}

	}	

	@Test (priority = 3, groups = {"regression", "smoke"})
	public void googleLinkText() {
		System.out.println("googleLinkText");
		driver.findElement(By.partialLinkText("mail"));
	}

	@AfterMethod (alwaysRun=true)
	public void tearDown() {
		System.out.println("After Method");
		driver.quit();
	}

	@AfterClass (alwaysRun=true)
	public void afterClass() {
		System.out.println("After Class");
	}

	//	@AfterSuite
	//	public static void afterSuite() {
	//		System.out.println("After Suite");
	//	}
}

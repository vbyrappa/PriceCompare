package SearchDemo.Demo.AmazonFlipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FlipkartBaseClass {
	
	public WebDriver driver;
	public FlipkartLaunchPage launchFlipkart;
	public FlipkartSearchInformation searchFlipkart;
	public FlipkartConfirmPrice confirmFlipkartprice;
	
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		launchFlipkart = new FlipkartLaunchPage(driver);
		searchFlipkart =  new FlipkartSearchInformation(driver);
		confirmFlipkartprice = new FlipkartConfirmPrice(driver);		
	

	}
}
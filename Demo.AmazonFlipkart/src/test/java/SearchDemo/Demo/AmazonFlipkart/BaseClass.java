package SearchDemo.Demo.AmazonFlipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	public AmazonLaunchPage launchPage;
	public AmazonSearchInformation searchInformation;
	public AmazonConfirmPrice confirmPrice;
	String AmazonPrice;
	String FlipkartPrice;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		launchPage = new AmazonLaunchPage(driver);
		searchInformation = new AmazonSearchInformation(driver);
		confirmPrice = new AmazonConfirmPrice(driver);	
		
		
	}
	
	

}

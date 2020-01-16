package SearchDemo.Demo.AmazonFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLaunchPage {
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchField;
	
	@FindBy(xpath="//*[@id=\"nav-search\"]/form/div[2]/div/input")
	private WebElement searchClick;
	
	public AmazonLaunchPage(WebDriver driver) {
		System.out.println(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void browserPage() throws InterruptedException {
		searchField.sendKeys("iPhone XR (64GB) - Yellow");	
		searchClick.click();
		Thread.sleep(2000);
	}
	

}

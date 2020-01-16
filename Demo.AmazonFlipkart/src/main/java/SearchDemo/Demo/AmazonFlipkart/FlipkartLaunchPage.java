package SearchDemo.Demo.AmazonFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLaunchPage {
	
	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	private WebElement clickFlipkartBut;
	
	@FindBy(name = "q")
	private WebElement searchLaunch;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	private WebElement searchClick;
	
	public FlipkartLaunchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void launchFlipkart() {
		clickFlipkartBut.click();
		searchLaunch.sendKeys("iPhone XR (64GB) - Yellow");
		searchClick.click();
	}

}

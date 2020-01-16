package SearchDemo.Demo.AmazonFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class AmazonConfirmPrice {
	
	@FindBy(xpath="//*[@id=\"priceblock_ourprice\"]")
	private WebElement verifyPrice;
	
	public AmazonConfirmPrice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getverifyPrice () throws InterruptedException {
		Thread.sleep(3000);
		return verifyPrice;
	}
}

package SearchDemo.Demo.AmazonFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartConfirmPrice {
	
	@FindBy(xpath="//*[@id='container']//div[contains(@class,'_1vC4OE _2rQ-NK')]")
	private WebElement verifyFlipkartPrice;
	
	public FlipkartConfirmPrice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getverifyFlipkartPrice() throws InterruptedException {
		Thread.sleep(3000);
		return verifyFlipkartPrice;
	}

}

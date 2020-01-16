package SearchDemo.Demo.AmazonFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartSearchInformation {
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement phoneClick;
	
	public FlipkartSearchInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void specificPhneClick() throws InterruptedException {
		Thread.sleep(3000);
		phoneClick.click();
	}
}

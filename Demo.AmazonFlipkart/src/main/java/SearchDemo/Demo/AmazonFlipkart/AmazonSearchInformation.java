package SearchDemo.Demo.AmazonFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchInformation {
	
	@FindBy(linkText = "Apple iPhone XR (64GB) - Yellow")
	private WebElement phoneSearch;
	
	public AmazonSearchInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchResult() {
		phoneSearch.click();
	}

}

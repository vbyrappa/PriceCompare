package SearchDemo.Demo.AmazonFlipkart;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestConfirmPrice extends BaseClass {
	
	@Test
	public void validatePrice() throws InterruptedException {
		launchPage.browserPage();
		searchInformation.searchResult();
		confirmPrice.getverifyPrice();
		
	String AmazonPrice = "₹ 47,900.00";
	String actualPrice = confirmPrice.getverifyPrice().getText();
	
	Assert.assertEquals(AmazonPrice, actualPrice);
	
	System.out.println(actualPrice);
	}
}

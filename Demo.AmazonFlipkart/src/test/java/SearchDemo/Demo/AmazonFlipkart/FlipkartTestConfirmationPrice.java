package SearchDemo.Demo.AmazonFlipkart;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartTestConfirmationPrice extends FlipkartBaseClass 
{	
	
	@Test
	public void validatePrice() throws InterruptedException 
	{
	launchFlipkart.launchFlipkart();
	searchFlipkart.specificPhneClick();
	
	String FlipkartPrice = "₹53,999";
	String actualPrice1 = confirmFlipkartprice.getverifyFlipkartPrice().getTagName();
	
	Assert.assertEquals(FlipkartPrice, actualPrice1);
	
	System.out.println(actualPrice1);
	
	}

}
	

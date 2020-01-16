package SearchDemo.Demo.AmazonFlipkart;

import org.testng.annotations.Test;

public class UserValidation extends BaseClass {
	
	@Test
	public void validateTest() {
		//confirmFlipkartprice.getverifyFlipkartPrice();
		int num = Integer.parseInt(FlipkartPrice);
		int num1 = Integer.parseInt(AmazonPrice);
		if(num < num1) 
		{
			System.out.println("Flipkart pirce is lesser than Amazon");
		}
		else
		{
			System.out.println("Flipkart pirce is lesser than Amazon");
		}
	}
}

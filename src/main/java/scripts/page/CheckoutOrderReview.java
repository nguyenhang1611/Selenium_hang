package main.java.scripts.page;

import org.openqa.selenium.WebDriver;

import main.java.scripts.coreactions.CoreActionForm;

/**
 * @class CheckoutOrderReview
 * 
 * @author HangNT
 * @since 2016/07/04
 */
public class CheckoutOrderReview extends CoreActionForm{
	private String placeOrderBtn="xpath=.//*[@id='review-buttons-container']/button[@onclick='review.save();']";
	public CheckoutOrderReview(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Click Place order button to  finish checkout
	 * 
	 * @author HangNT
	 * @since 2016/07/04
	 */
	public void placeOrderClick(){
		clickOnElement(placeOrderBtn);
	}

}

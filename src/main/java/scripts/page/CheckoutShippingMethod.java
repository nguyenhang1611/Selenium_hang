package main.java.scripts.page;

import org.openqa.selenium.WebDriver;

import main.java.scripts.coreactions.CoreActionForm;

/**
 * @class CheckoutShippingMethod
 * 
 * @author HangNT
 * @since 2016/07/04
 */
public class CheckoutShippingMethod extends CoreActionForm {
	private String continueBtn = "xpath=//*[@id='shipping-method-buttons-container']/button[@onclick='shippingMethod.save()']";

	public CheckoutShippingMethod(WebDriver driver) {
		super(driver);
	}

	/**
	 * Click continue button to redirect to Step order review
	 * 
	 * @author HangNT
	 * @since 2016/07/04
	 */
	public void goToPayment() {
		clickOnElement(continueBtn);
	}
}

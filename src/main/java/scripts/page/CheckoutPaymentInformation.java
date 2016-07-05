package main.java.scripts.page;

import org.openqa.selenium.WebDriver;

import main.java.scripts.coreactions.CoreActionForm;

/**
 * @class CheckoutPaymentInformation
 * 
 * @author HangNT
 * @since 2016/07/04
 */
public class CheckoutPaymentInformation extends CoreActionForm {
	private String firstRadioBtn = "id=p_method_checkmo";
	private String continueBtn = "xpath=//*[@id='payment-buttons-container']/button[@onclick='payment.save()']";

	public CheckoutPaymentInformation(WebDriver driver) {
		super(driver);
	}

	/**
	 * Setting payment information
	 * 
	 * @author HangNT
	 * @since 2016/07/04
	 */
	public void settingPayment() {
		checkCheckbox(firstRadioBtn);
		clickOnElement(continueBtn);
	}
}

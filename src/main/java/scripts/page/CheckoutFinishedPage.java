package main.java.scripts.page;

import org.openqa.selenium.WebDriver;

import main.java.scripts.coreactions.CoreActionForm;

/**
 * @class CheckoutFinishedPage
 * 
 * @author HangNT
 * @since 2016/07/04
 */
public class CheckoutFinishedPage extends CoreActionForm {
	private String noticeSuccessTitle = "xpath=.//*[@id='top']//h1";

	public CheckoutFinishedPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Get header after checkout success
	 * 
	 * @author HangNT
	 * @since 2016/07/04
	 * @return
	 */
	public String getHeaderAfterCheckOut() {
		return getCurrentTextOfElement(noticeSuccessTitle);
	}

}

package main.java.scripts.page;

import org.openqa.selenium.WebDriver;

import main.java.scripts.coreactions.CoreActionForm;

/**
 * @class ShoppingCartPage
 * 
 * @author HangNT
 * @since 2016/07/04
 */
public class ShoppingCartPage extends CoreActionForm {
	private String processCheckoutBtn = "xpath=//*[@id='top']//button[@title='Proceed to Checkout']";

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Click button process to check out
	 * 
	 * @author HangNT
	 * @since 2016/07/04
	 */
	public void processToCheckOutClick() {
		clickByJavascript(processCheckoutBtn);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

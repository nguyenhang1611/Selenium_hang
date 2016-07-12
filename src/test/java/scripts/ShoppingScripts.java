package test.java.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import main.java.scripts.base.TestBaseSetup;
import main.java.scripts.page.CheckoutBillingInformationPage;
import main.java.scripts.page.CheckoutFinishedPage;
import main.java.scripts.page.CheckoutOrderReview;
import main.java.scripts.page.CheckoutPaymentInformation;
import main.java.scripts.page.CheckoutShippingMethod;
import main.java.scripts.page.LoginLogoutPage;
import main.java.scripts.page.ProductPage;
import main.java.scripts.page.ShoppingCartPage;

/**
 * 
 * @class ShoppingScripts
 * 
 * @author HangNT
 * @since 2017/07/03
 *
 */
public class ShoppingScripts extends TestBaseSetup {
	private WebDriver driver;
	private ProductPage productPageObj;
	private ShoppingCartPage shoppingCartPageObj;
	private CheckoutBillingInformationPage checkoutBillingInformationPageObj;
	private CheckoutShippingMethod checkoutShippingMethodObj;
	private CheckoutPaymentInformation checkoutPaymentInformationObj;
	private CheckoutOrderReview checkoutOrderReviewObj;
	private CheckoutFinishedPage checkoutFinishedPageObj;
	private LoginLogoutPage loginLogoutPageObj;
	private String expectHeaderAfterCheckOut = "Your order has been received.";

	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}

	/**
	 * Login to system
	 * 
	 * @author HangNT
	 * @since 2017/07/03
	 */
	@BeforeMethod
	public void logIn() {
		loginLogoutPageObj = new LoginLogoutPage(driver);
		loginLogoutPageObj.goToLoginPage();
		loginLogoutPageObj.loginGuru("hangnguyen1611@gmail.com", "123456");
	}

	/**
	 * Verify shopping success
	 * 
	 * @author HangNT
	 * @since 2017/07/03
	 */
	@Test
	public void shoppingSuccess() {
		productPageObj = new ProductPage(driver);
		productPageObj.addProductToCart();

		shoppingCartPageObj = new ShoppingCartPage(driver);
		shoppingCartPageObj.processToCheckOutClick();

		checkoutBillingInformationPageObj = new CheckoutBillingInformationPage(driver);
		checkoutBillingInformationPageObj.billingSetting("", "hangincheck", "lastName", "Septeni", "Hanoi", "Duy tan",
				"hanoi", "2", "123456789", "AM", "1234567890");

		checkoutShippingMethodObj = new CheckoutShippingMethod(driver);
		checkoutShippingMethodObj.goToPayment();

		checkoutPaymentInformationObj = new CheckoutPaymentInformation(driver);
		checkoutPaymentInformationObj.settingPayment();

		checkoutOrderReviewObj = new CheckoutOrderReview(driver);
		checkoutOrderReviewObj.placeOrderClick();

		checkoutFinishedPageObj = new CheckoutFinishedPage(driver);
		if (checkoutFinishedPageObj.getHeaderAfterCheckOut().contentEquals(expectHeaderAfterCheckOut)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}
}

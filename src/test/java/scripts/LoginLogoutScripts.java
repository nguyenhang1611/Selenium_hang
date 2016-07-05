package test.java.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import main.java.scripts.base.TestBaseSetup;
import main.java.scripts.page.LoginLogoutPage;

/**
 * 
 * @class LoginLogoutScripts
 * 
 * @author HangNT
 * @since 2017/07/03
 *
 */
public class LoginLogoutScripts extends TestBaseSetup {
	private WebDriver driver;
	private LoginLogoutPage loginLogoutPageObj;
	private String expectLoginLabel = "My Dashboard";
	private String expectLogoutLabel = "You have logged out and will be redirected to our homepage in 5 seconds.";
	private String expectLoginReqLabel = "This is a required field.";

	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}

	/**
	 * Login Success
	 * 
	 * @author HangNT
	 * @since 2016/07/03
	 */
	@Test(priority = 2)
	public void loginSuccess() {
		loginLogoutPageObj = new LoginLogoutPage(driver);
		loginLogoutPageObj.goToLoginPage();
		loginLogoutPageObj.loginGuru("hangnguyen1611@gmail.com", "123456");
		if (loginLogoutPageObj.getLoginSuccessMsg().contentEquals(expectLoginLabel)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}

	/**
	 * Login Success
	 * 
	 * @author HangNT
	 * @since 2016/07/03
	 */
	@Test(priority = 3)
	public void loginFail() {
		loginLogoutPageObj = new LoginLogoutPage(driver);
		loginLogoutPageObj.goToLoginPage();
		loginLogoutPageObj.loginGuru("", "");
		if (loginLogoutPageObj.getEmailReqMsg().contentEquals(expectLoginReqLabel)
				&& loginLogoutPageObj.getPwdReqMsg().contentEquals(expectLoginReqLabel)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}

	/**
	 * Logout
	 * 
	 * @author HangNT
	 * @since 2016/07/03
	 */
	@Test(priority = 1)
	public void logout() {
		loginLogoutPageObj = new LoginLogoutPage(driver);
		loginLogoutPageObj.goToLoginPage();
		loginLogoutPageObj.loginGuru("hangnguyen1611@gmail.com", "123456");
		loginLogoutPageObj.logout();
		if (loginLogoutPageObj.getLogoutMsg().contentEquals(expectLogoutLabel)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}

}

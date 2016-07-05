package test.java.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import main.java.scripts.base.TestBaseSetup;
import main.java.scripts.page.RegisterPage;

/**
 * RegisterScripts class
 * 
 * @author HangNT
 * @since 2016/07/03
 */
public class RegisterScripts extends TestBaseSetup {
	private WebDriver driver;
	private RegisterPage registerPageObj;
	private String expectSuccMsg = "Thank you for registering with Main Website Store.";
	private String expectReqMsg = "This is a required field.";

	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}

	/**
	 * register Success
	 * 
	 * @author HangNT
	 * @since 2016/07/03
	 */
	@Test
	public void registerSuccess() {
		registerPageObj = new RegisterPage(driver);
		registerPageObj.goToRegisterPage();
		registerPageObj.register("fisrt name", "last name", registerPageObj.randomEmail(), "123456", "123456");
		if (registerPageObj.getSuccessMsg().contentEquals(expectSuccMsg)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}

	/**
	 * register fail with empty values
	 * 
	 * @author HangNT
	 * @since 2016/07/03
	 */
	@Test
	public void registerFailWithEmptyValues() {
		registerPageObj = new RegisterPage(driver);
		registerPageObj.goToRegisterPage();
		registerPageObj.register("", "", "", "", "");
		if (registerPageObj.getFstNameReqMsg().contentEquals(expectReqMsg)
				|| registerPageObj.getLstNameReqMsg().contentEquals(expectReqMsg)
				|| registerPageObj.getEmailReqMsg().contentEquals(expectReqMsg)
				|| registerPageObj.getPwdReqMsg().contentEquals(expectReqMsg)
				|| registerPageObj.getPwdConfirmReqMsg().contentEquals(expectReqMsg)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}
}

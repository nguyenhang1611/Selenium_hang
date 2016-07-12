package test.java.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import main.java.scripts.base.TestBaseSetup;
import main.java.scripts.page.RegisterPage;

/**
 * RegisterScripts class
 * 
 * @author HangNT
 * @since 2016/07/13
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
	 * @since 2016/07/13
	 */
	@Test
	public void registerSuccess() {
		registerPageObj = new RegisterPage(driver);
		registerPageObj.goToRegisterPage();
		registerPageObj.register("fisrt name", "last name", registerPageObj.randomEmail(), "123456", "123456");
		Assert.assertEquals(registerPageObj.getSuccessMsg(), expectSuccMsg);
	}

	/**
	 * register fail with empty values
	 * 
	 * @author HangNT
	 * @since 2016/07/13
	 */
	@Test
	public void registerFailWithEmptyValues() {
		registerPageObj = new RegisterPage(driver);
		registerPageObj.goToRegisterPage();
		registerPageObj.register("", "", "", "", "");
		Assert.assertEquals(registerPageObj.getFstNameReqMsg(), expectReqMsg);
		Assert.assertEquals(registerPageObj.getLstNameReqMsg(), expectReqMsg);
		Assert.assertEquals(registerPageObj.getEmailReqMsg(), expectReqMsg);
		Assert.assertEquals(registerPageObj.getPwdReqMsg(), expectReqMsg);
		Assert.assertEquals(registerPageObj.getPwdConfirmReqMsg(), expectReqMsg);
	}
}

package main.java.scripts.coreactions;

import org.openqa.selenium.WebDriver;

public class LoginLogoutPage extends CoreActionForm {
	private static CoreActionForm objCommon = new CoreActionForm(driver);
	private static String emailTxt = "id=email";
	private static String pwdTxt = "id=pass";
	private static String loginBtn = "id=send2";
	private static String emailReqMsgLabel = "id=advice-required-entry-email";
	private static String pwdReqMsgLabel = "id=advice-required-entry-pass";
	private static String logoutBtn="xpath=//*[@id='header-account']//ul/li[5]/a";
	private static String actualLoginLabel="xpath=//*[@id='top']//h1";
	private static String actualLogoutLabel="xpath=//*[@id='top']//p";
	public LoginLogoutPage(WebDriver driver) {
		super(driver);
	}
	

	/**
	 * go to register page
	 * 
	 * @author HangNT
	 * @since 2016/06/14
	 * @param url
	 */
	public static void goToLoginPage(String url) {
			HomePage.openUrl(url);
			objCommon.clickOnElement(HomePage.accountLinkText);
			objCommon.clickByJavascript(HomePage.logInLinkText);
	}

	/**
	 * login
	 * 
	 * @author HangNT
	 * @since 2016/06/14
	 * @param email
	 * @param pwd
	 */
	public static void loginGuru(String email, String pwd) {

		try {
			objCommon.sendKeys(emailTxt, email);
			objCommon.sendKeys(pwdTxt, pwd);
			Thread.sleep(5000);
			objCommon.clickOnElement(loginBtn);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * logout
	 * 
	 * @author HangNT
	 * @since 2016/06/14
	 */
	public static void logout() {
		objCommon.clickOnElement(logoutBtn);
	}
	
	/**
	 * get login success message
	 * @author HangNT
	 * @since 2016/06/14
	 * @return
	 */
	public static String getLoginSuccessMsg() {
		return objCommon.getCurrentTextOfElement(actualLoginLabel);
	}
	
	/**
	 * get email require message
	 * @author HangNT
	 * @since 2016/06/14
	 * @return
	 */
	public static String getEmailReqMsg() {
		return objCommon.getCurrentTextOfElement(emailReqMsgLabel);
	}
	
	/**
	 * get password require message
	 * @author HangNT
	 * @since 2016/06/14
	 * @return
	 */
	public static String getPwdReqMsg() {
		return objCommon.getCurrentTextOfElement(pwdReqMsgLabel);
	}
	
	/**
	 * get logout message success
	 * @author HangNT
	 * @since 2016/06/14
	 * @return
	 */
	public static String getLogoutMsg(){
		return objCommon.getCurrentTextOfElement(actualLogoutLabel);
	}
}

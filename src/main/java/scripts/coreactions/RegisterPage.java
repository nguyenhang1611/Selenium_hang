package main.java.scripts.coreactions;

import java.util.UUID;

import org.openqa.selenium.WebDriver;

/**
 * RegisterPage class
 * 
 * @author HangNT
 * @since 2016/06/09
 */
public class RegisterPage extends CoreActionForm {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	private static CoreActionForm objCommon = new CoreActionForm(driver);
	private static String fstNameTxt = "id=firstname";
	private static String lstNameTxt = "id=lastname";
	private static String emailTxt = "id=email_address";
	private static String pwdTxt = "id=password";
	private static String pwdConfirmTxt = "id=confirmation";
	private static String registBtn = "xpath=//button[@title='Register']";
	private static String fstNameReqMsgLabel = "id=advice-required-entry-firstname";
	private static String lstNameReqMsgLabel = "id=advice-required-entry-lastname";
	private static String emailReqMsgLabel = "id=advice-required-entry-email_address";
	private static String pwdReqMsgLabel = "id=advice-required-entry-password";
	private static String pwdConfirmReqMsgLabel = "id=advice-required-entry-confirmation";
	private static String successMsgLabel = "xpath=//div[@class='dashboard']//li/ul/li";

	/**
	 * randome email
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * 
	 * @return
	 */
	public static String randomEmail() {
		return "random-" + UUID.randomUUID().toString() + "@example.com";
	}

	/**
	 * go to register page
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @param url
	 */
	public static void goToRegisterPage(String url) {
		HomePage.openUrl(url);
		objCommon.clickOnElement(HomePage.accountLinkText);
		objCommon.clickByJavascript(HomePage.registerLinkText);
	}

	/**
	 * register account
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @param fstName
	 * @param lstName
	 * @param email
	 * @param pwd
	 * @param pwdConfirm
	 */
	public static void register(String fstName, String lstName, String email, String pwd, String pwdConfirm) {
		objCommon.sendKeys(fstNameTxt, fstName);
		objCommon.sendKeys(lstNameTxt, lstName);
		objCommon.sendKeys(emailTxt, email);
		objCommon.sendKeys(pwdTxt, pwd);
		objCommon.sendKeys(pwdConfirmTxt, pwdConfirm);
		objCommon.clickByJavascript(registBtn);
	}

	/**
	 * get success message after regist
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @return
	 */
	public static String getSuccessMsg() {

		return objCommon.getCurrentTextOfElement(successMsgLabel);
	}

	/**
	 * get fisrt name require
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @return
	 */
	public static String getFstNameReqMsg() {
		return objCommon.getCurrentTextOfElement(fstNameReqMsgLabel);
	}

	/**
	 * get last name require
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @return
	 */
	public static String getLstNameReqMsg() {
		return objCommon.getCurrentTextOfElement(lstNameReqMsgLabel);
	}

	/**
	 * get email require
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @return
	 */
	public static String getEmailReqMsg() {
		return objCommon.getCurrentTextOfElement(emailReqMsgLabel);
	}

	/**
	 * get password require
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @return
	 */
	public static String getPwdReqMsg() {
		return objCommon.getCurrentTextOfElement(pwdReqMsgLabel);
	}

	/**
	 * get password confirm require
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @return
	 */
	public static String getPwdConfirmReqMsg() {
		return objCommon.getCurrentTextOfElement(pwdConfirmReqMsgLabel);
	}
}

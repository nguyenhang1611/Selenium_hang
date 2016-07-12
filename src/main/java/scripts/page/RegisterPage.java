package main.java.scripts.page;

import java.util.UUID;

import org.openqa.selenium.WebDriver;

import main.java.scripts.coreactions.CoreActionForm;

/**
 * @class RegisterPage
 * 
 * @author HangNT
 * @since 2016/06/09
 */
public class RegisterPage extends CoreActionForm {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	private String fstNameTxt = "id=firstname";
	private String lstNameTxt = "id=lastname";
	private String emailTxt = "id=email_address";
	private String pwdTxt = "id=password";
	private String pwdConfirmTxt = "id=confirmation";
	private String registBtn = "xpath=//button[@title='Register']";
	private String fstNameReqMsgLabel = "id=advice-required-entry-firstname";
	private String lstNameReqMsgLabel = "id=advice-required-entry-lastname";
	private String emailReqMsgLabel = "id=advice-required-entry-email_address";
	private String pwdReqMsgLabel = "id=advice-required-entry-password";
	private String pwdConfirmReqMsgLabel = "id=advice-required-entry-confirmation";
	private String successMsgLabel = "xpath=//div[@class='dashboard']//li/ul/li/span";

	/**
	 * randome email
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * 
	 * @return
	 */
	public String randomEmail() {
		return "random-" + UUID.randomUUID().toString() + "@example.com";
	}

	/**
	 * go to register page
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 */
	public void goToRegisterPage() {
		HomePage homePageObj = new HomePage(driver);
		clickOnElement(homePageObj.accountLinkText);
		clickOnElement(homePageObj.registerLinkText);
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
	public void register(String fstName, String lstName, String email, String pwd, String pwdConfirm) {
		sendKeys(fstNameTxt, fstName);
		sendKeys(lstNameTxt, lstName);
		sendKeys(emailTxt, email);
		sendKeys(pwdTxt, pwd);
		sendKeys(pwdConfirmTxt, pwdConfirm);
		clickByJavascript(registBtn);
	}

	/**
	 * get success message after regist
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @return
	 */
	public String getSuccessMsg() {

		return getCurrentTextOfElement(successMsgLabel);
	}

	/**
	 * get fisrt name require
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @return
	 */
	public String getFstNameReqMsg() {
		return getCurrentTextOfElement(fstNameReqMsgLabel);
	}

	/**
	 * get last name require
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @return
	 */
	public String getLstNameReqMsg() {
		return getCurrentTextOfElement(lstNameReqMsgLabel);
	}

	/**
	 * get email require
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @return
	 */
	public String getEmailReqMsg() {
		return getCurrentTextOfElement(emailReqMsgLabel);
	}

	/**
	 * get password require
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @return
	 */
	public String getPwdReqMsg() {
		return getCurrentTextOfElement(pwdReqMsgLabel);
	}

	/**
	 * get password confirm require
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @return
	 */
	public String getPwdConfirmReqMsg() {
		return getCurrentTextOfElement(pwdConfirmReqMsgLabel);
	}
}

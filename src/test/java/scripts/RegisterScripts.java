package test.java.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import main.java.scripts.coreactions.HomePage;
import main.java.scripts.coreactions.RegisterPage;

/**
 * RegisterScripts class
 * 
 * @author HangNT
 * @since 2016/06/09
 */
public class RegisterScripts {

	private static String expectSuccMsg = "Thank you for registering with Main Website Store.";
	private static String expectReqMsg = "This is a required field.";

	/**
	 * register Success
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 */
	public static void registerSuccess() {
		WebDriver driver = new ChromeDriver();
		RegisterPage.driver = driver;
		HomePage.driver = driver;
		RegisterPage.goToRegisterPage("http://live.guru99.com/");
		RegisterPage.register("fisrt name", "last name", RegisterPage.randomEmail(), "123456", "123456");
		if (RegisterPage.getSuccessMsg().contentEquals(expectSuccMsg)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
		HomePage.closePage();
	}

	/**
	 * register fail with empty values
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 */
	public static void registerFailWithEmptyValues() {
		WebDriver driver = new ChromeDriver();
		RegisterPage.driver = driver;
		HomePage.driver = driver;
		RegisterPage.goToRegisterPage("http://live.guru99.com/");
		RegisterPage.register("", "", "", "", "");
		if (RegisterPage.getFstNameReqMsg().contentEquals(expectReqMsg)
				|| RegisterPage.getLstNameReqMsg().contentEquals(expectReqMsg)
				|| RegisterPage.getEmailReqMsg().contentEquals(expectReqMsg)
				|| RegisterPage.getPwdReqMsg().contentEquals(expectReqMsg)
				|| RegisterPage.getPwdConfirmReqMsg().contentEquals(expectReqMsg)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
		HomePage.closePage();
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/2016/AT/chromedriver_win32/chromedriver.exe");
		//registerFailWithEmptyValues();
		registerSuccess();

	}
}

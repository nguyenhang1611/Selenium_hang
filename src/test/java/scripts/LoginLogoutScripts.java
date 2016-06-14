package test.java.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import main.java.scripts.coreactions.HomePage;
import main.java.scripts.coreactions.LoginLogoutPage;

public class LoginLogoutScripts {
	private static String expectLoginLabel = "My Dashboard";
	private static String expectLogoutLabel = "You have logged out and will be redirected to our homepage in 5 seconds.";
	private static String expectLoginReqLabel = "This is a required field.";

	/**
	 * Login Success
	 * 
	 * @author HangNT
	 * @since 2016/06/14
	 */
	public static void loginSuccess() {
		WebDriver driver = new ChromeDriver();
		LoginLogoutPage.driver = driver;
		HomePage.driver = driver;
		LoginLogoutPage.goToLoginPage("http://live.guru99.com/");
		LoginLogoutPage.loginGuru("hangnguyen1611@gmail.com", "123456");
		if (LoginLogoutPage.getLoginSuccessMsg().contentEquals(expectLoginLabel)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
		HomePage.closePage();
	}

	/**
	 * Login Success
	 * 
	 * @author HangNT
	 * @since 2016/06/14
	 */
	public static void loginFail() {
		WebDriver driver = new ChromeDriver();
		LoginLogoutPage.driver = driver;
		HomePage.driver = driver;
		LoginLogoutPage.goToLoginPage("http://live.guru99.com/");
		LoginLogoutPage.loginGuru("", "");
		if (LoginLogoutPage.getEmailReqMsg().contentEquals(expectLoginReqLabel)
				&& LoginLogoutPage.getPwdReqMsg().contentEquals(expectLoginReqLabel)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
		HomePage.closePage();
	}

	public static void logout() {
		WebDriver driver = new ChromeDriver();
		LoginLogoutPage.driver = driver;
		HomePage.driver = driver;
		LoginLogoutPage.goToLoginPage("http://live.guru99.com/");
		LoginLogoutPage.loginGuru("hangnguyen1611@gmail.com", "123456");
		LoginLogoutPage.logout();
		if (LoginLogoutPage.getLogoutMsg().contentEquals(expectLogoutLabel)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
		HomePage.closePage();
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/2016/AT/chromedriver_win32/chromedriver.exe");
		loginSuccess();
		logout();
		loginFail();
	}
}

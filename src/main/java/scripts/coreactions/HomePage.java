package main.java.scripts.coreactions;

import main.java.scripts.coreactions.CoreActionForm;
import org.openqa.selenium.WebDriver;

/**
 * HomePage class
 * 
 * @author HangNT
 * @since 2016/06/09
 */
public class HomePage extends CoreActionForm {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public static String accountLinkText = "css=a.skip-link.skip-account";
	public static String registerLinkText = "xpath=//*[@id='header-account']//ul/li[5]/a";
	public static String logInLinkText = "xpath=//*[@id='header-account']//ul/li[6]/a";

	/**
	 * 
	 * @author HangNT
	 * @since 2016/06/09
	 * @param url
	 */
	public static void openUrl(String url) {
		CoreActionForm objCommon = new CoreActionForm(driver);
		objCommon.openThePage(url);
	}

	/**
	 * Close page
	 * 
	 * @author HangNT
	 * @since 106/06/09
	 */
	public static void closePage() {
		driver.close();
	}
}

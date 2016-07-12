package main.java.scripts.page;

import org.openqa.selenium.WebDriver;
import main.java.scripts.coreactions.CoreActionForm;

/**
 * @class HomePage
 * 
 * @author HangNT
 * @since 2016/06/09
 */
public class HomePage extends CoreActionForm {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public String baseUrl = "http://live.guru99.com/";
	public String accountLinkText = "css=a.skip-link.skip-account";
	public String registerLinkText = "xpath=//*[@id='header-account']//ul/li[5]/a";
	public String logInLinkText = "xpath=//*[@id='header-account']//ul/li[6]/a";
}

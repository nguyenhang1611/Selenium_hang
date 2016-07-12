package main.java.scripts.page;

import org.openqa.selenium.WebDriver;

import main.java.scripts.coreactions.CoreActionForm;

/**
 * @class ProductPage
 * 
 * @author HangNT
 * @since 2016/07/04
 */
public class ProductPage extends CoreActionForm {
	private String mobileLinkText = "xpath=//*[@id='nav']//li[1]/a[contains(., 'Mobile')]";
	private String tvLinkText = "xpath=//*[@id='nav']//li[2]/a[contains(., 'TV')]";
	private String firstProductBtn = "xpath=//*[@id='top']//ul/li[1]//button";
	private String secondProductBtn = "xpath=//*[@id='top']//ul/li[2]//button";

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * add product to shopping cart
	 * 
	 * @author HangNT
	 * @since 2016/07/04
	 */
	public void addProductToCart() {
		clickOnElement(mobileLinkText);
		clickOnElement(firstProductBtn);
		clickOnElement(tvLinkText);
		clickOnElement(secondProductBtn);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
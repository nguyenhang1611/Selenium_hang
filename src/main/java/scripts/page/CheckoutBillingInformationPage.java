package main.java.scripts.page;

import org.openqa.selenium.WebDriver;

import main.java.scripts.coreactions.CoreActionForm;

/**
 * @class CheckoutBillingInformationPage
 * 
 * @author HangNT
 * @since 2016/07/04
 */
public class CheckoutBillingInformationPage extends CoreActionForm {
	private String billingListDdl = "id=billing-address-select";
	private String fstNameTxt = "id=billing:firstname";
	private String lstNameTxt = "id=billing:lastname";
	private String companyTxt = "id=billing:company";
	private String addressTxt = "id=billing:street1";
	private String streetAddressTxt = "id=billing:street2";
	private String cityTxt = "id=billing:city";
	private String stateProvinceDdl = "id=billing:region_id";
	private String zipTxt = "id=billing:postcode";
	private String countryDdl = "id=billing:country_id";
	private String telephoneTxt = "id=billing:telephone";
	private String continueBtn = "xpath=.//*[@id='billing-buttons-container']/button[@onclick='billing.save()']";

	public CheckoutBillingInformationPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Setting billing information
	 * 
	 * @author HangNT
	 * @since 2016/07/04
	 * @param billingAddress
	 * @param firstName
	 * @param lastName
	 * @param company
	 * @param address
	 * @param streetAddress
	 * @param city
	 * @param state
	 * @param zip
	 * @param country
	 * @param telephone
	 */
	public void billingSetting(String billingAddress, String firstName, String lastName, String company, String address,
			String streetAddress, String city, String state, String zip, String country, String telephone) {
		selectValueFromDropDownList(billingAddress, billingListDdl);
		sendKeys(fstNameTxt, firstName);
		sendKeys(lstNameTxt, lastName);
		sendKeys(companyTxt, company);
		sendKeys(addressTxt, address);
		sendKeys(streetAddressTxt, streetAddress);
		sendKeys(cityTxt, city);
		selectValueFromDropDownList(state, stateProvinceDdl);
		sendKeys(zipTxt, zip);
		selectValueFromDropDownList(country, countryDdl);
		sendKeys(telephoneTxt, telephone);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOnElement(continueBtn);
	}
}

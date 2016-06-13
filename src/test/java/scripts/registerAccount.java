package test.java.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * registerAccount
 * 
 * @author HangNT
 * @since 2016/06/01
 */
public class registerAccount {
	WebDriver driver = new FirefoxDriver();

	public void register() {
		String baseUrl = "http://live.guru99.com/index.php/customer/account/create/";
		driver.get(baseUrl);
		registerFail();
		registerSuccess();
		driver.close();
	}

	/**
	 * registerFail
	 * 
	 * @author HangNT
	 * @since 2016/06/01
	 * 
	 */
	public void registerFail() {
		// khai bao message mong muon duoc hien thi ra sau khi dang ky that bai
		String expectReqMsg = "This is a required field.";

		// click vao button register
		driver.findElement(By.xpath("//button[@title='Register']")).click();

		// get text thuc te duoc hien thi ra sau khi dang ky that bai
		String fstNameReq = driver.findElement(By.id("advice-required-entry-firstname")).getText();
		String lstNameReq = driver.findElement(By.id("advice-required-entry-lastname")).getText();
		String emailReq = driver.findElement(By.id("advice-required-entry-email_address")).getText();
		String pwdReq = driver.findElement(By.id("advice-required-entry-password")).getText();
		String pwdconfirmReq = driver.findElement(By.id("advice-required-entry-confirmation")).getText();

		// verify text thuc te va text mong muon duoc hien thi ra sau khi dang
		// ky that bai
		if (fstNameReq.contentEquals(expectReqMsg) && lstNameReq.contentEquals(expectReqMsg)
				&& emailReq.contentEquals(expectReqMsg) && pwdReq.contentEquals(expectReqMsg)
				&& pwdconfirmReq.contentEquals(expectReqMsg)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}
	}

	/**
	 * registerSuccess
	 * 
	 * @author HangNT
	 * @since 2016/06/01
	 * 
	 */
	public void registerSuccess() {
		// khai bao message mong muon duoc hien thi ra sau khi dang ky thanh
		// cong
		String expectSuccMsg = "Thank you for registering with Main Website Store.";

		// cac step thuc hien de dang ky user
		driver.findElement(By.id("firstname")).sendKeys("hangnt123");
		driver.findElement(By.id("lastname")).sendKeys("nguyen hang");
		driver.findElement(By.id("email_address")).sendKeys("hang67111118@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("confirmation")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@title='Register']")).click();

		// get text thuc te duoc hien thi ra sau khi dang ky thanh cong
		String successMsg = driver.findElement(By.xpath("//div[@class='dashboard']//li/ul/li")).getText();

		// verify text thuc te va text mong muon duoc hien thi ra sau khi dang
		// ky thanh cong
		if (successMsg.contentEquals(expectSuccMsg)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Fail!");
		}

	}
}

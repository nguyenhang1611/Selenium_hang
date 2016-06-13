package test.java.scripts;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

/**
 * verifyElement
 * 
 * @author HangNT
 * @since 2016/06/01
 * 
 */
public class verifyElement {
	/**
	 * exercise1Day3
	 * 
	 * @author HangNT
	 * @since 2016/06/01
	 * 
	 */
	public void exercise1Day3() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://only-testing-blog.blogspot.in/2013/09/test.html?";

		// open trang web
		// "http://only-testing-blog.blogspot.in/2013/09/test.html?"
		driver.get(baseUrl);

		// send key to text box: first name text box
		driver.findElement(By.id("fname")).sendKeys("hangin");

		// select checkbox: select last name voi gia tri co value la Car va Boat
		driver.findElement(By.cssSelector("input[value='Car']")).click();
		driver.findElement(By.cssSelector("input[value='Boat']")).click();

		// select radio button: select gioi tinh voi gia tri co value la female
		driver.findElement(By.cssSelector("input[value='female']")).click();

		// select gia tri tu dropdown list [Select Box] voi gia tri co value la
		// Singapore
		driver.findElement(By.cssSelector("option[value='Singapore']")).click();

		// select 1 gia tri o box list quoc gia ben trai de chuyen sang box ben
		// phai
		driver.findElement(By.cssSelector("option[value='MEX']")).click();
		driver.findElement(By.cssSelector("input[value='->']")).click();

		// press submit query button
		driver.findElement(By.id("submitButton")).click();

		// click text link and back
		driver.findElement(By.linkText("Facebook")).click();
		driver.navigate().back();

		// verify an element in table
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
		System.out.println("Verify an element in table: " + innerText);

		// upload file o muc [Select a file]
		WebElement uploadElement = driver.findElement(By.name("img"));
		uploadElement.click();

		uploadFile("C:\\libaries\\Pictures\\1.23MB.jpg");
		Thread.sleep(2000);

		driver.close();

	}

	/**
	 * setClipboardData
	 * 
	 * @param string
	 * @author HangNT
	 * @since 2016/06/01
	 * 
	 */
	public static void setClipboardData(String string) {
		// StringSelection is a class that can be used for copy and paste
		// operations.
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	/**
	 * uploadFile
	 * 
	 * @param fileLocation
	 * @author HangNT
	 * @since 2016/06/01
	 * 
	 */
	public static void uploadFile(String fileLocation) {
		try {
			// Setting clipboard with file location
			setClipboardData(fileLocation);
			// native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

}

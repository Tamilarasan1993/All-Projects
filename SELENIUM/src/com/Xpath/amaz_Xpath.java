package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amaz_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fie%3DUTF8%26tag%3Dgooginprimeexpt5-21%26ascsubtag%3D_k_Cj0KCQjwjIKYBhC6ARIsAGEds-Ju0AYBJDPeO0nRD_yYwhvZVI8wDo4SwWvAo5R3LPIZV4Booq0531MaAuGnEALw_wcB_k_%26gclid%3DCj0KCQjwjIKYBhC6ARIsAGEds-Ju0AYBJDPeO0nRD_yYwhvZVI8wDo4SwWvAo5R3LPIZV4Booq0531MaAuGnEALw_wcB%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
		user.sendKeys("9962270938");
		WebElement click = driver.findElement(By.xpath("//input[@type='submit']"));
		click.click();
		WebElement user1 = driver.findElement(By.xpath("//input[@id='ap_password']"));
		user1.sendKeys("Tom@885588");
		WebElement button = driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
		button.click();
	}
	
	
}

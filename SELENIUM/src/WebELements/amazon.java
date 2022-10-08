package WebELements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement user = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
		user.click();
		
		WebElement user1 = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-radio'])[3]"));
		user1.click();
		WebElement user3 = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		user3.click();
	}
	

}

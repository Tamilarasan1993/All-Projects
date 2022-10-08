package WebELements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElements {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		//user.sendKeys("Tamil");
		//user.clear();
		//user.sendKeys("Tom");
		String name = user.getAttribute("name");
		System.out.println(name);
		String value = user.getAttribute("value");
		System.out.println(value);
		Dimension size = user.getSize();
		System.out.println(size);
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		System.out.println(text.getText());
		System.out.println(text.getTagName());
		
		
		
		
		
	}

}

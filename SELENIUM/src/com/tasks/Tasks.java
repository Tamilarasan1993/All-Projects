package com.tasks;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tasks {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("tomsts@1993.com");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.xpath("(//input[@data-validate='isName'])[1]")).sendKeys("Tom");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Sts");
		driver.findElement(By.xpath("//input[contains(@class,'is_required') and (@type='password')]")).sendKeys("Tamil1993");
		WebElement date = driver.findElement(By.xpath("//select[@name='days']"));
		Select s1 = new Select(date);
		s1.selectByValue("9");
		WebElement mon = driver.findElement(By.xpath("//select[@name='months']"));
		Select s2 = new Select(mon);
		s2.selectByVisibleText("December ");
		WebElement year = driver.findElement(By.xpath("//select[@name='years']"));
		Select s3 = new Select(year);
		s3.selectByValue("1993");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("Tom");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[6]")).sendKeys("Sts");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[7]")).sendKeys("Marval");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[8]")).sendKeys("Chenna,TamilNadu");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[9]")).sendKeys("Chennai,TamilNadu");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[10]")).sendKeys("Chennai");
		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select s5 = new Select(state);
		s5.selectByValue("9");
		driver.findElement(By.xpath("(//input[contains(@class,'form')])[12]")).sendKeys("00009");
		WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
		Select s6 = new Select(country);
		//s6.selectByVisibleText("United States");
		driver.findElement(By.xpath("//textarea[@name='other']")).sendKeys("Hello World");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("044443654");
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("99999999");
		driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
		Thread.sleep(6000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Jayasri\\eclipse-workspace\\SELENIUM\\snaps\\snap.png");
		FileUtils.copyFile(source,destination);
		
	}

}
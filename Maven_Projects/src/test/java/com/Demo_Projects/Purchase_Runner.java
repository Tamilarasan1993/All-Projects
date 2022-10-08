package com.Demo_Projects;
import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utility_Files.Base_Class;

public class Purchase_Runner extends Base_Class{	
	public static WebDriver driver;
public static void main(String[] args) throws AWTException, IOException, InterruptedException {
	driver=Browser("Chrome");
	 //order1
	GetUrl("http://automationpractice.com/index.php?id_category=9&controller=category");
	Click(driver.findElement(By.xpath("//a[normalize-space()='Sign in']")));
	Sendkeys(driver.findElement(By.xpath("//div//child::input[@id='email']")), "tomsts@1993.com");
	Sendkeys(driver.findElement(By.xpath("//div//descendant::input[@id='passwd']")), "Tamil1993");
	Click(driver.findElement(By.xpath("//i//ancestor::button[@id='SubmitLogin']")));
	ACTIONS(driver.findElement(By.xpath("//a[.='Women']")), "MOveTO");
	ACTIONS(driver.findElement(By.xpath("(//ul//descendant::a[text()='Casual Dresses'])[1]")), "CLick");
	ACTIONS(driver.findElement(By.xpath("//img[@title='Printed Dress']")), "MOveTo");
	ACTIONS(driver.findElement(By.xpath("//a[@class='quick-view-mobile']")), "Click");
	FRAMES(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
	Clear(driver.findElement(By.xpath("//input[@name='qty']")));
	Sendkeys(driver.findElement(By.xpath("//input[@name='qty']")), "3");
	SelectValue(driver.findElement(By.xpath("//select[@name='group_1']")), "2");
	Click(driver.findElement(By.xpath("//button[@name='Submit']")));
	Click(driver.findElement(By.xpath("//a[@title='Proceed to checkout']")));
	Click(driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")));
	Click(driver.findElement(By.xpath("//button[@name='processAddress']")));
	Click(driver.findElement(By.xpath("//input[@name='cgv']")));
	Click(driver.findElement(By.xpath("//button[@name='processCarrier']")));
	Click(driver.findElement(By.xpath("//p//child::a[@title='Pay by bank wire']")));
	Click(driver.findElement(By.xpath("//a//following-sibling::button")));	
	//order2
	ACTIONS(driver.findElement(By.xpath("//a[.='Women']")), "MOveTO");
	ACTIONS(driver.findElement(By.xpath("//li[@id='category-thumbnail']//preceding::a[@title='Evening Dresses']")), "Click");
	ACTIONS(driver.findElement(By.xpath("//img[@title='Printed Dress']")), "moveTO");
	ACTIONS(driver.findElement(By.xpath("//a[@class='quick-view-mobile']")), "Click");
	FRAMES(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
	ACTIONS(driver.findElement(By.xpath("//i[@class='icon-plus']")), "click");
	ACTIONS(driver.findElement(By.xpath("//i[@class='icon-plus']")), "click");
	SelectValue(driver.findElement(By.xpath("//select[@name='group_1']")), "2");
	ACTIONS(driver.findElement(By.xpath("//a[@name='Beige']")), "Click");
	ACTIONS(driver.findElement(By.xpath("//button[@name='Submit']")), "click");
	Click(driver.findElement(By.xpath("//a[@title='Proceed to checkout']")));
	Click(driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")));
	Click(driver.findElement(By.xpath("//button[@name='processAddress']")));
	Click(driver.findElement(By.xpath("//input[@name='cgv']")));
	Click(driver.findElement(By.xpath("//button[@name='processCarrier']")));
	Click(driver.findElement(By.xpath("//p//child::a[@title='Pay by bank wire']")));
	Click(driver.findElement(By.xpath("//a//following-sibling::button")));
	Click(driver.findElement(By.xpath("//a[@title='Back to orders']")));
	driver.manage().window().maximize();
	Thread.sleep(4000);
	ScreenShot("C:\\Users\\Jayasri\\eclipse-workspace\\Maven_Projects\\snaps\\purchase.png");
}
}




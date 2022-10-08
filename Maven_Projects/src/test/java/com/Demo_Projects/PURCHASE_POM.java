package com.Demo_Projects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.POM_Purchase.Confirm;
import com.POM_Purchase.Dresses;
import com.POM_Purchase.My_account;
import com.POM_Purchase.Payment;
import com.POM_Purchase.Proceed1;
import com.POM_Purchase.Proceed2;
import com.POM_Purchase.Proceed3;
import com.POM_Purchase.Signin_btn;
import com.PageObjectManager.Purchase_POManager;

import Utility_Files.Base_Class;

public class PURCHASE_POM extends Base_Class{
	public static WebDriver driver = Base_Class.Browser("Chrome");
	public static Purchase_POManager manager = new Purchase_POManager(driver);
	public static void main(String[] args) throws InterruptedException, IOException  {
		GetUrl("http://automationpractice.com/index.php");
		Click(manager.getSign().getSignin_btn());
		Sendkeys(manager.getSign().getEmail(),DATADRIVEN_PartCell(0, 3, 5));
		Sendkeys(manager.getSign().getPwd(),DATADRIVEN_PartCell(0, 4, 5));
		Click(manager.getSign().getLogin_btn());
		ACTIONS(manager.getMy().getDresses(), "MoveTO");
		ACTIONS(manager.getMy().getCasual(), "Click");
		ACTIONS(manager.getQuick().getPrintedDress(), "MoveTo");
		ACTIONS(manager.getQuick().getQuickview(), "Click");
		FRAMES(manager.getQuick().getIframe());
		Clear(manager.getQuick().getQty());
		Sendkeys(manager.getQuick().getQty(), DATADRIVEN_PartCell(0, 9, 5));
		SelectValue(manager.getQuick().getSize(), "2");
		Click(manager.getQuick().getOrange());
		Click(manager.getQuick().getAddtoCart());
		Click(manager.getQuick().getProceed());
		Click(manager.getPro1().getProceed());
		Click(manager.getPro2().getProceed());
		Click(manager.getPro3().getCheckbox());
		Click(manager.getPro3().getProceed());
		Click(manager.getMode().getPay());
		Click(manager.getOrder().getConfirmOrder());
		//ORDER 2
		ACTIONS(manager.getMy().getDresses(), "MoveTO");
		ACTIONS(manager.getMy().getEveningDress(), "Click");
		ACTIONS(manager.getQuick().getPrintedDress(), "MoveTo");
		ACTIONS(manager.getQuick().getQuickview(), "Click");
		FRAMES(manager.getQuick().getIframe());
		Clear(manager.getQuick().getQty());
		Sendkeys(manager.getQuick().getQty(), "3");
		SelectValue(manager.getQuick().getSize(), "2");
		Click(manager.getQuick().getPink());
		Click(manager.getQuick().getAddtoCart());
		Click(manager.getQuick().getProceed());
		Click(manager.getPro1().getProceed());
		Click(manager.getPro2().getProceed());
		Click(manager.getPro3().getCheckbox());
		Click(manager.getPro3().getProceed());
		Click(manager.getMode().getPay());
		Click(manager.getOrder().getConfirmOrder());
		Thread.sleep(10000);
		ScreenShot("C:\\Users\\Jayasri\\eclipse-workspace\\Maven_Projects\\snaps\\POM_Purchase.png");
	}
}
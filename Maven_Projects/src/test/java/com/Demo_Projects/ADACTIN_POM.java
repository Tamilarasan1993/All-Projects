package com.Demo_Projects;

import java.awt.print.Book;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POM_Adactin.BookNow;
import com.POM_Adactin.Home_Page;
import com.POM_Adactin.RadioButton;
import com.POM_Adactin.Search;
import com.PageObjectManager.Adactin_POManager;

import Utility_Files.Base_Class;
public class ADACTIN_POM extends Base_Class{
	public static WebDriver driver = Base_Class.Browser("Chrome");
	public static Logger log = Logger.getLogger(Adactin_Booking.class);
	public static Adactin_POManager manager = new Adactin_POManager(driver);
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		GetUrl("https://adactinhotelapp.com/SearchHotel.php");
		Sendkeys(manager.getHome().getEmail(),"Tamil1993");
		Sendkeys(manager.getHome().getPassword(), "P9EHXF");
		Click(manager.getHome().getLogin());
		log.info("Logged in");
		SelectValue(manager.getPage2().getLocation(),"Sydney");
		SelectValue(manager.getPage2().getHotels(), "Hotel Hervey");
		SelectValue(manager.getPage2().getRoomtype(), "Deluxe");
		SelectValue(manager.getPage2().getRooms(), "2");
		Clear(manager.getPage2().getCheckin());
		Sendkeys(manager.getPage2().getCheckin(), "09/12/2022");
		Clear(manager.getPage2().getCheckout());
		Sendkeys(manager.getPage2().getCheckout(), "10/12/2022");
		SelectIndex(manager.getPage2().getAdults(), 4);
		SelectValue(manager.getPage2().getChilds(), "1");
		Click(manager.getPage2().getSearch());
		log.info("Hotel Searching done");
		Click(manager.getRadio().getRadio_btn());
		Click(manager.getRadio().getProceed());
		Sendkeys(manager.getBook().getFirstname(), "Tom");
		Sendkeys(manager.getBook().getLastname(), "Sts");
		Sendkeys(manager.getBook().getAddress(), "INDIA,CHENNAI");
		Sendkeys(manager.getBook().getCard_no(), "9988776655443322");
		SelectValue(manager.getBook().getCard_type(), "AMEX");
		SelectValue(manager.getBook().getExp_mon(), "12");
		SelectValue(manager.getBook().getExp_year(), "2022");
		Sendkeys(manager.getBook().getCvv_no(), "373");
		Click(manager.getBook().getBookNow());
		log.info("Hotel Booked Successfully");
		Click(manager.getBook().getItinerary());
		Click(manager.getBook().getSearchHotel());
		log.info("Proceeding for booking Second Hotel");
		//hotel2
		SelectValue(manager.getPage2().getLocation(),"Brisbane");
		SelectValue(manager.getPage2().getHotels(), "Hotel Cornice");
		SelectValue(manager.getPage2().getRoomtype(), "Super Deluxe");
		SelectValue(manager.getPage2().getRooms(), "1");
		Clear(manager.getPage2().getCheckin());
		Sendkeys(manager.getPage2().getCheckin(), "09/12/2022");
		Clear(manager.getPage2().getCheckout());
		Sendkeys(manager.getPage2().getCheckout(), "10/12/2022");
		SelectIndex(manager.getPage2().getAdults(), 4);
		SelectValue(manager.getPage2().getChilds(), "0");
		Click(manager.getPage2().getSearch());
		Click(manager.getRadio().getRadio_btn());
		Click(manager.getRadio().getProceed());
		Sendkeys(manager.getBook().getFirstname(), "Captain");
		Sendkeys(manager.getBook().getLastname(), "America");
		Sendkeys(manager.getBook().getAddress(), "Avenfers,Marvel");
		Sendkeys(manager.getBook().getCard_no(), "9988776655443322");
		SelectValue(manager.getBook().getCard_type(), "AMEX");
		SelectValue(manager.getBook().getExp_mon(), "12");
		SelectValue(manager.getBook().getExp_year(), "2022");
		Sendkeys(manager.getBook().getCvv_no(), "007");
		Click(manager.getBook().getBookNow());
		Click(manager.getBook().getItinerary());
		log.info("Second Hotel Booked Successfully");
//		Thread.sleep(10000);
//		ScreenShot("C:\\Users\\Jayasri\\eclipse-workspace\\Maven_Projects\\snaps\\POM_ADACTIN.png");
	}
}




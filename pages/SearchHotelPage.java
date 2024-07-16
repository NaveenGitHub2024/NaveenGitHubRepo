package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;


public class SearchHotelPage extends BasePage{
	
	@FindBy(xpath="//select[@id='location']")
	WebElement location_name;
	
	@FindBy(xpath="//select[@id='hotels']")
	WebElement hotel_name_;
	
	@FindBy(xpath="//select[@id='room_type']")
	WebElement room_type;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	WebElement noof_rooms;
	
	@FindBy(xpath = "(//input[@class='date_pick'])[1]")
	WebElement check_in_date;
	
	@FindBy(xpath = "(//input[@class='date_pick'])[2]")
	WebElement check_out_date;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	WebElement adults_per_room;
	
	@FindBy(xpath = "//select[@id='child_room']")
	WebElement children_per_room;
	
	@FindBy(xpath="//input[@id='Submit']")
	WebElement search_button;
	
	@FindBy(xpath="//input[@id='Reset']")
	WebElement reset_button;
	
	@FindBy(xpath="//span[@id='checkin_span']")
	WebElement check_in_datevalidatemesg;
	
	@FindBy(xpath = "//span[@id='checkout_span']")
	WebElement check_out_datevalidatemesg;
	
	public void location_name(String text) {
		selectFromDropDown(location_name, text);
	}
	
	public void hotel_name(String text) {
		selectFromDropDown(hotel_name_, text);
		test.info("selected"+text+"from dropdown");
	}
	
	public void room_type(String text) {
		selectFromDropDown(room_type, text);
		test.info("selected"+text+"from dropdown");
	}
	
	public void noof_rooms(String text) {
		selectFromDropDown(noof_rooms, text);
		test.info("selected"+text+"from dropdown"+noof_rooms);
	}
	
	public void check_in_date(String date) {
		clear(check_in_date);
		test.info("textbox"+check_in_date);
		sendKeys(check_in_date, date);
		test.info("enterted " +date+"in the field"+check_in_date);
	}
	public void check_out_date(String date) {
		clear(check_out_date);
		test.info("textbox"+check_out_date);
		sendKeys(check_out_date, date);
		test.info("enterted " +date+"in the field"+check_out_date);
	}
	public void adults_per_room(String text) {
		selectFromDropDown(adults_per_room, text);
		test.info("selected"+text+"from dropdown"+adults_per_room);
	}
	public void children_per_room(String text) {
		selectFromDropDown(children_per_room, text);
		test.info("selected"+text+"from dropdown"+children_per_room);
		
	}
	public void search_button() {
		search_button.click();
		test.info("clicked the searchbutton"+search_button);
	}
	public void reset_button() {
		reset_button.click();
		test.info("clicked reset"+reset_button);
	}
	public WebElement check_in_datevalidatemesg() {
	return	check_in_datevalidatemesg;
	}
	public WebElement check_out_datevalidatemesg() {
		return	check_out_datevalidatemesg;
	}
	
	@FindBy(linkText = "Booked Itinerary")
	WebElement BookedItinerary;
	
	public void BookedItinerary() {
		BookedItinerary.click();
		test.info("clicked Booked Itinerary button"+BookedItinerary);
	}
}
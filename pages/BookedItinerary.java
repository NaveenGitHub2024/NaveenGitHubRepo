package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookedItinerary extends BasePage{
	
	@FindBy(xpath = "(//input[@name='ids[]'])[1]")
	WebElement select;
	public void select() {
		select.click();
		test.info("clicked button"+select);
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'order_id_')])[2]")
	WebElement  OrderID;
	public WebElement  OrderID() {
		return OrderID;
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'btn_id')])[1]") 
	WebElement  Cancel;
	public WebElement  Cancel() {
		return Cancel;
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'hotel_name')])[1]") 
	WebElement  HotelName;
	public WebElement  HotelName() {
		return HotelName;
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'location_')])[1]")
	WebElement  Location;
	public WebElement  Location() {
		return Location;
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'rooms_')])[1]")
	WebElement  NoOfRooms;
	public WebElement  NoOfRooms() {
		return NoOfRooms;
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'first_name_')])[1]")
	WebElement  FirstName;
	public WebElement  FirstName() {
		return FirstName;
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'last_name_')])[1]")
	WebElement  LastName;
	public WebElement  LastName() {
		return LastName;
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'arr_date_')])[1]")
	WebElement  ArrivalDate;
	public WebElement  ArrivalDate() {
		return ArrivalDate;
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'dep_date_')])[1]")
	WebElement  DepartureDate;
	public WebElement  DepartureDate() {
		return DepartureDate;
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'no_days_')])[1]")
	WebElement  NoOfDays;
	public WebElement  NoOfDays() {
		return NoOfDays;
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'room_type_')])[1]")
	WebElement  RoomsType;
	public WebElement  RoomsType() {
		return RoomsType;
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'price_night_')])[1]")
	WebElement  PricePerNight;
	public WebElement  PricePerNight() {
		return PricePerNight;
	}
	
	@FindBy(xpath = "(//input[starts-with(@id,'total_price_')])[1]")
	WebElement  TotalPrice;
	public WebElement  TotalPrice() {
		return TotalPrice;
	}
	
	@FindBy(xpath = "//input[@id='order_id_text']")
	WebElement SearchItinenary;
	public void SearchItinenary(String text) {
		SearchItinenary.sendKeys(text);
		test.info("enterted " +text+"in the field"+SearchItinenary);
	}
	
	@FindBy(xpath = "//input[@id='search_hotel_id']")
	WebElement Go;
	public void Go() {
		Go.click();
		test.info("clicked button"+Go);
	}
	
	@FindBy(xpath = "//input[@name='cancelall']")
	WebElement CancelSelected;
	public void CancelSelected() {
		CancelSelected.click();
		test.info("clicked button"+CancelSelected);
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();;
		test.info("Accepted the alert");
	}
	
	@FindBy(xpath = "//label[@id='search_result_error']")
	WebElement cancelConfirmation;
	public WebElement cancelConfirmation() {
		return cancelConfirmation;
	}
	
	@FindBy(xpath = "//INPUT[@ID='logout']")
	WebElement Logout;
	public void Logout() {
		Logout.click();
		test.info("clicked button"+Logout);
	}

}

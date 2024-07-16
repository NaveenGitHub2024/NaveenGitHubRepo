package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmationPage extends BasePage{
	
	@FindBy(xpath = "//input[@id='hotel_name']")
	WebElement HotelName;
	
	public WebElement HotelName(){
	return HotelName;
	}
	
	@FindBy(xpath = "//input[@id='location']")
	WebElement  Location;
	public WebElement  Location() {
	return Location;
	}

	@FindBy(xpath = "//input[@id='room_type']")
	WebElement  RoomType;
	public WebElement  RoomType() {
	return RoomType;
	}
	
	@FindBy(xpath = "//input[@id='arrival_date']")
	WebElement  ArrivalDate;
	public WebElement  ArrivalDate() {
	return ArrivalDate;
	}

	@FindBy(xpath = "//input[@id='departure_text']")
	WebElement  DepartureDate;
	public WebElement  DepartureDate(){
	return DepartureDate;
	}

	@FindBy(xpath = "//input[@id='total_rooms']")
	WebElement  TotalRooms;
	public WebElement  TotalRooms() {
	return TotalRooms;
	}

	@FindBy(xpath = "//input[@id='adults_room']")
	WebElement  AdultPerRoom;
	public WebElement  AdultPerRoom() {
	return AdultPerRoom;
	}
	
	@FindBy(xpath = "//input[@id='children_room']")
	WebElement  ChilderPerRoom;
	public WebElement  ChilderPerRoom() {
	return ChilderPerRoom;
	}
	
	@FindBy(xpath = "//input[@id='price_night']")
	WebElement  PricePerNight;
	public WebElement  PricePerNight() {
	return PricePerNight;
	}
	
	@FindBy(xpath = "//input[@id='total_price']")
	WebElement  TotalPrice;
	public WebElement  TotalPrice() {
	return TotalPrice;
	}

	@FindBy(xpath = "//input[@id='gst']")
	WebElement  GST;
	public WebElement  GST() {
	return GST;
	}

	@FindBy(xpath = "//input[@id='final_price']")
	WebElement  FinalBilledPrice;
	public WebElement  FinalBilledPrice() {
	return FinalBilledPrice;
	}

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement  FirstName;
	public WebElement  FirstName() {
	return FirstName;
	}
	
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement  LastName;
	public WebElement  LastName() {
	return LastName;
	}

	@FindBy(xpath = "//textarea[@id='address']")
	WebElement  BillingAddress;
	public WebElement  BillingAddress() {
		return BillingAddress;
	}
	

	@FindBy(xpath = "//input[@id='search_hotel']")
	WebElement  SearchHotel;
	public WebElement  SearchHotel() {
		return SearchHotel;
	}
	
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	WebElement MyItinerary;
	public void  MyItinerary() {
		MyItinerary.click();
		test.info("clicked button"+MyItinerary);
	}
	 ;
	
	@FindBy(xpath = "//input[@id='logout']")
	WebElement LogoutButton;
	
	public void LogoutButton() {
		LogoutButton.click();
		test.info("clicked button"+LogoutButton);
	}
	
	@FindBy(xpath = "//input[@id='order_no']")
	WebElement OrderNo;
	
	public WebElement OrderNo() {
		return OrderNo;		
	}

	public void wait(int timeoutMillis, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}
			
}

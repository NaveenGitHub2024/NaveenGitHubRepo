package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectHotelPage extends BasePage{
	@FindBy(xpath="//input[@id='hotel_name_0']")
	WebElement HotelName;
	
	@FindBy(xpath = "//input[@id='location_0']")
	WebElement HotelLocation;
	
	@FindBy(xpath = "//input[@id='rooms_0']")
	WebElement HotalRooms;
	
	@FindBy(xpath = "//input[@id='arr_date_0']")
	WebElement HotelArrivalData;
	
	@FindBy(xpath = "//input[@id='dep_date_0']")
	WebElement HotelDepartureDate;
	
	@FindBy(xpath = "//input[@id='no_days_0']")
	WebElement NoOfDays;
	
	@FindBy(xpath = "//input[@id='rooms_0']")
	WebElement HotelNoOfRooms;
	
	@FindBy(xpath = "//input[@id='room_type_0']")
	WebElement HotelRoomsType;
	
	@FindBy(xpath = "//input[@id='price_night_0']")
	WebElement PricePerNight;
	
	@FindBy(xpath = "//input[@id='total_price_0']")
	WebElement TotalPrice;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement ContinueButton;
	
	@FindBy(xpath = "//input[@id='cancel']")
	WebElement CancelButton;
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	WebElement SelectButton1;
	
	public WebElement HotelName() {
		
		return HotelName;
	}
	
	public void ContinueButton() {
		ContinueButton.click();
		test.info("clicked continue button"+ContinueButton);
	}
	
	public void CancelButton() {
		CancelButton.click();
		test.info("clicked continue button"+CancelButton);
	}
	
	public  WebElement HotelLocation() {
		return HotelLocation;
	}
	
	public WebElement HotalRooms() {
		return HotalRooms;
	}
	
	public WebElement HotelArrivalData() {
		return HotelArrivalData;
	}
	
	 public void waitForCheckInDate() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOf(HotelArrivalData));
	    }
	
	public WebElement HotelDepartureDate() {
		return HotelDepartureDate;
	}
	
	public WebElement HotelNoOfRooms() {
		return HotelNoOfRooms;
	}
	
	public WebElement HotelRoomsType() {
		return HotelRoomsType;
	}
	
	 public void waitForHotelName() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.visibilityOf(HotelName));
	    }
	 
	 public WebElement TotalPrice() {
		return TotalPrice;		 		 		 				 
	 }
	 
	public WebElement NoOfDays() {
		return NoOfDays;
	}
	
	public void SelectButton1() {
		SelectButton1.click();
		test.info("clicked button"+SelectButton1);
	}
	
	

}

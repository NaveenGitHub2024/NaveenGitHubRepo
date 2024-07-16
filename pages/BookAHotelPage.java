package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookAHotelPage extends BasePage{
		@FindBy(xpath = "//input[@id='first_name']")
		WebElement FirstName;
		
		public void FirstName(String text) {
			sendKeys(FirstName, text);
			test.info("enterted " +text+"in the field"+FirstName);
		}
		
		@FindBy(xpath = "//input[@id='last_name']")
		WebElement LastName;
		
		public void LastName(String text) {
			sendKeys(LastName, text);
			test.info("enterted " +text+"in the field"+LastName);
		}
		
		@FindBy(xpath = "//textarea[@id='address']")
		WebElement BillingAddress;
		
		public void BillingAddress(String text) {
			sendKeys(BillingAddress, text);
			test.info("enterted " +text+"in the field"+BillingAddress);
		}
		
		@FindBy(xpath = "//input[@id='cc_num']")
		WebElement CreditCardNumber;
		
		public void CreditCardNumber(String text) {
			sendKeys(CreditCardNumber, text);
			test.info("enterted " +text+"in the field"+CreditCardNumber);
		}
		
		@FindBy(xpath = "//select[@id='cc_type']")
		WebElement CreditCardType;
		
		public void CreditCardType(String text) {
			selectFromDropDown(CreditCardType, text);
			test.info("selected"+text+"from dropdown"+CreditCardType);
		}
		
		@FindBy(xpath = "//select[@id='cc_exp_month']")
		WebElement ExpiryMonth;
		
		public void ExpiryMonth(String text) {
			selectFromDropDown(ExpiryMonth, text);
			test.info("selected"+text+"from dropdown"+ExpiryMonth);
			
		}
		
		@FindBy(xpath = "//select[@id='cc_exp_year']")
		WebElement ExpiryYear;
		
		public void ExpiryYear(String text) {
			selectFromDropDown(ExpiryYear, text);
			test.info("selected"+text+"from dropdown"+ExpiryYear);
		}
		
		@FindBy(xpath = "//input[@id='cc_cvv']")
		WebElement CVVNumber;
		
		public void CVVNumber(String text) {
			sendKeys(CVVNumber, text);
			test.info("enterted " +text+"in the field"+CVVNumber);
		}
		
		@FindBy(xpath = "//input[@id='book_now']")
		WebElement BookNowButton;
		
		public void BookNowButton() {
			BookNowButton.click();
			test.info("clicked button"+BookNowButton);
		}
		
		@FindBy(xpath = "//input[@id='cancel']")
		WebElement CancelButton;
		
		public void CancelButton() {
			CancelButton.click();
			test.info("clicked button"+CancelButton);
			
		}
		
		@FindBy(xpath = "//input[@id='hotel_name_dis']")
		WebElement HotelName;
		public WebElement HotelName() {
			return HotelName;
		}
		
		@FindBy(xpath = "//input[@id='location_dis']")
		WebElement Location;
		public WebElement Location() {
			return Location;
		}
		
		@FindBy(xpath = "//input[@id='room_type_dis']")
		WebElement RoomType;;
		public WebElement RoomType() {
			return RoomType;
		}
		
		@FindBy(xpath = "//input[@id='room_num_dis']")
		WebElement NumberOfRooms;
		public WebElement NumberOfRooms() {
			return NumberOfRooms;
		}
		
		@FindBy(xpath = "//input[@id='total_days_dis']")
		WebElement TotalDays;
		public WebElement TotalDays() {
			return TotalDays;
		}
		
		@FindBy(xpath = "//input[@id='price_night_dis']")
		WebElement PricePerNight;
		public WebElement PricePerNight() {
			return PricePerNight;
		}
		
		@FindBy(xpath = "//input[@id='gst_dis']")
		WebElement GST;
		public WebElement GST() {
			return GST;
		}
		
		@FindBy(xpath = "//input[@id='total_price_dis']")	
		WebElement TotalPrice;
		public WebElement TotalPrice() {
			return TotalPrice;
			
		}
		
		@FindBy(xpath = "//input[@id='final_price_dis']")
		WebElement FinalBilledPrice;
		
		public WebElement FinalBilledPrice() {
			return FinalBilledPrice;
		}
		
}

package pomtestscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BookAHotelPage;
import pages.BookedItinerary;
import pages.BookingConfirmationPage;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;
import util.UtilKit3;

public class TC116 extends BaseTest{
	
	@Test(dataProvider = "getData116")
	public void TC116(HashMap<String, String> hMap) {
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.username_textbox("reyaz0806");
		lp.password_textbox("reyaz123");
		lp.login_button();

		SearchHotelPage sp = PageFactory.initElements(driver, SearchHotelPage.class);
		sp.location_name(hMap.get("Location"));
		sp.hotel_name(hMap.get("Hotel Name"));
		sp.room_type(hMap.get("Room type"));
		sp.noof_rooms(hMap.get("Number of Rooms"));
		sp.check_in_date(hMap.get("Checkindate"));
		sp.check_out_date(hMap.get("Checkoutdate"));
		sp.search_button();

		SelectHotelPage shp = PageFactory.initElements(driver, SelectHotelPage.class);
		shp.SelectButton1();
		shp.ContinueButton();

		BookAHotelPage bhp = PageFactory.initElements(driver, BookAHotelPage.class);
		String expiryYear = String.valueOf(hMap.get("ExpiryYear"));
		if (expiryYear.contains(".")) {
			expiryYear = expiryYear.split("\\.")[0];
		}
		bhp.FirstName(hMap.get("FirstName"));
		bhp.LastName(hMap.get("LastName"));
		bhp.BillingAddress(hMap.get("BillingAddress"));
		bhp.CreditCardNumber(hMap.get("CreditCardNo"));
		bhp.CreditCardType(hMap.get("CreditCardType"));
		bhp.ExpiryMonth(hMap.get("ExpiryMonth"));
		bhp.ExpiryYear(expiryYear);
		bhp.CVVNumber(hMap.get("CVVNumber"));
		bhp.BookNowButton();

		BookingConfirmationPage bcp = PageFactory.initElements(driver, BookingConfirmationPage.class);
		bcp.MyItinerary();
		
		BookedItinerary bi=PageFactory.initElements(driver, BookedItinerary.class);
		bi.verifyValue2(hMap.get("HotalName1"), bi.HotelName());
		bi.verifyValue2(hMap.get("Location1"), bi.Location());
		bi.verifyValue2(hMap.get("NoOfRooms1"), bi.NoOfRooms());
		bi.verifyValue2(hMap.get("FirstName"), bi.FirstName());
		bi.verifyValue2(hMap.get("LastName1"), bi.LastName());
		bi.verifyValue2(hMap.get("ArrivalDate1"), bi.ArrivalDate());
		bi.verifyValue2(hMap.get("DepartureDate1"), bi.DepartureDate());
		bi.verifyValue2(hMap.get("NoOfDays1"), bi.NoOfDays());
		bi.verifyValue2(hMap.get("RoomsType1"), bi.RoomsType());
	}

	@DataProvider
	public Object[][] getData116(){
		Object[][] obj=new Object[1][1];
		obj[0][0]=UtilKit3.getTestDataFromExcel("TC-116");
		return obj;
		
	}
	

}

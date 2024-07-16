package pomtestscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BookAHotelPage;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;
import util.UtilKit3;

public class TC113 extends BaseTest{
		
		@Test(dataProvider = "getData113")
		public void TC113(HashMap<String, String> hMap) {
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
			
			BookAHotelPage bhp =	PageFactory.initElements(driver, BookAHotelPage.class);
			bhp.verifyValue2(hMap.get("Hotel Name1"), bhp.HotelName());
			bhp.verifyValue2(hMap.get("Location1"), bhp.Location());
			bhp.verifyValue2(hMap.get("Room Type1"), bhp.RoomType());
			bhp.verifyValue2(hMap.get("Number of Rooms2"), bhp.NumberOfRooms());
			bhp.verifyValue2(hMap.get("Total Days "), bhp.TotalDays());
			}

		@DataProvider
		public Object[][] getData113() {

			Object[][] obj = new Object[1][1];
			obj[0][0] = UtilKit3.getTestDataFromExcel("TC-113");
			return obj;

		}
	
}

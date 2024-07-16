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

public class TC111 extends BaseTest{
	@Test(dataProvider = "getData111")
	public void TC111(HashMap<String, String> hMap) {
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
//		System.out.println(hMap.get("HotelName1"));
//		System.out.println(hMap.get("Location1"));
//		System.out.println(hMap.get("Rooms"));
//		System.out.println(hMap.get("ArrivalDate"));
//		System.out.println(hMap.get("DepartureDate"));
//		System.out.println(hMap.get("RoomsType"));
		
		shp.verifyValue2(hMap.get("HotelName1") , shp.HotelName() );
		shp.verifyValue2(hMap.get("Location1") , shp.HotelLocation());
		shp.verifyValue2(hMap.get("Rooms") , shp.HotalRooms());
		shp.verifyValue2(hMap.get("ArrivalDate") , shp.HotelArrivalData() );
		shp.verifyValue2(hMap.get("DepartureDate") , shp.HotelDepartureDate( ));
		shp.verifyValue2(hMap.get("RoomsType") , shp.HotelRoomsType());	
	}

	@DataProvider
	public Object[][] getData111() {

		Object[][] obj = new Object[1][1];
		obj[0][0] = UtilKit3.getTestDataFromExcel("TC-111");
		return obj;

	}
}

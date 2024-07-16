package pomtestscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BookedItinerary;
import pages.BookingConfirmationPage;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;
import util.UtilKit3;

public class TC117 extends BaseTest{
	
	@Test(dataProvider = "getData117")
	public void TC116(HashMap<String, String> hMap) {
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.username_textbox("reyaz0806");
		lp.password_textbox("reyaz123");
		lp.login_button();

		SearchHotelPage sp = PageFactory.initElements(driver, SearchHotelPage.class);
		sp.BookedItinerary();

		BookedItinerary bi=PageFactory.initElements(driver, BookedItinerary.class);
		bi.SearchItinenary("PY15XOUZ49");
		bi.Go();
		
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
	public Object[][] getData117(){
		Object[][] obj=new Object[1][1];
		obj[0][0]=UtilKit3.getTestDataFromExcel("TC-117");
		return obj;
		
	}

}

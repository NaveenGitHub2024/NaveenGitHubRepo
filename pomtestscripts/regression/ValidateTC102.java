package pomtestscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SearchHotelPage;
import util.UtilKit3;

public class ValidateTC102 extends BaseTest{
	
	@Test(dataProvider="getData4")
	public void validateTC103(HashMap<String, String> hMap) {
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.username_textbox("reyaz0806");
		lp.password_textbox("reyaz123");
		lp.login_button();
		lp.verifyTitle("Adactin.com - Search Hotel");
	SearchHotelPage sp=	PageFactory.initElements(driver, SearchHotelPage.class);
	sp.location_name(hMap.get("Location"));
	sp.hotel_name(hMap.get("Hotel Name"));
	sp.room_type(hMap.get("Room type"));
	sp.noof_rooms(hMap.get("Number of Rooms"));
	sp.check_in_date(hMap.get("Checkindate"));
	sp.check_out_date(hMap.get("Checkoutdate"));
	//sp.check_in_datevalidatemesg(hMap.get("Validation Msg at Checkin date"));
	//sp.check_out_datevalidatemesg(hMap.get("Validation Msg at Checkout date"));
	sp.search_button();
	sp.verifyTitle(hMap.get("Expected Title2"));
	sp.verifyText(sp.check_in_datevalidatemesg(), hMap.get("Validation Msg at Checkin date"));
	sp.verifyText(sp.check_out_datevalidatemesg(), hMap.get("Validation Msg at Checkout date"));
	}
	
	@DataProvider
	public Object[][] getData4(){
		Object[][] obj=new Object[1][1];
		obj[0][0]=UtilKit3.getTestDataFromExcel("TC-103");
		return obj;
		
	}
	

}

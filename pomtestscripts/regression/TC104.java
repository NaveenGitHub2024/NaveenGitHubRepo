package pomtestscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;
import util.UtilKit3;

public class TC104 extends BaseTest {
	@Test(dataProvider = "getData104")
	public void TC104(HashMap<String, String> hMap) {
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.username_textbox("reyaz0806");
		lp.password_textbox("reyaz123");
		lp.login_button();
		SearchHotelPage sp = PageFactory.initElements(driver, SearchHotelPage.class);
		sp.location_name(hMap.get("Location"));
		sp.hotel_name(hMap.get("Hotel Name"));
		sp.room_type(hMap.get("Room type"));
		sp.search_button();
		SelectHotelPage shp = PageFactory.initElements(driver, SelectHotelPage.class);
		shp.waitForHotelName();
		System.out.println(driver.findElement(By.id("hotel_name_0")).getText());
		driver.findElement(By.id("radiobutton_0")).click();		
		shp.verifyValue(shp.HotelName(), hMap.get("HotelName1"));
	}

	@DataProvider
	public Object[][] getData104() {
		Object[][] obj = new Object[1][1];
		obj[0][0] = UtilKit3.getTestDataFromExcel("TC-104");
		return obj;

	}

}

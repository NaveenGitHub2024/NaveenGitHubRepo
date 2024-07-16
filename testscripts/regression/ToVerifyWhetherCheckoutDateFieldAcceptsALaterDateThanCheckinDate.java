package testscripts.regression;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeyWords;
import util.UtilKil2;
import util.UtilKit3;

	
public class ToVerifyWhetherCheckoutDateFieldAcceptsALaterDateThanCheckinDate extends BaseTest {
	
	@Test(dataProvider="getData3")
	public void ToVerifyWhetherCheckoutDateFieldAcceptsALaterDateThanCheckinDate1(HashMap<String, String> hMap) {
		ApplicationKeyWords app=new ApplicationKeyWords();
		
		app.launchApp();
		app.sendKeys("username_textbox", hMap.get("username"));
		app.sendKeys("password_textbox", hMap.get(" password"));
		app.click("login_button");
		
		app.dropDownSelection("location_name_", hMap.get("Location"));
		
		app.dropDownSelection("hotel_name_", hMap.get("Hotel Name"));
		
		app.dropDownSelection("room_type", hMap.get("Room type"));
		
		app.dropDownSelection("noof_rooms", hMap.get("Number of Rooms"));
		
		System.out.println(hMap.get("Check_in_date"));
		
		app.clear("check_in_date");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.findElement(By.xpath("(//input[@class='date_pick'])[1]")).sendKeys("25/05/2024");
//		driver.findElement(By.xpath("(//input[@class='date_pick'])[2]")).sendKeys("24/05/2024");
		app.clear("check_out_date");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		app.sendKeys("check_in_date", hMap.get("Checkindate"));
		app.sendKeys("check_out_date", hMap.get("Checkoutdate"));
		app.click("search_button");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		app.validateTitle(hMap.get("Expected Title2"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		app.getText(hMap.get("Validation Msg at Checkin date"));
		app.closeBrowser();
	}
	
	@DataProvider
	public Object[][] getData3(){
		Object[][] obj=new Object[1][1];
		obj[0][0]=UtilKit3.getTestDataFromExcel("TC-103"); 
		return obj;
	}
}

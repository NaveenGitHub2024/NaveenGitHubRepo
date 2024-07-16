package testscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import util.UtilKil2;
import util.UtilKit3;

public class ValidateLoginUsingPOMandDataFromExcel extends BaseTest {
	
	@Test(dataProvider="getData")
	public void validateLoginUsingPOM1(HashMap<String, String> hMap) {
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.username_textbox(hMap.get("username"));
		lp.password_textbox(hMap.get("password"));
		lp.login_button();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		lp.verifyTitle(hMap.get("Expected Title"));
	}
	
	@DataProvider
	public Object[][] getData() {
		
	Object[][] obj=new Object[1][1];
	obj[0][0]=UtilKit3.getTestDataFromExcel("TC-100");
	return obj;
	
	}

}

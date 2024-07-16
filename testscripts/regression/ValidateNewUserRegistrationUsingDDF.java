package testscripts.regression;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import util.UtilKil2;

	@Test(dataProvider="getData")
public class ValidateNewUserRegistrationUsingDDF extends BaseTest{
	public void toValidateNewNewUserRegistrationUsingDDF (HashMap<String, String> hMap) {
		driver.findElement(By.linkText("New User Register Here")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(driver.getTitle(), hMap.get("Expected Title"));
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] obj=new Object[1][1];
		obj[0][0]=UtilKil2.getTestDataFromExcel("TC-101");
		
		return obj;
		
	}
	
	
}

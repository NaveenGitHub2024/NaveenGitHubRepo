package testscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import util.UtilKil2;





public class ValidateUserLogins extends BaseTest{
	
	@Test(dataProvider = "getData")
	public void toVerifyValidLoginDetailsTest(HashMap<String,String> hMap)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(hMap.get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(hMap.get("password"));
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), hMap.get("Expected Title"));
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data=new Object[1][1];
		data[0][0]=UtilKil2.getTestDataFromExcel("TC-100");
		return data;
		
		
		
	}
}

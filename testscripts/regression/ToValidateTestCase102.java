package testscripts.regression;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import util.UtilKil2;
import util.UtilKit3;

	@Test(dataProvider="getData2")
public class ToValidateTestCase102 extends BaseTest {
	public void toVerifyTestCase103(HashMap<String, String> hMap) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(hMap.get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(hMap.get(" password"));
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), hMap.get(" Expected Title1"));
		driver.findElement(By.xpath("//select[@id='location']")).sendKeys(hMap.get("Location"));
		driver.findElement(By.xpath("//select[@id='hotels']")).sendKeys(hMap.get("Hotels "));
		driver.findElement(By.xpath("//select[@id='room_type']")).sendKeys(hMap.get(" Room Type"));
		driver.findElement(By.xpath("//select[@id='room_nos']")).sendKeys(hMap.get("Number of Rooms"));
	}
	@DataProvider
	public Object[][] getData2() {
		Object[][] obj2 = new Object[1][1];
		obj2[0][0] = UtilKit3.getTestDataFromExcel("TC-102");
		return obj2;
	}
}

package pomtestscripts.regression;

import java.beans.Visibility;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BookedItinerary;
import pages.LoginPage;
import pages.SearchHotelPage;
import util.UtilKit3;

public class TC119 extends BaseTest{
	
	@Test
	public void TC119() {
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.username_textbox("reyaz0806");
		lp.password_textbox("reyaz123");
		lp.login_button();

		SearchHotelPage sp = PageFactory.initElements(driver, SearchHotelPage.class);
		sp.BookedItinerary();

		BookedItinerary bi=PageFactory.initElements(driver, BookedItinerary.class);
	//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
		bi.select();
		bi.CancelSelected();
		//wait.until(ExpectedConditions.alertIsPresent());
		bi.acceptAlert();
		bi.SearchItinenary("K570I8JAEJ");
		bi.Go();
		bi.verifyText(bi.cancelConfirmation(), "0 result(s) found. Show all");
	}
	
//	@DataProvider
//	public Object[][] getData119(){
//		Object[][] obj=new Object[1][1];
//		obj[0][0]=UtilKit3.getTestDataFromExcel("TC-119");
//		return obj;
//		
	}



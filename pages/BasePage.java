package pages;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseTest;

public class BasePage extends BaseTest{

	public static void verifyTitle(String expTitle) {
		Assert.assertEquals(driver.getTitle(), expTitle);
		test.info("assertion passed");
	}
	
	public void selectFromDropDown(WebElement option, String text) {
		
		new Select(option).selectByVisibleText(text);
		test.info("selected"+option+text+"from dropdown");
	}
	
	public void selectFromDropDown2(WebElement option, String text) {
		new Select(option).selectByValue(text);
		test.info("selected"+option+text+"from dropdown");
	}
	
	public void clear(WebElement element) {
		element.clear();
		test.info("cleared the text in the field"+element);
	}
	
	public void sendKeys(WebElement element, String text) {
		element.sendKeys(text);	
		test.info("enterted " +text+"in the field"+element);
	}
	
	public void getWebElement(String element) {
		By by=null;
		if(by.equals("id")) {
			driver.findElement(by.id(element));
		}
		else if(by.equals("name")) {
			driver.findElement(by.name(element));
		}
		else if(by.equals("Classname")) {
			driver.findElement(by.className(element));
		}
		else if(by.equals("linktext")) {
			driver.findElement(by.linkText(element));
		}
		else if(by.equals("partialLinkText")) {
			driver.findElement(by.partialLinkText(element));
		}
		else if(by.equals("tagName")) {
			driver.findElement(by.tagName(element));
		}
		else {
			driver.findElement(by.xpath(element));
		}
	}
	
	public void getWebElements(String element) {
		By by=null;
		if(by.equals("id")) {
			driver.findElements(by.id(element));
		}
		else if(by.equals("name")) {
			driver.findElements(by.name(element));
		}
		else if(by.equals("Classname")) {
			driver.findElements(by.className(element));
		}
		else if(by.equals("linktext")) {
			driver.findElements(by.linkText(element));
		}
		else if(by.equals("partialLinkText")) {
			driver.findElements(by.partialLinkText(element));
		}
		else if(by.equals("tagName")) {
			driver.findElements(by.tagName(element));
		}
		else {
			driver.findElements(by.xpath(element));
		}
	}
	
	public void verifyText(WebElement element,String expText)
	{
		Assert.assertEquals(element.getText(), expText);
		test.info("assertion passed");
	}
	
	public void verifyText2(String expText2,WebElement element)
	{
		Assert.assertEquals(expText2, element.getText());
		test.info("assertion passed");
	}
	
	public void verifyValue(WebElement element, String expValue) {
        Assert.assertEquals(element.getAttribute("value"), expValue);
        test.info("assertion passed");
    }
	
	public void verifyValue2(String expValue ,WebElement element) {
        Assert.assertEquals(expValue,element.getAttribute("value"));
        test.info("assertion passed");
    }
	
	public void verifyValue3(String expValue,WebElement element) {
		Assert.assertEquals(expValue,element.getText());
		test.info("assertion passed");
	}
	
	public void wait1(WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
	wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static String screenShot()
	{
		String screenShotsFolderPath=System.getProperty("user.dir")+"\\Screenshots";
		
		File screenshotsFolder=new File(screenShotsFolderPath);
		
		screenshotsFolder.mkdir();
		
		Date d=new Date();
		System.out.println(d);
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(d);
		System.out.println(date);
		
		date=date.replace(":", "-");
		
		System.out.println(date);
		
		String screenShotFilePath=screenShotsFolderPath+"\\"+date+".png";
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(srcFile, new File(screenShotFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return screenShotFilePath;
		
	}
	
}	

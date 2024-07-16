package testscripts.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dummy {
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0806");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
//		driver.findElement(By.xpath("//select[@id='location']")).click();
//		driver.findElement(By.xpath("(//input[@class='date_pick'])[1]")).click();
//		driver.findElement(By.xpath("(//input[@class='date_pick'])[1]")).sendKeys("01/06/2024");
		driver.findElement(By.id("datepick_in")).sendKeys("01/06/2024");
		WebElement dp=driver.findElement(By.id("adult_room"));
		Select select=new Select(dp);
		select.selectByVisibleText("2 - Two");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}

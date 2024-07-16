package keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;

public class GenericKeyWords extends BaseTest{
	
	public void openBrowser() {
		String browser = ConfigProp.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			if (driver != null) {
				System.out.println("WebDriver initialized successfully");
			} else {
				System.out.println("WebDriver initialization failed");
			}
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}	
	}
	
	public void launchApp() {
		driver.get(ConfigProp.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Long.parseLong(ConfigProp.getProperty("implicitwait"))));
	}
	
	//driver.findElement(By.xpath("//input[@id='username']"));
	
	public static By getLocator(String locatorKey) {
		By by=null;
		if(locatorKey.endsWith("_id")) {
			by=By.id(ConfigProp2.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("_name")) {
			by=By.name(ConfigProp2.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("_linkText")) {
			by=By.linkText(ConfigProp2.getProperty(locatorKey));
		}
		else {
			
			by=By.xpath(ConfigProp2.getProperty(locatorKey));
			
		}
		return by;
	}
	
	public static WebElement getElement(String locatorKey) {
		WebElement element=null;
		element=driver.findElement(getLocator(locatorKey));
		return element;	
	}
	
	public void click(String locatorKey) {
		getElement(locatorKey).click();
	}
	
	public void clear(String locatorKey) {
		getElement(locatorKey).clear();
	}
	
	public void sendKeys(String locatorKey, String text) {
		getElement(locatorKey).sendKeys(text);
	}
	
	public void closeBrowser() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void getText(String locatorKey)	{
		getElement(locatorKey).getText();
		System.out.println();
	}
	public static void dropDownSelection(String locatorKey,String Option) {
		new Select(getElement(locatorKey)).selectByVisibleText(Option);
	}
	
}

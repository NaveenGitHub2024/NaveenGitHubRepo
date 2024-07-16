package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class LoginPage extends BasePage{
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username_textbox;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password_textbox;
	
	@FindBy(xpath="//input[@id='login']")
	WebElement login_button;
	
	public void username_textbox(String text) {
		username_textbox.sendKeys(text);
		test.info("enterted " +text+"in the field"+ username_textbox);
	}
	
	public void password_textbox(String text) {
		password_textbox.sendKeys(text);
		test.info("enterted " +text+"in the field"+password_textbox);
	}	
	public void login_button() {
		login_button.click();
		test.info("clicked the loginbutton " +login_button);
	}
}
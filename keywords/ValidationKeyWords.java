package keywords;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ValidationKeyWords extends GenericKeyWords{
	
	public void validateTitle(String expTitle) {
		Assert.assertEquals(driver.getTitle(), expTitle);
	}
	
//	public void validateCheckInDateValidationMsg(String expValidation) {
//		Assert.assertEquals(driver.findElements(By.xpath(ConfigProp2.getProperty("checkindatevalidatemesg"))), expValidation);
//	}

}

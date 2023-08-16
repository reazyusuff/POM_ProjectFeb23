package page;

import org.testng.Assert;

public class BasePage {
	

	public void validateElement(String actualText, String expectedText, String errorMsg) {

		Assert.assertEquals(actualText, expectedText, errorMsg);

	}


}

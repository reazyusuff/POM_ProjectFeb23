package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage {
	WebDriver driver;
	
	 public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement DASHBOARD_HEADER_ELEMENT;

	public void validateDashboardPage(String expectedText) {

		validateElement(DASHBOARD_HEADER_ELEMENT.getText(), expectedText, "Dashboard page not found!");

	}

}

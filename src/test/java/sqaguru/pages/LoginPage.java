package sqaguru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;

	By byCreateNewAccount = By.linkText("Create New Account");

	public void clickCreateNewAccountButton() {
		driver.findElement(byCreateNewAccount).click();
	}

	public void isCreateNewAccountButtonDisplayed() {
		boolean result = driver.findElement(byCreateNewAccount).isDisplayed();
		Assert.assertTrue(result);
	}

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver, LoginPage.class);
	}
}

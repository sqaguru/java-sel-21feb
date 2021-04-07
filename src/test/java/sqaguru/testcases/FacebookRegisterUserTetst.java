package sqaguru.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sqaguru.framework.Base;
import sqaguru.pages.LoginPage;
import sqaguru.pages.SignUpPage;

public class FacebookRegisterUserTetst extends Base {
	@Test
	public void facebookUserCreationTest() throws InterruptedException, FileNotFoundException, IOException {

		driver.get("https://www.facebook.com/");

		LoginPage loginPage = new LoginPage(driver);

		loginPage.clickCreateNewAccountButton();

		Thread.sleep(3000);

		SignUpPage signUpPage = new SignUpPage(driver);

		signUpPage.registerNewUser();

	}

}

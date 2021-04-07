package sqaguru.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import sqaguru.framework.Base;
import sqaguru.pages.LoginPage;

public class FacebookLoginPageTest extends Base {
	@Test
	public void facebookUserCreationTest() throws InterruptedException, FileNotFoundException, IOException {

		driver.get("https://www.facebook.com/");

		LoginPage loginPage = new LoginPage(driver);

		loginPage.isCreateNewAccountButtonDisplayed();

		Thread.sleep(3000);

	}

}

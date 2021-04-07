package sqaguru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
	WebDriver driver;

	By byFirstName = By.name("firstname");

	public void registerNewUser() throws InterruptedException {
		Thread.sleep(2000);
		String browserTitle = driver.getTitle();

		String expectedTitle = "Facebook – log in or sign up";

		if (expectedTitle.equals(browserTitle)) {
			System.out.println("PASSED: Title Validation Passed");
		} else {
			System.out.println("FAILED: Title Validation Failed");
		}

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		boolean hasFirstNameExist = wait2.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")))
				.isDisplayed();

		if (!hasFirstNameExist) {
			
			System.out.println("FAILED: First Name Element not present");
			
		} else {

			driver.findElement(byFirstName).sendKeys("testuser1");

			driver.findElement(By.name("reg_email__")).sendKeys("999999999999");

			driver.findElement(By.name("reg_passwd__")).sendKeys("password@123");

			Select selectDateOfBirthDay = new Select(driver.findElement(By.id("day")));

			selectDateOfBirthDay.selectByVisibleText("5");

			Select selectDateOfBirthMonth = new Select(driver.findElement(By.id("month")));

			selectDateOfBirthMonth.selectByValue("2");

			Select selectDateOfBirthYear = new Select(driver.findElement(By.name("birthday_year")));

			selectDateOfBirthYear.selectByVisibleText("1990");

			driver.findElement(By.name("websubmit")).click();

			/* explicit wait */

			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement element = wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//i[@class='_5dbc _8esb img sp_DsFT2tc46le sx_31382b']")));

			boolean hasElementDisplayed = element.isDisplayed();

			if (hasElementDisplayed) {
				System.out.println("PASS: Exclamatory Symbol Present");
			} else {
				System.out.println("FAIL: Exclamatory Symbol not Present");
			}
		}
	}

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
}

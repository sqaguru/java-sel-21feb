package sqaguru.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Base {
	protected WebDriver driver;
	protected String projectPath;

	@BeforeGroups(groups = { "TEST_SMOKE", "TEST_SANITY" })
	public void beforeGroup() {
		System.out.println("beforeGroup()");
	}

	@AfterGroups(groups = { "TEST_SMOKE", "TEST_SANITY" })
	public void afterGroup() {
		System.out.println("afterGroup()");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite()");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("aftter suite()");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test()");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test()");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class()");
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\new_ats_master_40\\phoenix-ats\\phoenix-ats-common\\resources\\chromedriver.exe"
		 * );
		 */
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class()");

	}

	@BeforeMethod(groups = { "TEST_SMOKE", "TEST_SANITY" })
	public void beforeMethod() {
		System.out.println("before method()");
		projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterMethod(groups = { "TEST_SMOKE", "TEST_SANITY" })
	public void afterMethod() {
		System.out.println("after method()");
		driver.quit();
	}

	@DataProvider(name = "myDataArray")
	public Object[][] dataProvider() {
		Object[][] object = { { "user1", "password1", "Hyd" }, { "user2", "password2", "Pune" },
				{ "user3", "password3", "Mumbai" } };
		return object;
	}

}

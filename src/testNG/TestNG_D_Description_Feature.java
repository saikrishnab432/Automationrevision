package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_D_Description_Feature {

	WebDriver driver;


	@Test
	public void tc0() {

		driver.get("https://www.google.com");	  

	}

	@Test(description = "bing feed")
	public void tc1() {

		driver.get("https://www.bing.com");	  

	}

	@Test(description = "facebook application")
	public void tc2() {

		driver.get("https://www.facebook.com");	  

	}

	@Test(description = "logitech website")
	public void tc3() {

		driver.get("https://www.logitech.com");	  

	}

	@Test(description = "samsung website")
	public void tc4() {

		driver.get("https://www.samsung.com");	  

	}

	@Test(description = "apple website")
	public void tc5() {

		driver.get("https://www.apple.com");	  

	}

	@Test(description = "oneplus website")
	public void tc6() {

		driver.get("https://www.oneplus.com");	  

	}

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}

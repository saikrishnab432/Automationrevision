package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_A_AlphabeticalOrder {
	WebDriver driver;

	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}

	@Test
	public void alibaba() {
		driver.get("https://www.alibaba.com");
	}

	@Test
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}

	@Test
	public void bing() {
		driver.get("https://www.bing.com");
	}

	@Test
	public void amazon() {
		driver.get("https://www.amazon.in");
	}

	@Test
	public void zomato() {
		driver.get("https://www.zomato.com");
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

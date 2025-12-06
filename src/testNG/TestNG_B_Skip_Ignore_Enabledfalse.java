package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_B_Skip_Ignore_Enabledfalse {
	WebDriver driver;
	
	@Test(enabled = false)
	public void alibaba() {
		driver.get("https://www.alibaba.com");
	}
	@Ignore
	@Test
	public void amazon() {
		driver.get("https://www.amazon.in");
	}
	
	@Test(enabled = false)
	public void bing() {
		driver.get("https://www.bing.com");
	}
	
	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void zomato() throws InterruptedException {
		driver.get("https://www.zomato.com");
		Thread.sleep(100000);
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

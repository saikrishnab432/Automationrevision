package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_H_ExecutionOn_XML_File {

	WebDriver driver;

	@Test

	public void facebook() {
		driver.get("https://www.facebook.com");
	}

	@Test

	public void google() {
		driver.get("https://www.google.com");
	}

	@Test

	public void instagram() {
		driver.get("https://www.instagram.com");
	}
	
	@Test
	  
	  public void whatsapp() {
		  driver.get("https://www.whatsapp.com");
	  }
	  
	
	@Test
	  
	  public void gmail() {
		  driver.get("https://www.gmail.com");
	  }
	  
	
	@Test
	  
	  public void yahoo() {
		  driver.get("https://www.yahoo.com");
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

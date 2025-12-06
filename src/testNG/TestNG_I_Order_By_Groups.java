package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_I_Order_By_Groups {
	
	WebDriver driver;
	
  @Test(groups = "social")
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  @Test(groups = "searchengine")
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @Test(groups = "social")
  public void instagram() {
	  driver.get("https://www.instagram.com");
  }
  
  @Test(groups = "searchengine")
  public void bing() {
	  driver.get("https://www.bing.com");
  }
  
  @Test(groups = "social")
  public void whatsapp() {
	  driver.get("https://www.whatsapp.com");
  }
  
  @Test(groups = "website")
  public void hp() {
	  driver.get("https://www.hp.com");
  }
  
  @BeforeTest(groups = "social")
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}

package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_C_ExecutionOrder_By_Own_Priority {
	
	WebDriver driver;
	
	
  @Test(priority = 4)
  public void google() {
	  driver.get("https://www.google.com");
	    
  }
  
  @Test(priority = 2)
  public void yahoo() {
	  driver.get("https://www.yahoo.com");
	    
  }
  
  @Test(priority = 3)
  public void bing() {
	  driver.get("https://www.bing.com");
	    
  }
  
  @Test(priority = 1)
  public void twitter() {
	  driver.get("https://www.x.com");
	    
  }
  
  @Test(priority = 6)
  public void zomato() {
	  driver.get("https://www.zomato.com");
	    
  }
  
  @Test(priority = 5)
  public void alibaba() {
	  driver.get("https://www.alibaba.com");
	    
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

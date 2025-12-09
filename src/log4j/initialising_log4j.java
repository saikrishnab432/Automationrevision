package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class initialising_log4j {
	
	WebDriver driver;
	
  @Test
  public void log4jprogram() {
	  
	  Logger log= Logger.getLogger("Google Search");
	  PropertyConfigurator.configure("sailog.properties");
	  
	  
	  driver = new ChromeDriver();
	  log.info("Chrome browser is launched");
	  
	  driver.manage().window().maximize();
	  log.info("Browser got maximized");
	  
	  driver.get("https://www.techlearn.in");
	  log.info("Techlearn website got launched");
	  
	  driver.navigate().to("https://www.techlearn.in/admin");
	  log.info("navigated to the techlearn admin site");
	  // the line navigated to the techlearn admin site
	  
	  driver.quit();
	  
	  
	  
  }
}

package selenium;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class Headless {
	WebDriver driver;
	@Test
	public void withoutbrowser() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("headless");
		driver = new ChromeDriver(co);

		driver.get("https://www.samsung.com");
		
		String exptab = "samsung";
				
		String newtab = driver.getTitle();
		
		
		Assert.assertEquals(newtab, exptab);



	}

}

package classrevision;


import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorstagnameXpath {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void tagname() throws InterruptedException {
		driver.get("https://www.ndtv.com/");
		Thread.sleep(2000);
		
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		System.out.println(totallinks.size());
		System.out.println("total links in NDTV Website is" + totallinks.size());
	}

	@Disabled
	@Test
	void tagname1() throws InterruptedException {
		driver.get("https://www.ndtv.com/");
		Thread.sleep(2000);
		
		List<WebElement> totalimages = driver.findElements(By.tagName("img"));
		System.out.println(totalimages.size());
	}

	
	@Test
	void xpath() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/form/p[1]/input")).sendKeys("KRISHNA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("RJ123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
		
	
}
}
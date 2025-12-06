package classrevision;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// this is a comment line
		// this is another comment line
	}

	@Disabled	
	@Test
	void idnameclassname() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.id("user_login")).sendKeys("saikrishna");
		Thread.sleep(2000);
		driver.findElement(By.id("user_pass")).sendKeys("hello123");
		Thread.sleep(2000);
		driver.findElement(By.id("rememberme")).click();
	}
	@Disabled	
	@Test
	void cssselector() throws InterruptedException {
		driver.get("https:/www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#user_login")).sendKeys("automation");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#user_pass")).sendKeys("manual546");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#rememberme")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".wp-login-lost-password")).click();


	}
	@Disabled	
	@Test
	void linktext() throws InterruptedException {
		driver.get("https:/www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Lost your password?")).click();

	}

	@Test
	void partiallinktest() throws InterruptedException {
		driver.get("https:/www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("password")).click();

	}

}






package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_F_TimeOut_Feature {

	WebDriver driver;

	@Test(timeOut = 3000)
	public void testcase1() throws InterruptedException {

		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("saikrishna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("andhrabasha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();

	}

	@Test
	public void testcase2() throws InterruptedException {

		driver.get("https://www.hellowtea.com/admin");
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Krishnamoorthy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("lakshmidevamma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	}

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

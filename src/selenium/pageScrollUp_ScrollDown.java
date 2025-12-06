package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class pageScrollUp_ScrollDown {

	WebDriver driver;

	@Test
	public void PageScrollDown() throws InterruptedException {

		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 4000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Ecosystem page']")).click();
		Thread.sleep(2000);

	}
	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

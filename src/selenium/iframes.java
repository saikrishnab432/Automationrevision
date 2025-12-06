package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class iframes {

	WebDriver driver ;

	@Test
	public void Iframes() throws InterruptedException {
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();        // to get out of the frame we use default content
		Thread.sleep(2000);
		driver.switchTo().parentFrame();           // to get to the parent frame from the the current frame
		driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();


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

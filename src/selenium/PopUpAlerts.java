package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PopUpAlerts {

	WebDriver driver;


//	@Test
//	public void alertokbutton() throws InterruptedException {
//		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();  // to click on Ok button in alert window
//	}
//
//	@Test
//	public void alertCancelbutton() throws InterruptedException {
//		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
//		driver.findElement(By.xpath("//*[@id=\\\"post-725\\\"]/div/div/div/div/div/div/div/button")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
//	}



		@Test
		public void alertOKbutton() throws InterruptedException {
			driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
	
		}
	
	
		@Test
		public void alertCANCELbutton() throws InterruptedException {
			driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().dismiss();
	
		}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

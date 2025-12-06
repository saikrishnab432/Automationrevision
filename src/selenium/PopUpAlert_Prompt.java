package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopUpAlert_Prompt {

	WebDriver driver;

	@Test
	public void alertpromptmethod() throws InterruptedException {

		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		
		Alert me = driver.switchTo().alert();
		me.sendKeys("SaiKrishna");
		me.accept();
		
		driver.switchTo().alert().sendKeys("SaiKrishna");
		driver.switchTo().alert().accept();											
	}

	@Test
	public void noalertmethod() throws InterruptedException {

		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void voidrobo() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("techlearn.in");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	
	 



	//	@Test
	//	public void alertpromptmethod() throws InterruptedException {
	//
	//		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	//		Thread.sleep(3000);
	//
	//		// Click button to open Prompt alert
	//		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	//
	//		Thread.sleep(2000);
	//
	//		// Switch to alert and pass text
	//		driver.switchTo().alert().sendKeys("Sai Krishna");
	//
	//		Thread.sleep(2000);
	//
	//		// Accept alert
	//		driver.switchTo().alert().accept();
	//	}

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

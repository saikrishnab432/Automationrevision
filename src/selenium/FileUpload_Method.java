package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FileUpload_Method {

	WebDriver driver;

//	@Test
//	public void fileuploadinselenium() throws InterruptedException {
//
//		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"myFile\"]")).sendKeys("D:\\New folder\\stars-1654074.jpg");
//
//	}
	
	@Test
	public void fileuploadonselenium() throws InterruptedException {
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("D:\\New folder\\dune_part_two_paul-wallpaper-3840x2160.jpg");
		

	}
	
	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}

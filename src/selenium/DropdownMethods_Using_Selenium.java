package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.ISelect;
import org.testng.annotations.BeforeTest;

public class DropdownMethods_Using_Selenium {

	WebDriver driver;


	@Test
	public void dropdownmethod() throws InterruptedException {
		driver.get("https://www.redmine.org/account/register");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("saib@yahoo.in");
		Thread.sleep(2000);

		Select obj = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
		obj.selectByVisibleText("Croatian (Hrvatski)");		



	}

	@Test
	public void dropdownmethod1() throws InterruptedException {
		driver.get("https://www.redmine.org/account/register");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("krishna6@765gmail.com");
		Thread.sleep(2000);
		Select obj = new Select(driver.findElement(By.xpath("//select[@id='user_language']")));
		obj.selectByVisibleText("Lithuanian (lietuvių)");




	}

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}

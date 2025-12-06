package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class isDisplayed_isEnabled_isSelected {

	WebDriver driver;

	@Test
	public void isDisplayed() {

		driver.get("https://www.techlearn.in/admin");

		boolean lyp = driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).isDisplayed();

		if(lyp==true)
		{
			System.out.println("Lost your password is displayed");
			driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
		}

		else
		{
			System.out.println("lost your password is not dispalyed");
		}
	}

	@Test
	public void isEnabled() throws InterruptedException {

		driver.get("https://techlearn.in/admin");
		Thread.sleep(3000);
		boolean email = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();

		if(email==true)
		{
			System.out.println("Username is enabled");
			driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Saikrishna");
		}

		else {
			System.out.println("Username is not enabled");
		}
	}
		
		
		@Test
		public void isSelected() throws InterruptedException {

			driver.get("https://techlearn.in/admin");
			Thread.sleep(3000);
			boolean email = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();

			if(email==true)
			{
				System.out.println("Username is enabled");
				driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Saikrishna");
			}

			else {
				System.out.println("Username is not enabled");
			}



	}
	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}

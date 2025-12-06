package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_E_Depends_On_Method {

	WebDriver driver;


	@Test(dependsOnMethods = "method2")
	public void method1() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Saikrishna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("telugulessa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();

	}

	@Test
	public void method2() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");

	}

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}

package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Verify_Tab_Title {

	WebDriver driver;

	@Test
	public void getTitle() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(3000);

		String exptab = "Google";
		System.out.println("expected tab text is "+exptab);

		String acttab = driver.getTitle();
		System.out.println("Actual tab text is "+acttab);

		Assert.assertEquals(acttab, exptab);

	}


	@Test
	public void getCurrentURl() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(3000);

		String expurl = "https://www.google.com/";

		String acturl = driver.getCurrentUrl();

		Assert.assertEquals(acturl, expurl);



	}

	@Test
	public void getText() throws InterruptedException {
		driver.get("https://www.google.com");

		String exptxt = "Privacy";

				String acttxt = driver.findElement(By.xpath("//a[normalize-space()='Privacy']")).getText();

		Assert.assertEquals(acttxt, exptxt);

	}

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}

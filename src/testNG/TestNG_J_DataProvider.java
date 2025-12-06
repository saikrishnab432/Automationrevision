package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class TestNG_J_DataProvider {

	WebDriver driver;

	@DataProvider (name = "datainput")
	public String[][] login() {
		return new String[][] {
			{"krisrocks517@gmail.com ", "jhsdfvdshyubhud"},
			{"sai", "uavyhsdsaduyf"},
			{"kris","uhvsdcdtyif87y"},
			{"nsdvn","ubhsdkjbsdfusd"},
			{"8o7ynmwv5v58y7","pm98yet4qre"},
			{"4wv5t8uom","w0m9455u9m"},
			{"9p8ubem6yu"," jzkhbdtsssthfgf"},
			{"rambo","8vo5wy4nno8yv75w4"},
			{"n8y7wt4v5ny87w45vy5n48","p9vyun9n8utvwv8yn9w"},
			{"v45yn98uw","98pnwv45y5yvn"}
		};
	}

	@Test(dataProvider = "datainput")
	public void dataprovider(String user , String password) {

		driver.get("https://www.seleniumlearn.com/wp-login.php");
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(user);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();

	}

	public class K_DataProvider {
		WebDriver driver;

		@DataProvider(name = "datainput")
		public String[][] login() {
			return new String[][] { 
				{ "arun123@gmail.com", "Hello@123"}, 
				{ "bhuwana", "9000109120" },
				{ "arijith", "ABCDEF" },
				{ "chaithanya", "123456789" },
				{ "naveen", "ABCDEFGHI" },
				{ "manoj", "9980251000"}, 
				{ "akhil", "InValidPassword"}, 
				{ "lavanya", "9000109120" },
				{ "shiva", "Hello@123"},
				{ "arijit", "Selenium@2025"} 
			};
		}

		@Test(dataProvider = "datainput")
		public void login(String usr, String pswd) throws Exception {

			driver.get("https://www.seleniumlearn.com/wp-login.php");
			Thread.sleep(2000);		
			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(usr);
			driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(pswd);
			driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
			try 
			{
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a"))).build().perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-logout\"]/a")).click();
				System.out.println("PASS");
			} 
			catch (Exception e) 
			{		
				System.out.println("FAIL");
				//	System.out.println("Exception due to: "+e);
			}
		}

		@BeforeTest
		public void beforeTest() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

	}
}

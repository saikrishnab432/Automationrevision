//package testNG;
//
//import org.testng.annotations.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.BeforeTest;

//public class DataProvider {
//
//	WebDriver driver;
//
//	@Test(dataProvider = "datainput")
//	public void DataProvider() {
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saikrishnab");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("kajsnygdaskdy");
//		//driver.findElement(By.xpath("//input[@id='rememberme']")).click();
//		try {
//
//			Actions act = new Actions(driver);
//			act.moveToElement(driver.findElement(By.xpath("//div[@aria-label='Your profile']//div[@class='x6s0dn4 x1q0q8m5 x1qhh985 x18b5jzi x10w94by x1t7ytsu x14e42zd x1c9tyrk xeusxvb x1pahc9y x1ertn4p x13fuv20 x972fbf x9f619 x78zum5 xdt5ytf x1iyjqo2 xs83m0k xl56j7k xat24cr x14z9mp x1lziwak xdj266r x2lwn1j xeuugli x6ikm8r x10wlt62 x18d9i69 xyri2b x1c1uobl xexx8yu x1n2onr6 x1ja2u2z']//*[name()='svg']"))).build().perform();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
//		}
//		//catch(exception e){
//
//		//  System.out.println(););
//
//	}
//}
//@BeforeTest
//public void beforeTest() {
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//
//}
//
//}

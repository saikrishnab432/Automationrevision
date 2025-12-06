package selenium;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTab_and_NewWindow {
	WebDriver driver;
	@Test
	public void newtabselenium() throws InterruptedException {

		driver.get("https://www.techlearn.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-12\"]/a")).click();
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 300)");

		driver.findElement(By.xpath("//*[@id=\"post-57\"]/div/div/div/div/div/div/section/div[2]/a")).click();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));


		//ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(tabs.get(1));


		driver.findElement(By.xpath("//button[@id='products1']")).click();

		driver.close();

		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-16\"]/a")).click();


	}

	@Test 
	public void newtabopening() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);

		driver.navigate().to("https://www.samsung.com");

	}

	@Test
	public void newwindowinselenium() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.navigate().to("https://www.selenium.dev");

		/*Set<String> obj = driver.getWindowHandles();
		Object s[] = obj.toArray();							to open in new window we use this code 
		driver.switchTo().window(s[1].toString());*/

		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();

		Set<String> objt = driver.getWindowHandles();
		Object sa[] = objt.toArray();
		driver.switchTo().window(sa[0].toString());



	}

	@Test 
	public void newtabsopening() {
		driver.get("https://www.techlearn.in");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[normalize-space()='Downloads']")).click();
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 300)");
		
		driver.findElement(By.xpath("//a[normalize-space()='Download Selenium Jars']")).click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("//span[normalize-space()='Projects']")).click();
		driver.close();
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath("//a[contains(text(),'Placements')]")).click();
	}



	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionClass {

	WebDriver driver;

	@Test
	public void rightclick() {
		driver.get("https://www.techlearn.in");
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-4703\"]/a"))).build().perform();



	}


	@Test
	public void doubleclick() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/double-tap/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).build().perform();

		//  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).doubleClick().build().perform();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();



	}

	@Test
	public void mousehover() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"block-45\"]/a[4]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"block-41\"]/a")).click();


	}

	@Test
	public void draganddrop() throws InterruptedException {

		driver.get("https://www.techlearn.in/code/drag-and-drop");

		Thread.sleep(3000);

		Actions act = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("//*[@id=\"div1\"]"));

		WebElement target = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));

		act.dragAndDrop(source, target).build().perform();



	}

	@Test
	public void dropanddrag() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/drag-and-drop");
		Thread.sleep(3000);

		Actions act = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("//*[@id=\"div1\"]"));

		WebElement target = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));

		act.dragAndDrop(source, target).build().perform();

	}





	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}

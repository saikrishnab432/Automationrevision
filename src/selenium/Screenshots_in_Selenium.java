package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshots_in_Selenium {

	WebDriver driver;
	public void getscreenshot() throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Lib\\Screenshots\\techlearn_" + time + ".png"));

	}

	@Test
	public void Timeformatscreenshot() throws IOException {
		driver.get("https://www.techlearn.in/admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("saikrishna");
		getscreenshot();
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("hdhugdfoudvs");
		getscreenshot();
		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
		getscreenshot();


	}






	@Test()
	public void errorscreenshot() throws InterruptedException, IOException {

		try {
			driver.get("https://www.techlearn.in/admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("787555rgy6");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"user_pajss\"]")).sendKeys("kjesfjhgsdfge");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
			Thread.sleep(2000);
		}

		catch(Exception e){
			getscreenshot();
			//System.out.println("Error page: " +e);
		}
	}

	@Test
	public void fullpagescreenshot() throws IOException {
		driver.get("https://www.samsung.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(), "PNG", new File("D:\\Lib\\Screenshots\\FullpageScreenshot.png"));



	}






	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}

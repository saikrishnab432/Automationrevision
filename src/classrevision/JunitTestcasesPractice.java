package classrevision;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitTestcasesPractice {
	static WebDriver driver;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
@Disabled
	@Test
	void facebook() {
		driver.get("https://www.linkedin.com");
	}
	
	@Test
	void twitter() {
		driver.get("https://www.x.com");
	}

	@Test
	void google() {
		driver.get("https://www.google.com");
	}
@Disabled
	@Test
	void bing() {
		driver.get("https://www.bing.com");
	}

     @Test
            void techlearn() {
	       driver.get("https://www.techlearn.in");
}



}

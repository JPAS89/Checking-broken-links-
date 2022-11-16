package checkinglinks;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class linksTest {
 
  WebDriver driver;
  
  CheckingLinksPage page;
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "..\\havastest\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 page = new CheckingLinksPage(driver);
		 
		 driver.get("https://www.pfizer.com/");
		 driver.manage().window().maximize();
  }
  
  
  @Test
  public void checkingPageLinks() {
	  assertTrue(page.checkingPageLinks(), "Broken links were found");
  }
  
  
  @AfterClass
  public void afterClass() {
  driver.close();
  }
  

}

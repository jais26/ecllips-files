package First_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Second_Verify_Title_Test_With_SoftAssert {
	
	@Test
	public void titletest()
	{
		SoftAssert softassert = new SoftAssert();
		String  expectedtitle= "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedtext="Search";
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
       
        driver.get("https://www.ebay.com/");
        String actualtitle = driver.getTitle(); 
        System.out.println("verifying title");   
        softassert.assertEquals(actualtitle, expectedtitle, "title verification failed");
      
        String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");      
        System.out.println("verifying text");
        
        softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
        System.out.println("Close browser");
        
        driver.close();
        softassert.assertAll();
	}

}

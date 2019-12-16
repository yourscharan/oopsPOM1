package oopsPOM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    public WebDriver driver;
     Page page;
    
 @BeforeMethod
 @Parameters({"browser"})
 public void setup(String browser){
     if(browser.equals("chrome")){
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
     }
     driver.get("http://apps.qaplanet.in/hrm/login.php");
     page=new BasePage(driver);
 }
 
 @AfterMethod
 public void tearDown(){
     driver.quit();
 }
    

}

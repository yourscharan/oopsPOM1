package oopsPOM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
    
    public WebDriver driver;
    public WebDriverWait wait;
   Actions act;
    public Page(WebDriver driver){
	this.driver=driver;
	this.wait=new WebDriverWait(driver, 60);
    }
    
    public abstract String getPageTitle();
    
    public abstract WebElement getElement(By locator);
    
    public abstract void waitForElementPresent(By locator);
    
    public abstract void waitForPageTitle(String title);

    public abstract void mouseover(WebElement locator);
    
  
    public <Tpage extends BasePage> Tpage getInstance(Class<Tpage> pageClass)
    {
	try{
	    return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
	    
	}catch(Exception e){
	    e.printStackTrace();
		return null;

	}
	
	
    }
    
    
    
    
    
}
    
    


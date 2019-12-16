package oopsPOM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
    }

    //page locators for login Page
    
    private By username=By.name("txtUserName");
    
    private By password = By.name("txtPassword");
    
    private By loginbtn= By.name("Submit");

    /**
     * @return the username
     */
    public WebElement getUsername() {
   
	return getElement(username);
	
    }

    /**
     * @return the password
     */
    public WebElement getPassword() {
	
        return getElement(password);
    }

    /**
     * @return the loginbtn
     */
    public WebElement getLoginbtn() {
        return getElement(loginbtn);
    }
    
    public String getLoginPagetitle(){
	return getPageTitle();
    }
    
    public HomePage doLogin(String un,String pd){
	getUsername().sendKeys(un);
	getPassword().sendKeys(pd);
	getLoginbtn().click();
	return getInstance(HomePage.class);
	
    }
    
}

package oopsPOM1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    
    @Test(priority=1)
    public void verifyLoginpageTitle(){
	String title=page.getInstance(LoginPage.class).getLoginPagetitle();
	System.out.println("Login Page title " + title);
	Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");
    }
    
    @Test(priority=2)
    public void Login(){
       HomePage home=page.getInstance(LoginPage.class).doLogin("qaplanet1", "lab1");
       String title=home.getPageTitle();
       System.out.println(title);
       Assert.assertEquals(title, "OrangeHRM");
	
    }

}

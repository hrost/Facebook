package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends GeneralPageObject {

	 private WebDriver driver;

	    public WebElement navbar;
	    public WebElement userOnNavbar;

	    public HomePage(WebDriver driver){
	        this.driver = driver;

	        Boolean specificElementFound = explicitWait(this.driver, By.id("pagelet_bluebar"));
	        if (specificElementFound == false) {
	            throw new AssertionError("Home Page has not been loaded");
	        } else {
	            System.out.println("Home Page initialized!");
	        }

	        this.userOnNavbar = driver.findElement(By.className("headerTinymanName"));
	        
	    }
	    
	    public String getUserName() {
	    	String Username = userOnNavbar.getText();
	    	System.out.printf("Get user name on Navbar. User name = %s", Username);
	    	return Username; 
	    }
	    
	    public UserPage getUserPage() {
	    	
	    	userOnNavbar.click();
	    	return new UserPage(driver);
	    }
}

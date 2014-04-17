package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPage extends GeneralPageObject {

	private WebDriver driver;

    public WebElement updateInfoButton;

    public UserPage(WebDriver driver){
        this.driver = driver;

        Boolean specificElementFound = explicitWait(this.driver, By.id("fbProfileCover"));
        if (specificElementFound == false) {
            throw new AssertionError("User Page has not been loaded");
        } else {
            System.out.println("User Page initialized!");
        }

        this.updateInfoButton = driver.findElement(By.linkText("Update Info"));
        
    }
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralPageObject {

    public Boolean explicitWait(WebDriver driver, By locator){

        long TIMEOUT = 20000; //In milliseconds
        final By by = locator;
        Boolean element_found = false;
        long end = System.currentTimeMillis() + TIMEOUT;
        
        while (System.currentTimeMillis() < end) {
            try {
                WebElement element = driver.findElement(by);
                if (element.isDisplayed()) {
                    element_found = true;
                    return element_found;
                }
            } catch (NoSuchElementException e) {}
        }
        //Here is block when element not found on the page or page was not loaded
        System.out.println("Current page URL is: " + driver.getCurrentUrl());
        return element_found;
    }
    
    public Boolean explicitWait(WebDriver driver, WebElement el){

        long TIMEOUT = 20000; //In milliseconds
        final WebElement element = el;
        Boolean element_found = Boolean.FALSE;
        long end = System.currentTimeMillis() + TIMEOUT;
        
        while (System.currentTimeMillis() < end) {
            try {
                if (element.isDisplayed()) {
                    element_found = true;
                    return element_found;
                }
            } catch (NoSuchElementException e) {}
        }
        //Here is block when element not found on the page or page was not loaded
        System.out.println("Current page URL is: " + driver.getCurrentUrl());
        return element_found;
    }
    
    public void waitAndClickOnElement(WebDriver driver, By locator){
        long TIMEOUT = 20000; //In milliseconds
        final By by = locator;
        long end = System.currentTimeMillis() + TIMEOUT;
        Boolean foundAndClicked = false;
        
        while (System.currentTimeMillis() < end) {
            try {
            	WebElement element = driver.findElement(by);
            	element.click();
            	foundAndClicked = true;
            	break;
            } catch (NoSuchElementException e) {}
        }
        if (foundAndClicked == false){
        	throw new AssertionError("Waited for element, but it has not appeared");
        }
    }
    
    public void simpleWait(long time){
    	long end = System.currentTimeMillis() + time;
    	while (System.currentTimeMillis() < end) {
    		//Do nothing here, just wait
    	}
    }
}

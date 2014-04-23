package tests;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class GenerelTest extends TestCase{
	
	WebDriver driver;
	String browser = "ff";
	static int count = 1;
	
	@BeforeClass
	public void setUp() {
		System.out.println("");
		System.out.println(count + ". Test Case Name = " + this.getName());
		System.out.println("");
		count++;
		
		if (browser == "chrome") {
			driver = new ChromeDriver(); 
			}
		else if (browser == "ff") {
			driver = new FirefoxDriver(); 
			}
		else if (browser == "ie") {
			driver = new InternetExplorerDriver(); 
			}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://facebook.com");
		}
	
	@AfterClass
	public void tearDown() {
		System.out.println("");
		driver.quit();
	}
}


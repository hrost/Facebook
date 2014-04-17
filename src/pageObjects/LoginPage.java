package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPageObject {
	
	private WebDriver driver;
	WebElement email;
	WebElement password;
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		this.email = driver.findElement(By.id("email"));
		this.password = driver.findElement(By.id("pass"));
		this.loginButton = driver.findElement(By.id("loginbutton"));
		
		System.out.println("Login page is initialized");	
	}
	
	public HomePage loginWithValidCredantials(String login, String pass) {
		
		email.sendKeys(login);
		password.sendKeys(pass);
		loginButton.click();
		
		return new HomePage(driver);
	}
}

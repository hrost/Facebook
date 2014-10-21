package tests;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTests extends GenerelTest{
	
	@Test
	public void testLoginIn() {
		String login = "hrost@bigmir.net";
		String password = "*******";
		
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.loginWithValidCredantials(login, password);
		assertEquals(homePage.getUserName(), "Mikhail!");
		
	}
	
	@Test
	public void testLoginIn2() {
		String login = "hrost@bigmir.net";
		String password = "*******";
		
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.loginWithValidCredantials(login, password);
		assertEquals(homePage.getUserName(), "Mihail");
		
	}
} 

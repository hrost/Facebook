package tests;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.UserPage;

public class UserPageTests extends GenerelTest{
	
	@Test
	public void testUserPageOpening() {
		String login = "hrost@bigmir.net";
		String password = "hpdv9000";
		
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.loginWithValidCredantials(login, password);
		UserPage userPage = homePage.getUserPage();
		
	}
} 

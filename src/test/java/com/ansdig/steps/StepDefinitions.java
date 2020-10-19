package com.ansdig.steps;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ansdig.utils.Hooks;

import cucumber.api.java.en.*;
import static com.ansdig.constants.Constants.*;

public class StepDefinitions {
    private WebDriver driver;
	private JavascriptExecutor JS;
	private Robot robot;

	@Given("^the application URL$")
	public void the_application_URL() throws AWTException {
		robot = new Robot();
		driver = Hooks.getDriver();
		JS = (JavascriptExecutor)driver;
	    driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^the user click on Form Authentication on Menu$")
	public void the_user_click_on_Form_Authentication_on_Menu() {
		
		driver.findElement(By.xpath(formAuthenticationLocPath)).click();
	}

	@Then("^the user enter username and password$")
	public void the_user_enter_username_and_password() {
		
		driver.findElement(By.id(userNameLocPath)).sendKeys(validUserNameKey);
		driver.findElement(By.id(passwordLocPath)).sendKeys(validPasswordKey);
	}

	@Then("^the user click on Login button$")
	public void the_user_click_on_Submit_button()  {
		
		driver.findElement(By.xpath(loginLocPath)).click();
	}

	@Then("^the login should be successfull$")
	public void the_login_should_be_successfull()  {
		
		String expectedLoginSuccessMsg = driver.findElement(By.id(loginSuccessMsgLocPath)).getText();
		System.out.println(expectedLoginSuccessMsg);
		assertEquals(actualSuccessMsg, expectedLoginSuccessMsg);
	}

	@When("^the user click on logout button$")
	public void the_user_click_on_logout_button()  {
		
		driver.findElement(By.xpath(logoutLocPath)).click();
	}

	@Then("^the logout should be successfull$")
	public void the_logout_should_be_successfull()  {
		
		String expectedLogoutSuccessMsg = driver.findElement(By.id(logoutSuccessMsgLocPath)).getText();
		System.out.println(expectedLogoutSuccessMsg);
		assertEquals(actualLogoutSuccessMsg, expectedLogoutSuccessMsg);
		
	}

	@Then("^the user enter correct username and wrong password$")
	public void the_user_enter_correct_username_and_wrong_password() {
		
		driver.findElement(By.id(userNameLocPath)).sendKeys(inValidUserNameKey);
		driver.findElement(By.id(passwordLocPath)).sendKeys(validPasswordKey);
	}

	@Then("^the system should throw error message as invalid password$")
	public void the_system_should_throw_error_message_as_invalid_password()  {
		
		String expectedLoginErrorMsg1 = driver.findElement(By.id(errorMsg1LocPath)).getText();
		System.out.println(expectedLoginErrorMsg1);
		assertEquals(actualLoginErrorMsg1, expectedLoginErrorMsg1);
	}

	@Then("^the user enter wrong username and correct password$")
	public void the_user_enter_wrong_username_and_correct_password() {
		
		driver.findElement(By.id(userNameLocPath)).sendKeys(validUserNameKey);
		driver.findElement(By.id(passwordLocPath)).sendKeys(inValidPasswordKey);
	}

	@Then("^the system should throw error message as invalid username$")
	public void the_system_should_throw_error_message_as_invalid_username()  {
		
		String expectedLoginErrorMsg2 = driver.findElement(By.id(errorMsg2LocPath)).getText();
		System.out.println(expectedLoginErrorMsg2);
		
		assertEquals(actualLoginErrorMsg2, expectedLoginErrorMsg2);
	}

	@When("^the user click on Infinite scroll on Menu$")
	public void the_user_click_on_Infinite_scroll_on_Menu()  {
		
		//JavascriptExecutor JS= 	(JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,400)","");
		
		driver.findElement(By.xpath(infiniteScrollLocPath)).click();
		
	}

	@Then("^the user scroll to the bottom of the page twice$")
	public void the_user_scroll_to_the_bottom_of_the_page_twice()  {
		
		//JavascriptExecutor JS= 	(JavascriptExecutor)driver;
		
		JS.executeScript("window.scrollBy(0,600)","");
		
		JS.executeScript("window.scrollBy(0,6400)","");
		
	}

	@Then("^the user scroll back to the top of the page$")
	public void the_user_scroll_back_to_the_top_of_the_page()  {
		
		JS.executeScript("window.scrollBy(0,-7000)","");
	}

	@Then("^the user should validate the Infinite Scroll text$")
	public void the_user_should_validate_the_Infinite_Scroll_text()  {
		
		String expectedElement = driver.findElement(By.xpath(infiniteScrollTextLocPath)).getText();
		System.out.println(expectedElement);
		
	   assertEquals(actualElement,expectedElement);
	    
	}

	@When("^the user click on Key presses on Menu$")
	public void the_user_click_on_Key_presses_on_Menu() throws Throwable {
		
		
		JS.executeScript("window.scrollBy(0,400)","");
		
	    driver.findElement(By.xpath(keyPressesLocPath)).click();
	    
	}

	@When("^the user click on DOWN button on keyboard$")
	public void the_user_click_on_DOWN_button_on_keyboard() throws AWTException {
		
		
	    robot.keyPress(KeyEvent.VK_DOWN);
		
	}

	@Then("^the user should validate the dispalyed text of DOWN$")
	public void the_user_should_validate_the_dispalyed_text_of_DOWN()  {
		
		String expectedText1 = driver.findElement(By.id(youEnteredLocPath)).getText();
		
		System.out.println(expectedText1);
		
		assertEquals(actualText1,expectedText1);
	   
	}

	@When("^the user click on CONTROL button on keyboard$")
	public void the_user_click_on_CONTROL_button_on_keyboard() throws AWTException  {
	
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
	}

	@Then("^the user should validate the dispalyed text of CONTROL$")
	public void the_user_should_validate_the_dispalyed_text_of_CONTROL() {
		
		String expectedText2 = driver.findElement(By.id(youEnteredLocPath)).getText();
		
		System.out.println(expectedText2);
		
		assertEquals(actualText2,expectedText2);
	}

	@When("^the user click on ALT button on keyboard$")
	public void the_user_click_on_ALT_button_on_keyboard() throws AWTException {
	
		 robot.keyPress(KeyEvent.VK_ALT);
	}

	@Then("^the user should validate the dispalyed text of ALT$")
	public void the_user_should_validate_the_dispalyed_text_of_ALT()  {
		
		String expectedText3 = driver.findElement(By.id(youEnteredLocPath)).getText();
		
		System.out.println(expectedText3);
		
		assertEquals(actualText3,expectedText3);
	}

	@When("^the user click on SPACE button on keyboard$")
	public void the_user_click_on_SPACE_button_on_keyboard() throws AWTException  {
		
		 robot.keyPress(KeyEvent.VK_SPACE);
	}

	@Then("^the user should validate the dispalyed text of SPACE$")
	public void the_user_should_validate_the_dispalyed_text_of_SPACE() {
		
		String expectedText4 = driver.findElement(By.id(youEnteredLocPath)).getText();
		
		System.out.println(expectedText4);
		
		assertEquals(actualText4,expectedText4);
	    
	}


}

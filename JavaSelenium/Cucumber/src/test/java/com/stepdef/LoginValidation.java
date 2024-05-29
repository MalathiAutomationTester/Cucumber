package com.stepdef;

import java.net.Socket;
import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.utility.Base;
public class LoginValidation extends Base {
	 WebDriver driver;
		
		@Given("User launch the Url")
		public void user_launch_the_url() throws InterruptedException {
		launchUrl("chrome","https://adactinhotelapp.com/index.php");
		//  driver .get("https://adactinhotelapp.com/index.php");
		 Thread.sleep(1000);
		}
		@When("user enter the {string} {string} credentials")
		public void user_enter_the_credentials(String username, String passward) {
			findElementByXpath("//input[@id='username']").sendKeys(username);
			findElementByXpath("//input[@id='password']").sendKeys(passward);
			
		}
		@When("user  click login button")
		public void user_click_login_button() {
		    
		    findElementByXpath("//input[@id='login']").click();
		}


	
		
		@Then("validate user enter page in initial page or not")
		public void validate_user_enter_page_in_initial_page_or_not() throws SocketException, InterruptedException  {
			getPageTitle("Adactin.com - Search Hotel");
			closeTab();
			
		    
	}


}

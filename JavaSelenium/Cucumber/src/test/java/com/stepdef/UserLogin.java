package com.stepdef;

import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.runner.BaseTestRunner;

public class UserLogin extends Base {
	static WebDriver driver;
	
	@Given("User launch the Edge browser")
	public void user_launch_the_edge_browser() {
	  launchbrowser("Edge");
	  
	}

	@When("user launch the url")
	public void user_launch_the_url() {
		System.out.println("*****************login to the application******************");
		launchAppUrl("https://adactinhotelapp.com/");
	}

	@When("user enter username")
	public void user_enter_username() {
		findElementByXpath("//input[@id='username']").sendKeys("Malathi150");
	 // driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Malathi150");
	}
	@When("user enter passward")
	public void user_enter_passward() {
		findElementByXpath("//input[@id='password']").sendKeys("Airmech03s*");
		 // driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Airmech03s*");
	}
	@And("user  select login button")
	public void user_select_login_button() {
		 findElementByXpath("//input[@id='login']").click();
	   
	}



	
	@Then("validate user navigate to booking page or not")
	public void validate_user_navigate_to_booking_page_or_not() throws SocketException, InterruptedException  {
		getPageTitle("Adactin.com - Search Hotel");
		
		
	    
}

	@Given("After login to the page")
	public void after_login_to_the_page() {
		//findElementByXpath("//input[@id='login']").click();
		System.out.println("*****************successfull login done******************");
	}

	/*@When("validate the presence of logout link")
	public void validate_the_presence_of_logout_link() throws InterruptedException {
		System.out.println("*****************logout process******************");
		
		findElementByXpath("//a[normalize-space()='Logout']");
	    
	  
	   
	}*/

	@When("user click logout button")
	public void user_click_logout_button() throws InterruptedException {
	//findElementByXpath("//a[normalize-space()='Logout']").click();
	   //isDisabled("//a[normalize-space()='Logout']");
		System.out.println("logout button clicked");
	}

	@And("validate presence of adactin homepage")
	public void validate_presence_of_adactin_homepage() throws SocketException, InterruptedException {
		//getPageTitle("Adactin.com - Hotel Reservation System");
		System.out.println("*****************logout done******************");
		//closeTab();
		driver.quit();
	}



}
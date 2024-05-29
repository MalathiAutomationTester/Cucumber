package com.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.SocketException;

import org.openqa.selenium.WebElement;

import com.pom.adactin.LoginPage;
import com.utility.Base;
public class BroswerValidation extends Base{
	
	LoginPage log;
@Given("User launch the Url in {string}")
public void user_launch_the_url_in(String browser) {
    // Write code here that turns the phrase above into concrete actions
  launchUrl(browser, "https://adactinhotelapp.com/index.php");
}

	@When("enter credentials")
	public void enter_credentials() {
		/* WebElement username = log.getUsername();
		log.setUsername(username);
		username.sendKeys("Malathi150");
		WebElement password = log.getPassword();
		log.setPassword(password);
		password.sendKeys("Airmech03s*");*/
		findElementByXpath("//input[@id='username']").sendKeys("Malathi150");
		findElementByXpath("//input[@id='password']").sendKeys("Airmech03s*");
	}

	@Then("User click login button")
	public void user_click_login_button() {
		findElementByXpath("//input[@id='login']").click();
		//WebElement login = log.getLogin();
		//log.setLogin(login);
		//login.click();
	}

	@And("validate user able to access or not")
	public void validate_user_able_to_access_or_not() throws SocketException, InterruptedException {
	   getPageTitle("Adactin.com - Search Hotel");
	   closeTab();
	}




}

package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base;
public class LoginPage extends Base {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@id='username']")
	private WebElement Username;
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='login']")
	private WebElement Login;
	public WebElement getUsername() {
		return Username;
	}
	public void setUsername(WebElement username) {
		Username = username;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogin() {
		return Login;
	}
	public void setLogin(WebElement login) {
		Login = login;
	}
	
	
}

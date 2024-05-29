package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("malathi");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("gobinath");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("chennai");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)" );
	}

}

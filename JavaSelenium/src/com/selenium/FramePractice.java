package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {
	/*
	 * https://ui.vision/demo/webtest/frames/
1.switch to 5th frame
2.click on link -open new iframe
3.switch to innerframe---
4.check logo presense in the inner frame


	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
		WebElement innerframe = driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']"));
		driver.switchTo().frame(innerframe);
		WebElement logo = driver.findElement(By.xpath("//a[@id='logo']//img"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		 Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", logo);
	    //boolean logo = driver.findElement(By.xpath("//div[@id='header']")).isDisplayed();
		if(!ImagePresent) {
			System.out.println("logo not displayed");
		}
			else
			{
				System.out.println("logo  displayed");
				
			}
		}
		
	}



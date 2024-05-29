package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	/*handle country dropdrop with /w/o using select class
	 * https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/
	 * 1.count total no of optons
	 * 2.print all the options
	 * 3.select one option
	 */
	
	
	/*
	 * hidden dropdown
	 * login orangehrm===>pim====>employee status
	 * 
	 */
	
	/*
	 * https://testautomationpractice.blogspot.com/
	 * color multiselect check box
	 * 
	 */
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='country-list']"));
		Select select=new Select(dropdown);
		//1.count total no of optons
		List<WebElement> options = select.getOptions();
		System.out.println("count total no of optons in dropdown   "+options.size());
		
		// 2.print all the options
	       for(WebElement op:options) {
	    	   System.out.println(op.getText());
	    	   if(op.getText().contentEquals("India")) {
	    		  //3.select one option
	    		   op.click();
	    	   }
	       }
	
	
	
	
	

}
}
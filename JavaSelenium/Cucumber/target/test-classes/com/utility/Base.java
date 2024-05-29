package com.utility;

import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	 //WebDriver driver;
	 private static Base helperClass;
     
	    private static WebDriver driver;
	    private static WebDriverWait wait;
	    public final static int TIMEOUT = 10;
	
	public void launchUrl(String brow,String url) {
		if(brow.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else
			if(brow.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else {
			if(brow.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
    
	}driver.get(url);
	driver.manage().window().maximize();
	
	}
	public WebElement findElementByXpath(String xpath) {
		// TODO Auto-generated method stub
         WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	public void getPageTitle(String Expected) {
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String Expectedtitle;//;="Adactin.com - Search Hotel";
				
				String Failed;//="Adactin.com - Hotel Reservation System";
				if(actualtitle.equals(Expected)) {
					System.out.println("user able to login suucessfull login");
					
				}else
				{System.out.println("user not able to login because of invalid credential");
				}
				}
 public void closeTab() throws InterruptedException, SocketException {
	 Thread.sleep(1000);
	// driver.close();
	 try {
         driver.close();
     }
     catch (Exception e) {
    	 System.out.println("An error occurred: " + e.getMessage());
    	 e.printStackTrace();
     }
 }
	 public void launchbrowser(String browser) {
			// TODO Auto-generated method stub
			 if(browser.equals("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
				}else
					if(browser.equals("Edge")){
					WebDriverManager.edgedriver().setup();
					driver=new EdgeDriver();
				}else {
					if(browser.equals("firefox")) {
						WebDriverManager.firefoxdriver().setup();
						driver=new FirefoxDriver();
					}
					driver.manage().window().maximize();
		}
}
	 public WebElement findByLinkText(String linktext) {
		WebElement element = driver.findElement(By.linkText(linktext));
       return element;
	}
	 
	 public void launchAppUrl(String url) {
		// TODO Auto-generated method stub
driver.get(url);
	}
	 public WebElement isDisabled(String xpath) throws InterruptedException {
		 WebElement element = driver.findElement(By.xpath(xpath));
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.navigate().refresh();
		 if(element.isDisplayed() == true) {
		    	System.out.println("logout link is visible");
		    	element.click();
		    }else
		    {
		    	System.out.println("logout link not visible");
		    }
	       return element;
	      
	       
	}
  
}
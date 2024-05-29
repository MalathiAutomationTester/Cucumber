package com.testrunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.helpers.Reporter;

import com.aventstack.extentreports.gherkin.model.Scenario;


@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features="D:\\MyWorkspace\\Cucumber\\src\\test\\resources\\cucumber Feature\\Login.feature",
        glue={"com.stepdef","Hooks"},
        tags ="@smoke", 
        		plugin =  { "pretty" ,"html:target/cucumber-reports//new.html"} ,// { "pretty" ,"json:target/cucumber-reports//new.json"},
        		//{"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true
)
public class TestRunner {
	static WebDriver driver;
	// @AfterClass
	   public static void teardown(io.cucumber.java.Scenario sc) throws IOException {
	     /*  if(sc.isFailed()) {
	    	   TakesScreenshot tk=(TakesScreenshot)driver;
	    File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
	    File file=new File("D:\\MyWorkspace\\Cucumber\\target\\Screenshoot\\failted.png");
	    FileUtils.copyFile(screenshotAs, file);*/
	       }
	       
	    }


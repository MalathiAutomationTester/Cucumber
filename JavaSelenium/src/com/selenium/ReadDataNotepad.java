package com.selenium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataNotepad {
public static void main(String[] args) throws IOException {
	
	String TestFile = "C:\\Users\\gobin\\OneDrive\\Desktop\\Testdata.txt";
	FileReader FR = new FileReader(TestFile);
	BufferedReader BR = new BufferedReader(FR);
	String Content = "";

	//Loop to read all lines one by one from file and print It.
	try {
		while((Content = BR.readLine())!= null){
			System.out.println(Content);
			WebDriver driver=new ChromeDriver();
			//WebDriver driver = new ChromeDriver();
			driver.get(Content);
			String Tittle=driver.getTitle();
			System.out.println("Tittle of Page is"+ Tittle);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

package com.Hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {
	@BeforeAll
	public static void beforeAll() {
          System.out.println("Adactin full automation start");
	}

	
	@AfterAll
	public static void afterAll() {
         System.out.println("adactin full automation complete");
	}
}

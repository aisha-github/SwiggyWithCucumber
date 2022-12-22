package com.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import com.swiggy.pages.CheckoutPage;
import com.swiggy.pages.HomePage;
import com.swiggy.pages.LandingPage;
import com.swiggy.pages.RestaurantPage;

public class Driver extends Tools {

	protected static LandingPage landingPage;
	protected static HomePage homePage;
	protected static RestaurantPage restaurantPage;
	protected static CheckoutPage checkoutPage;
	public static final String BASE_URL = "https://swiggy.com";

	public static void init() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BASE_URL);
		landingPage = new LandingPage(driver);
		homePage = new HomePage(driver);
		restaurantPage = new RestaurantPage(driver);
		checkoutPage = new CheckoutPage(driver);
	}
}

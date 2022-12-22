package com.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
		String os = System.getProperty("os.name").toLowerCase();
		ChromeOptions chromeOptions = new ChromeOptions();

		if(os.contains("win")) {
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		}else if(os.contains("nix") || os.contains("aix") || os.contains("nux")) {
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
			chromeOptions.addArguments("--headless");
		}

		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get(BASE_URL);
		landingPage = new LandingPage(driver);
		homePage = new HomePage(driver);
		restaurantPage = new RestaurantPage(driver);
		checkoutPage = new CheckoutPage(driver);
	}
}

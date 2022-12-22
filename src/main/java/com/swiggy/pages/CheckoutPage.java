package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

	@FindBy(xpath = "//div[@class='_2axtv']")
	private WebElement loginString;
	
	WebDriverWait wait;
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public String getCheckoutPage() {
		try {
			return loginString.getText();
		}catch(Exception e) {
			e.printStackTrace();
			return "";
		}
	}
}

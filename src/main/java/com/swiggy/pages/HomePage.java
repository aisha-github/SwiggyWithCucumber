package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	@FindBy(xpath = "(//div[contains(@class, '_3XX_A')])[1]")
	private WebElement firstRestaurant;

	WebDriverWait wait;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void clickOnFirstRestaurant() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(firstRestaurant));
		Thread.sleep(3000);
		firstRestaurant.click();
	}
}

package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	@FindBy(id = "location")
	private WebElement txtLocation;

	@FindBy(xpath = "//div[contains(@class, '_1oLDb')]/button[1]")
	private WebElement btnLocation;
	
	WebDriverWait wait;

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void insertLocation(String location) throws InterruptedException {
		txtLocation.sendKeys(location);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(btnLocation));
		btnLocation.click();
		Thread.sleep(3000);
	}
}

package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RestaurantPage {

	// Search first item which is not customizable
	@FindBy(xpath = "(//div[contains(@class,'_1RPOp')][not(../div[text()='Customisable'])])[1]")
	private WebElement firstItem;

	@FindBy(xpath = "//a[@href='/checkout']")
	private WebElement cart;

	@FindBy(xpath = "//div[@class='_2haVU']")
	private WebElement cartPopup;

	@FindBy(xpath = "//div[text()='Checkout']")
	private WebElement checkout;
	
	private Actions actions;
	private WebDriverWait wait;
	
	public RestaurantPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		actions = new Actions(driver);
	}
	
	public void addFirstItemToCart() throws InterruptedException {
		Thread.sleep(3000);
		actions.moveToElement(firstItem).build().perform();
		firstItem.click();
		Thread.sleep(5000);
	}
		
	public void hoverOnCartLink() throws InterruptedException {
		actions.moveToElement(cart).build().perform();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(cartPopup));
		Thread.sleep(3000);
	}
	
	public void clickOnCheckout() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(checkout));
		Thread.sleep(3000);
		checkout.click();
		Thread.sleep(3000);
	}
}

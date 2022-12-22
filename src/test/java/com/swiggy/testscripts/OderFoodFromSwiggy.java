package com.swiggy.testscripts;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OderFoodFromSwiggy extends Driver {
		
	@Given("a user is on the landing page of swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
		String expectedUrl = "https://www.swiggy.com/";
		assertEquals(driver.getCurrentUrl(), expectedUrl);
	}

	@When("he insert and selects New Delhi location")
	public void he_insert_and_selects_new_delhi_location() throws InterruptedException {
		landingPage.insertLocation("New Delhi");
	}

	@When("he clicks on the first restaurant from the list")
	public void he_clicks_on_the_first_restaurant_from_the_list() throws InterruptedException {
		homePage.clickOnFirstRestaurant();
	}

	@When("he adds the first item in the cart from Top Picks section")
	public void he_adds_the_first_item_in_the_cart_from_top_picks_section() throws InterruptedException {
	    restaurantPage.addFirstItemToCart();
	}

	@When("he clicks on the checkout button under the Cart")
	public void he_clicks_on_the_checkout_button_under_the_cart() throws InterruptedException {
	    restaurantPage.hoverOnCartLink();
	    restaurantPage.clickOnCheckout();
	}

	@Then("he should see the checkout page")
	public void he_should_see_the_checkout_page() throws InterruptedException {
		String checkoutString = checkoutPage.getCheckoutPage();
		String expected = "To place your order now, log in to your existing account or sign up.";
		assertEquals(checkoutString, expected);
		Thread.sleep(4000);
	}
}

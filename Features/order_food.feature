Feature: Order from Swiggy

Scenario: A user should be able to order something
Given a user is on the landing page of swiggy
When he insert and selects New Delhi location
And he clicks on the first restaurant from the list
And he adds the first item in the cart from Top Picks section
And he clicks on the checkout button under the Cart
Then he should see the checkout page

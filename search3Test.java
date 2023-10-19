package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search3Test {
    //fourth
    @Given("a user is on the product listings page")
    public void a_user_is_on_the_product_listings_page() {
        System.out.println("A user is on the product listings page.");

    }
    @When("they choose to sort products by price in ascending order")
    public void they_choose_to_sort_products_by_price_in_ascending_order() {
        System.out.println("User chooses to sort products by price in ascending order");

    }
    @Then("the products should be displayed from the lowest to the highest price")
    public void the_products_should_be_displayed_from_the_lowest_to_the_highest_price() {
        System.out.println("Products should be displayed from the lowest to the highest price.");

    }
}

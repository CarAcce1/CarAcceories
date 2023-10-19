package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search2Test {
    //third

    @Given("a user is on the product listings page")
    public void a_user_is_on_the_product_listings_page() {
        System.out.println("A user is on the product listings page.");

    }
    @When("they set a price range filter from ${int} to ${int}")
    public void they_set_a_price_range_filter_from_$_to_$(Integer minPrice, Integer maxPrice) {
        System.out.println("User sets a price range filter from $" + minPrice + " to $" + maxPrice);

    }
    @Then("they should see a list of products within the price range")
    public void they_should_see_a_list_of_products_within_the_price_range() {
        System.out.println("User should see a list of products within the price range.");

    }
}

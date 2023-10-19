package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class listing4Test {
    //fourth scenario
    @Given("a user is on the product details page")
    public void a_user_is_on_the_product_details_page() {
        System.out.println("A user is on the product details page.");

    }
    @When("they view the product price")
    public void they_view_the_product_price() {
        System.out.println("User views the product price.");
    }
    @When("they compare it with other similar products")
    public void they_compare_it_with_other_similar_products() {
        System.out.println("User compares the product price with other similar products.");
    }
    @Then("the price should be competitive with similar products")
    public void the_price_should_be_competitive_with_similar_products() {
        System.out.println("The price should be competitive with similar products.");
    }
}

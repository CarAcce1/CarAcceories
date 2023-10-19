package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class listing2Test {
    //secenond scenario
    @Given("a user is on the product listings page")
    public void a_user_is_on_the_product_listings_page() {
        System.out.println("A user is on the product listings page.");

    }

    @When("they click on a product named {string}")
    public void they_click_on_a_product_named(String productName) {
        System.out.println("User clicks on the product named: " + productName);

    }

    @Then("they should see detailed product information")
    public void they_should_see_detailed_product_information() {
        System.out.println("User should see detailed product information.");
    }

    @Then("the product should include a description, image, price, and show {string}")
    public void the_product_should_include_a_description_image_price_and_show(String attributeName) {
        System.out.println("The product should include a description, image, price, and show: " + attributeName);

    }
}

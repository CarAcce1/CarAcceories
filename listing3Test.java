package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class listing3Test {
    //third scenario
    @Given("a user is on the product details page")
    public void a_user_is_on_the_product_details_page() {
        System.out.println("A user is on the product details page.");

    }

    @When("they hover over the product image")
    public void they_hover_over_the_product_image() {
        System.out.println("User hovers over the product image.");

    }

    @Then("they should be able to zoom in on the product image")
    public void they_should_be_able_to_zoom_in_on_the_product_image() {
        System.out.println("User should be able to zoom in on the product image.");

    }



}

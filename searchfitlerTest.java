package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchfitlerTest {
    private String searchQuery;

    @Given("a user is on the product listings page")
    public void a_user_is_on_the_product_listings_page() {
        System.out.println("A user is on the product listings page.");

    }
    @When("they enter {string} in the search bar")
    public void they_enter_in_the_search_bar(String string) {
        String searchTerm=null;
        searchQuery = searchTerm;
    }
    @When("they press the {string} button")
    public void they_press_the_button(String buttonLabel) {

        System.out.println("User pressed the " + buttonLabel + " button.");
    }

    @Then("they should see a list of products matching {string}")
    public void they_should_see_a_list_of_products_matching(String searchTerm) {
        System.out.println("User should see a list of products matching: " + searchTerm);
    }







    //fifth scenario

    @Given("a user is on the product listings page with applied filters")
    public void a_user_is_on_the_product_listings_page_with_applied_filters() {

    }
    @When("they click the {string} button")
    public void they_click_the_button(String string) {

    }
    @Then("all applied filters should be reset, and the complete product list should be displayed")
    public void all_applied_filters_should_be_reset_and_the_complete_product_list_should_be_displayed() {


    }
}

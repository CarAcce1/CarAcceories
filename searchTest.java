package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchTest
{
//second
@Given("a user is on the product listings page")
    public void a_user_is_on_the_product_listings_page() {
    System.out.println("A user is on the product listings page.");
    }

    @When("they select the {string} category from the category filter")
    public void they_select_the_category_from_the_category_filter(String selectedCategory) {
        System.out.println("User selects the category: " + selectedCategory);
    }

    @Then("they should see a list of products in the {string} category")
    public void they_should_see_a_list_of_products_in_the_category(String expectedCategory) {
        System.out.println("User should see a list of products in the " + expectedCategory + " category");

    }

}

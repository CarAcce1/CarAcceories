package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class productTest {


    Productt producet = new Productt();


    @Given("a user is logged in as an admin")
    public boolean a_user_is_logged_in_as_an_admin() {
        String username = "admin";
        String password = "admin_password";
        if (isValidAdmin(username, password)) {
            System.out.println("Logged in as admin.");
            return true;
        } else {
            System.out.println("Failed to log in as admin.");
            return false;
        }
    }

    private boolean isValidAdmin(String username, String password) {
        return false;
    }


    @When("they create a category with the name {string}")
    public void they_create_a_category_with_the_name(String string) {

        String categoryName=null;
        if (producet.createCategory(categoryName)) {
            System.out.println("Category '" + categoryName + "' created successfully.");
        } else {
            System.out.println("Failed to create category '" + categoryName + "'.");
        }
    }

    @Then("the categories {string} {string} and {string} should exist")
    public void the_categories_and_should_exist (String string, String string2, String string3, Object string1){
        assertTrue(producet.isValid(string1,string2,string3));
    }
////////////////////////////////////////
    //second scenario
    @Given("the categories {string} and {string} exist")
    public void the_categories_and_exist(String string, String string2, Productt categoryService) {
        String category1=null;
        categoryService.createCategory(category1);    }

    @When("they add a product named {string} to the {string} category")
    public void they_add_a_product_named_to_the_category(String string, String string2, Object productService) {

    }




    @Then("the products {string} and {string} should be in their respective categories")
    public void the_products_and_should_be_in_their_respective_categories(String string, String string2) {


    }
    //third scenario

    @Given("a user is logged in")
    public void a_user_is_logged_in() {
        System.out.println("User is logged in.");

    }
    @Given("the categories {string} {string} and {string} exist")
    public void the_categories_and_exist(String string, String string2, String string3) {

    }
    @When("they select the {string} category")
    public void they_select_the_category(String string) {

    }
    @Then("they should see the product {string}")
    public void they_should_see_the_product(String string) {

    }
    @Then("they should not see the product {string}")
    public void they_should_not_see_the_product(String string) {

    }
}

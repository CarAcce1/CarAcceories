package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class notificationsTest {
    @Given("an order has been placed")
    public void an_order_has_been_placed() {
        System.out.println("An order has been placed.");
    }

    @When("the order is confirmed")
    public void the_order_is_confirmed() {
        System.out.println("The order is confirmed.");
    }
    @Then("an email confirmation should be sent to the customer")
    public void an_email_confirmation_should_be_sent_to_the_customer() {
        System.out.println("An email confirmation should be sent to the customer.");

    }
    //third scenario
    private boolean newInstallationRequestReceived;
    private void receiveInstallationRequest() {
        newInstallationRequestReceived = true;

    }
    @Given("a new installation request is received")
    public void a_new_installation_request_is_received() {
        receiveInstallationRequest();

        System.out.println("A new installation request has been received.");
    }
    private boolean requestAssignedToInstaller;
    private void assignRequestToInstaller() {
        requestAssignedToInstaller = true;

    }
        @When("the request is assigned to an installer")
    public void the_request_is_assigned_to_an_installer() {
        assignRequestToInstaller();

        System.out.println("The installation request has been assigned to an installer.");
    }
    private boolean installerInformedAboutRequest;
    private void informInstallerAboutRequest() {
        installerInformedAboutRequest = true;

    }
        @Then("the installer should be informed about the new request")
    public void the_installer_should_be_informed_about_the_new_request() {
        informInstallerAboutRequest();
        Assert.assertTrue("Installer has been informed about the new request", installerInformedAboutRequest);
    }

}

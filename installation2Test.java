package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testclasses.availabilityConfirmationService;

public class installation2Test {
    ///////////////////////////////////////////////
    //third scenario

    @Given("an installer is available for the specified date and time")
    public void an_installer_is_available_for_the_specified_date_and_time() {
        String specifiedDate = "2023-10-31";
        String specifiedTime = "14:00";

        boolean isInstallerAvailable = installerAvailabilityService.isInstallerAvailable(specifiedDate);

        if (isInstallerAvailable) {
            System.out.println("An installer is available for the specified date and time.");
        } else {
            System.out.println("No installer is available for the specified date and time.");}
    }

    @When("the customer checks installer availability")
    public void the_customer_checks_installer_availability() {
        boolean isInstallerAvailable = installerAvailabilityChecker.checkAvailability();
        if (isInstallerAvailable) {
            System.out.println("Installer is available for the specified date and time.");
        } else {
            System.out.println("Installer is not available for the specified date and time.");
        }
    }

    @Then("the installer's availability for the selected date should be confirmed")
    public void the_installer_s_availability_for_the_selected_date_should_be_confirmed() {
        boolean isAvailabilityConfirmed = availabilityConfirmationService.confirmAvailability();
        if (isAvailabilityConfirmed) {
            System.out.println("Installer's availability for the selected date is confirmed.");
        } else {
            System.out.println("Installer's availability for the selected date is not confirmed.");
        }
    }

}

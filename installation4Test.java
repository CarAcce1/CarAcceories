package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import testclasses.appointmentService;
import testclasses.confirmationService;
import testclasses.installerAvailabilityService;

import static org.junit.Assert.assertTrue;

public class installation4Test {
    //sixth scenario
    @Given("the customer has an existing installation appointment")
    public void the_customer_has_an_existing_installation_appointment() {
        boolean hasExistingAppointment = appointmentService.hasExistingAppointment();

        if (hasExistingAppointment) {
            System.out.println("The customer has an existing installation appointment.");
        } else {
            System.out.println("The customer does not have an existing installation appointment.");
        }
    }

    @When("they request to reschedule the appointment")
    public void they_request_to_reschedule_the_appointment() {
        boolean rescheduleRequested = appointmentService.requestReschedule();
        if (rescheduleRequested) {
            System.out.println("The customer has requested to reschedule the appointment.");
        } else {
            System.out.println("Failed to request a reschedule of the appointment.");
        }
    }

    @When("the installer is available for the new date")
    public void the_installer_is_available_for_the_new_date() {
        String newDate = "2023-11-23";
        boolean isInstallerAvailableForNewDate = installerAvailabilityService.isInstallerAvailable(newDate);

        if (isInstallerAvailableForNewDate) {
            System.out.println("The installer is available for the new date.");
        } else {
            System.out.println("The installer is not available for the new date.");
        }

    }

    @Then("the appointment should be rescheduled")
    public void the_appointment_should_be_rescheduled() {
        boolean isRescheduled = appointmentService.rescheduleAppointment();
        Assert.assertTrue("Appointment should be successfully rescheduled", isRescheduled);

    }

    @Then("the customer should receive confirmation")
    public void the_customer_should_receive_confirmation() {
        boolean confirmationReceived = confirmationService.sendConfirmation();

        // You can then use assertions or validations to confirm that the customer has received confirmation:
        Assert.assertTrue( "The customer should receive confirmation",confirmationReceived);
    }
}

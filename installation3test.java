package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testclasses.availabilityConfirmationService;

public class installation3test {
    //fourth scenario

    @Given("the installer's availability is confirmed")
    public void the_installer_s_availability_is_confirmed() {
        availabilityConfirmationService.setAvailabilityConfirmed(true);

    }

    @When("the customer schedules an installation appointment")
    public void the_customer_schedules_an_installation_appointment() {
        boolean isAppointmentScheduled = schedulingService.scheduleAppointment();

        if (isAppointmentScheduled) {
            System.out.println("The installation appointment has been scheduled.");
        } else {
            System.out.println("Failed to schedule the installation appointment.");
        }
    }

    @Then("the appointment should be scheduled")
    public void the_appointment_should_be_scheduled() {
        boolean isAppointmentScheduled = schedulingService.isAppointmentScheduled();

        if (isAppointmentScheduled) {
            System.out.println("The installation appointment has been successfully scheduled.");
        } else {
            System.out.println("The installation appointment is not scheduled or not confirmed.");
        }
    }

    @Then("the customer should receive confirmation")
    public void the_customer_should_receive_confirmation() {
        boolean confirmationReceived = notificationService.checkForConfirmation(); // A hypothetical method to check for confirmation

        if (confirmationReceived) {
            System.out.println("The customer has received confirmation.");
        } else {
            System.out.println("The customer has not received confirmation.");
        }

    }
}

package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import testclasses.*;

public class installationTest {
    @Given("a customer is logged in")
    public void a_customer_is_logged_in() {
        boolean loginSuccessful = Authentication.loginAsCustomer();

        if (loginSuccessful) {
            System.out.println("Customer is logged in.");
        } else {
            System.out.println("Failed to log in as a customer.");
        }

    }

    @When("they select a product that offers installation services")
    public void they_select_a_product_that_offers_installation_services() {
        String productId = "product123";
        productpage productpage = new productpage();
        productpage.navigateToProduct(productId);
    }

    @When("they choose to request installation service")
    public void they_choose_to_request_installation_service() {
        if (productpage.requestInstallationService()) {
            System.out.println("Installation service requested successfully.");
        } else {
            System.out.println("Failed to request installation service.");
        }
    }

    @Then("they should be directed to a form for specifying installation details")
    public void they_should_be_directed_to_a_form_for_specifying_installation_details() {
        boolean isOnInstallationForm = installationRequestForm.isDisplayed();
        if (isOnInstallationForm) {
            System.out.println("Customer is on the installation request form page.");
        } else {
            System.out.println("Customer is not on the installation request form page.");
        }

    }
/////////////////////////////////////

    //second scenario
    @Given("a customer is on the installation details form")
    public void a_customer_is_on_the_installation_details_form() {
        if (installationDetailsForm.navigateToForm()) {
            System.out.println("Customer is on the installation details form.");
        } else {
            System.out.println("Failed to navigate to the installation details form.");
        }
    }

    @When("they provide details such as car make\\/model and preferred installation date")
    public void they_provide_details_such_as_car_make_model_and_preferred_installation_date() {
        String carMakeModel = "GTI"; // Replace with actual car make/model
        String preferredInstallationDate = "2023-10-31";
        installationDetailsForm.fillForm(carMakeModel, preferredInstallationDate);

    }

    @When("they submit the form")
    public void they_submit_the_form() {
        if (installationDetailsForm.submitForm()) {
            System.out.println("Form submitted successfully.");
        } else {
            System.out.println("Failed to submit the form.");
        }
    }

    @Then("the installation details should be saved")
    public void the_installation_details_should_be_saved() {
        if (installationDetailsForm.areDetailsSaved()) {
            System.out.println("Installation details have been saved.");
        } else {
            System.out.println("Installation details have not been saved.");
        }
    }
////////////////////////////////////////
//fifth scenario
@Given("an installer is not available for the specified date and time")
public void an_installer_is_not_available_for_the_specified_date_and_time() {
    String specifiedDate = "2023-10-31";
    String specifiedTime = "14:00";

    boolean isInstallerAvailable = installerAvailabilityService.isInstallerAvailable(specifiedDate);

    boolean isInstallerNotAvailable = !isInstallerAvailable;

    if (isInstallerNotAvailable) {
        System.out.println("An installer is not available for the specified date and time.");
    } else {
        System.out.println("An installer is available for the specified date and time, which is unexpected.");
    }
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

    @Then("the customer should be informed of the unavailability")
    public void the_customer_should_be_informed_of_the_unavailability() {
        boolean informedOfUnavailability = notificationService.checkForUnavailabilityMessage();

        if (informedOfUnavailability) {
            System.out.println("The customer has been informed of the unavailability.");
        } else {
            System.out.println("The customer has not been informed of the unavailability.");
        }
    }
/////////////////////////////////////
    //seventh scenario
    @Given("the customer has an existing installation appointment")
    public void the_customer_has_an_existing_installation_appointment() {
        appointmentService.createSampleAppointment();

    }
    @When("they request to cancel the appointment")
    public void they_request_to_cancel_the_appointment() {
        boolean isCanceled = appointmentService.cancelAppointment();

    }

    @Then("the appointment should be canceled")
    public void the_appointment_should_be_canceled() {
        boolean isCanceled = appointmentService.isAppointmentCanceled();

        // You can then use assertions or validations to confirm that the appointment has been canceled:
        Assert.assertTrue( "The appointment should be successfully canceled",isCanceled);
    }

    @Then("the customer should receive confirmation")
    public void the_customer_should_receive_confirmation() {
        boolean confirmationReceived = confirmationService.checkConfirmation();

        Assert.assertTrue("The customer should have received confirmation",confirmationReceived);
    }
    ///////////////////////////////////////
    //eigth scenario

    @Given("the customer has scheduled an installation appointment")
    public void the_customer_has_scheduled_an_installation_appointment() {
        appointmentService.createSampleScheduledAppointment();
    }

    @When("they view their installation details")
    public void they_view_their_installation_details() {
        appointmentService.displayInstallationDetails();
    }

    @Then("they should see the appointment date, installer information, and other relevant details")
    public void they_should_see_the_appointment_date_installer_information_and_other_relevant_details() {
        boolean detailsVisible = appointmentService.areAppointmentDetailsVisible();

        Assert.assertTrue("The customer should see appointment details, including date and installer information",detailsVisible);
    }

    }

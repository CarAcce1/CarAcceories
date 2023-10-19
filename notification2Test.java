package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

//second scenario
public class notification2Test {
    private String orderStatus;

    @Given("an order has been placed")
    public void an_order_has_been_placed() {
        System.out.println("An order has been placed.");

    }
    @When("the order status is updated")
    public void the_order_status_is_updated() {
        orderStatus = "Confirmed";
        System.out.println("Order status has been updated to: " + orderStatus);
    }
    private boolean emailNotificationSent;
    private boolean pushNotificationSent;
    private void sendPushNotification() {
        pushNotificationSent = true;
        sendEmailNotification();
        sendPushNotification();

        if (emailNotificationSent || pushNotificationSent) {
            System.out.println("A notification (email or push notification) was sent to the customer.");
        } else {
            System.out.println("No notification (email or push notification) was sent to the customer.");
        }
    }

    private void sendEmailNotification() {
        pushNotificationSent = true;
    }


    @Then("a notification should be sent to the customer \\(email or push notification)")
    public void a_notification_should_be_sent_to_the_customer_email_or_push_notification() {
        sendEmailNotification();
        sendPushNotification();
        Assert.assertTrue("Email notification was sent", emailNotificationSent);
        Assert.assertTrue("Push notification was sent", pushNotificationSent);
    }
        }


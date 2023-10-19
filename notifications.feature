Feature: Notifications

  As a system that manages orders and installations,
  I want to notify customers about order confirmations and updates
  and inform installers about new installation requests,
  So that all relevant parties are kept informed of the progress.

  Scenario: Send Order Confirmation Email to Customer
    Given an order has been placed
    When the order is confirmed
    Then an email confirmation should be sent to the customer

  Scenario: Send Order Update Notification to Customer
    Given an order has been placed
    When the order status is updated
    Then a notification should be sent to the customer (email or push notification)

  Scenario: Inform Installers about New Installation Request
    Given a new installation request is received
    When the request is assigned to an installer
    Then the installer should be informed about the new request


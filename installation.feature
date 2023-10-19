Feature: Installation Services

  Scenario: Requesting Installation Service
    Given a customer is logged in
    When they select a product that offers installation services
    And they choose to request installation service
    Then they should be directed to a form for specifying installation details

  Scenario: Specifying Installation Details
    Given a customer is on the installation details form
    When they provide details such as car make/model and preferred installation date
    And they submit the form
    Then the installation details should be saved

  Scenario: Checking Installer Availability
    Given an installer is available for the specified date and time
    When the customer checks installer availability
    Then the installer's availability for the selected date should be confirmed

  Scenario: Scheduling an Installation Appointment
    Given the installer's availability is confirmed
    When the customer schedules an installation appointment
    Then the appointment should be scheduled
    And the customer should receive confirmation

  Scenario: Installer Unavailability
    Given an installer is not available for the specified date and time
    When the customer checks installer availability
    Then the customer should be informed of the unavailability

  Scenario: Rescheduling an Installation Appointment
    Given the customer has an existing installation appointment
    When they request to reschedule the appointment
    And the installer is available for the new date
    Then the appointment should be rescheduled
    And the customer should receive confirmation

  Scenario: Canceling an Installation Appointment
    Given the customer has an existing installation appointment
    When they request to cancel the appointment
    Then the appointment should be canceled
    And the customer should receive confirmation

  Scenario: Reviewing Installation Details
    Given the customer has scheduled an installation appointment
    When they view their installation details
    Then they should see the appointment date, installer information, and other relevant details

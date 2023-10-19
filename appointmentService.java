package testclasses;

import java.time.LocalDateTime;

public class appointmentService {
    private static Appointment sampleScheduledAppointment;

    public static class Appointment {
        private String customerName;
        private LocalDateTime appointmentDate;
        private String installerName;

        public Appointment(String customerName, LocalDateTime appointmentDate, String installerName) {
            this.customerName = customerName;
            this.appointmentDate = appointmentDate;
            this.installerName = installerName;
        }
        public String getCustomerName() {
            return customerName;
        }

        public LocalDateTime getAppointmentDate() {
            return appointmentDate;
        }

        public String getInstallerName() {
            return installerName;
        }
    }

        public String getCustomerName() {
            return getCustomerName();
        }
    private static boolean existingAppointment = false;

    public static boolean hasExistingAppointment() {
        return existingAppointment;
    }

    public static boolean requestReschedule() {
        return false;
    }

    public static boolean rescheduleAppointment() {
        return false;
    }

    public static appointmentService createSampleAppointment() {
        existingAppointment = true;
        return null;
    }

    public static boolean cancelAppointment() {
        existingAppointment = false;
        return false;
    }

    public static boolean isAppointmentCanceled() {
    return false;
    }

    public static void createSampleScheduledAppointment() {
        LocalDateTime appointmentDate = LocalDateTime.now().plusDays(7);
        String customerName = "John Doe";
        String installerName = "Installer Name";

        // Create an instance of the Appointment class with the details
        sampleScheduledAppointment = new Appointment(customerName, appointmentDate, installerName);
    }


    public static void displayInstallationDetails() {
        if (sampleScheduledAppointment != null) {
            System.out.println("Appointment Date: " + sampleScheduledAppointment.getAppointmentDate());
            System.out.println("Installer: " + sampleScheduledAppointment.getInstallerName());
            System.out.println("Customer: " + sampleScheduledAppointment.getCustomerName());
        } else {
            System.out.println("No appointment details to display.");
        }
    }

    public static boolean areAppointmentDetailsVisible() {
        return false;
    }
    }

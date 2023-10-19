package testclasses;

public class schedulingService {
    private static boolean appointmentScheduled = false;

    public static boolean scheduleAppointment() {
        appointmentScheduled = true;
        return appointmentScheduled;
    }

    public static boolean isAppointmentScheduled() {
        return appointmentScheduled;
    }
}

package testclasses;

public class availabilityConfirmationService {
    private static boolean availabilityConfirmed = false;
    private static boolean confirmed;

    public static boolean confirmAvailability() {
        availabilityConfirmed = true;
        return availabilityConfirmed;

    }

    public static void setAvailabilityConfirmed(boolean b) {
        availabilityConfirmed = confirmed;
    }
}

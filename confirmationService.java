package testclasses;

public class confirmationService {
    private static boolean confirmationSent = false;

    public static boolean sendConfirmation() {
        confirmationSent = true;
        return confirmationSent;
    }

    public static boolean checkConfirmation() {
        return confirmationSent;

    }
}

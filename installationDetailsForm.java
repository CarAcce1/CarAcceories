package testclasses;

public class installationDetailsForm {
    private static String filledCarMakeModel;
    private static String filledPreferredInstallationDate;
    private static boolean detailsSaved = false;
    public static boolean navigateToForm() {
        return true;
    }

    public static void fillForm(String carMakeModel, String preferredInstallationDate) {
        filledCarMakeModel = carMakeModel;
        filledPreferredInstallationDate = preferredInstallationDate;
    }

    public static boolean submitForm() {
        if (filledCarMakeModel != null && filledPreferredInstallationDate != null) {
            detailsSaved = true;
            return true;
        }
        return false;
    }


    public static boolean areDetailsSaved() {
        return detailsSaved;
    }
}

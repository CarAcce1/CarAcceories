package testclasses;

import java.time.LocalDate;
import java.util.List;
public class installerAvailabilityService {
    private static List<LocalDate> installerSchedules = initializeInstallerSchedules();
    public static boolean isInstallerAvailable(String specifiedDate) {
        LocalDate dateToCheck = LocalDate.parse(specifiedDate);
        if (installerSchedules.contains(dateToCheck)) {
            return true;  // Installer is available on the specified date.
        } else {
            return false; // Installer is not available on the specified date.
        }
    }
    private static List<LocalDate> initializeInstallerSchedules() {

        List<LocalDate> schedules = List.of(
                LocalDate.of(2023, 10, 20),
                LocalDate.of(2023, 10, 25),
                LocalDate.of(2023, 11, 1)
                // Add more dates as needed
        );
        return schedules;
    }
}

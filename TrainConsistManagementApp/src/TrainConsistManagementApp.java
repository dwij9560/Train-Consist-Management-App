import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * =========================================================
 * MAIN CLASS - UseCase11TrainConsistMgmt
 * =========================================================
 *
 * Use Case 11: Validate Train ID and Cargo Code (Regex)
 *
 * =========================================================
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code ");
        System.out.println("========================================\n");

        Scanner scanner = new Scanner(System.in);

        // ---- Accept input ----
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainID = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ---- DEFINE REGEX RULES ----
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // ---- VALIDATION ----
        boolean isTrainValid = Pattern.matches(trainRegex, trainID);
        boolean isCargoValid = Pattern.matches(cargoRegex, cargoCode);

        // ---- DISPLAY RESULT ----
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");
    }
}
/**
 * =========================================================
 * MAIN CLASS – UseCase3TrainConsistMgmt
 * =========================================================
 *
 * Use Case 3: Track Unique Bogie IDs (Set – HashSet)
 *
 * Description:
 * This class ensures that duplicate bogie IDs are not added
 * to the train by using a HashSet.
 *
 * At this stage, the application:
 * - Adds bogie IDs
 * - Prevents duplicate entries automatically
 * - Displays only unique bogie IDs
 *
 * This demonstrates the use of Set for enforcing uniqueness.
 *
 * @author dwij vishwakarma
 * @version 3.0
 */

import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp  {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("=== UC3 - Track Unique Bogie IDs ===");
        System.out.println("======================================\n");

        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("After Adding Bogie IDs (with duplicates):");
        System.out.println("Bogie IDs : " + bogieIds);

        // Final unique set
        System.out.println("\nFinal Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nUC3 operations completed successfully...");
    }
}
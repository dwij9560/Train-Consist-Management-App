import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("========================================\n");

        // Create array of bogie IDs (can be unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Bogie ID to search
        String searchId = "BG309";

        // ---- Ensure array is sorted ----
        Arrays.sort(bogieIds);

        // ---- Display sorted bogies ----
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // ---- BINARY SEARCH LOGIC ----
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = searchId.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison > 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        // ---- Display result ----
        if (found) {
            System.out.println("\nBogie " + searchId + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}
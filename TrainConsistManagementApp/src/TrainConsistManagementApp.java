/**
 * =========================================================
 * MAIN CLASS – UseCase1TrainConsistMgmt
 * =========================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * @author Developer
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp  {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        // System ready message
        System.out.println("\nSystem ready for operations...");
    }
}
package edu.monmouth.problemset4;

import java.util.Arrays;
import edu.monmouth.campusvehicle.*;

public class ProblemSet4 {

    public static void main(String[] args) {

        // Requirement 4: Create an array to hold 10 vehicle references
        CampusVehicle[] campusVehicles =
                new CampusVehicle[CampusVehicleConstants.NUMBER_OF_VEHICLES];

        // Requirement 5: Use all 10 vehicles supplied by the professor
        CampusVehicle campusVehicle1 = new CampusVehicle("mu1001ub", "University Bluffs", true, Color.BLACK);
        CampusVehicle campusVehicle2 = new CampusVehicle("mu1001lib", "Library", true, Color.GREEN);
        CampusVehicle campusVehicle3 = new CampusVehicle("mu1001pl", "Parking Lot", true, Color.BLUE);
        CampusVehicle campusVehicle4 = new CampusVehicle("mu1001lh", "Laurel Hall", true, Color.WHITE);
        CampusVehicle campusVehicle5 = new CampusVehicle("mu1001sh", "Spruce Hall", true, Color.BLACK);
        CampusVehicle campusVehicle6 = new CampusVehicle("mu1002lib", "Library", true, Color.YELLOW);
        CampusVehicle campusVehicle7 = new CampusVehicle("mu1002pl", "Parking Lot", true, Color.BLACK);
        CampusVehicle campusVehicle8 = new CampusVehicle("mu1002sh", "Spruce Hall", true, Color.BLUE);
        CampusVehicle campusVehicle9 = new CampusVehicle("mu101", "University Bluffs", true, Color.BLACK);
        CampusVehicle campusVehicle10 = new CampusVehicle("mu1003pl", "Campus Police", true, Color.BLACK);

        // Populate the array
        campusVehicles[0] = campusVehicle1;
        campusVehicles[1] = campusVehicle2;
        campusVehicles[2] = campusVehicle3;
        campusVehicles[3] = campusVehicle4;
        campusVehicles[4] = campusVehicle5;
        campusVehicles[5] = campusVehicle6;
        campusVehicles[6] = campusVehicle7;
        campusVehicles[7] = campusVehicle8;
        campusVehicles[8] = campusVehicle9;
        campusVehicles[9] = campusVehicle10;

        // Requirement 6: Print all vehicle attributes
        System.out.println("STEP 6: ALL CAMPUS VEHICLES");

        for (int i = 0; i < campusVehicles.length; i++) {
            printAttributes(campusVehicles[i]);
        }

        // Requirement 7: Print vehicles at Library
        System.out.println("\nSTEP 7: VEHICLES AT LIBRARY");

        for (int i = 0; i < campusVehicles.length; i++) {

            if (campusVehicles[i].getLocation().equalsIgnoreCase(
                    CampusVehicleConstants.LIBRARY)) {

                printAttributes(campusVehicles[i]);
            }
        }

        // Requirement 8: Print available vehicles before changes
        System.out.println("\nSTEP 8: AVAILABLE VEHICLES BEFORE CHANGES");

        for (int i = 0; i < campusVehicles.length; i++) {

            if (campusVehicles[i].isAvailable()) {
                printAttributes(campusVehicles[i]);
            }
        }

        // Requirement 9: Set any four vehicle availabilities to false
        campusVehicle1.setAvailable(false);
        campusVehicle3.setAvailable(false);
        campusVehicle5.setAvailable(false);
        campusVehicle7.setAvailable(false);

        System.out.println("\nSTEP 9: FOUR VEHICLES SET TO UNAVAILABLE");

        printAttributes(campusVehicle1);
        printAttributes(campusVehicle3);
        printAttributes(campusVehicle5);
        printAttributes(campusVehicle7);

        // Requirement 10: Print vehicles still available
        System.out.println("\nSTEP 10: AVAILABLE VEHICLES AFTER CHANGES");

        int availableCount = 0;

        for (int i = 0; i < campusVehicles.length; i++) {

            if (campusVehicles[i].isAvailable()) {
                printAttributes(campusVehicles[i]);
                availableCount++;
            }
        }

        System.out.println("Available vehicles: " + availableCount);

        // Requirement 11: Count vehicles located at University Bluffs
        int universityBluffsCount = 0;

        for (int i = 0; i < campusVehicles.length; i++) {

            if (campusVehicles[i].getLocation().equalsIgnoreCase(
                    CampusVehicleConstants.UNIVERSITY_BLUFFS)) {

                universityBluffsCount++;
            }
        }

        System.out.println("\nSTEP 11: UNIVERSITY BLUFFS VEHICLE COUNT");
        System.out.println("Vehicles at University Bluffs: " + universityBluffsCount);

        // Requirement 12: Allocate exactly the required number of references
        CampusVehicle[] universityBluffsVehicles =
                new CampusVehicle[universityBluffsCount];

        // Requirement 13: Copy references to University Bluffs vehicles
        int newIndex = 0;

        for (int i = 0; i < campusVehicles.length; i++) {

            if (campusVehicles[i].getLocation().equalsIgnoreCase(
                    CampusVehicleConstants.UNIVERSITY_BLUFFS)) {

                universityBluffsVehicles[newIndex] = campusVehicles[i];
                newIndex++;
            }
        }

        // Requirement 14: Print array length
        System.out.println("\nSTEP 14: UNIVERSITY BLUFFS ARRAY LENGTH");
        System.out.println("Array length: " + universityBluffsVehicles.length);

        // Requirement 15: Print the four attributes of those vehicles
        System.out.println("\nSTEP 15: UNIVERSITY BLUFFS VEHICLES");

        for (int i = 0; i < universityBluffsVehicles.length; i++) {
            printAttributes(universityBluffsVehicles[i]);
        }

        // Requirement 16: Fill an array of 5 references to initializeVehicle
        CampusVehicle[] initArray =
                new CampusVehicle[CampusVehicleConstants.INIT_ARRAY_SIZE];

        CampusVehicle initializeVehicle = new CampusVehicle();

        Arrays.fill(initArray, initializeVehicle);

        // Requirement 17: Print all attributes of the initialized array
        System.out.println("\nSTEP 17: INITIALIZED ARRAY");

        for (int i = 0; i < initArray.length; i++) {
            printAttributes(initArray[i]);
        }
    }

    // Helper method: Print the four attributes of one vehicle
    public static void printAttributes(CampusVehicle vehicle) {

        System.out.println("ID: " + vehicle.getId());
        System.out.println("Location: " + vehicle.getLocation());
        System.out.println("Available: " + vehicle.isAvailable());
        System.out.println("Color: " + vehicle.getColor());
        System.out.println();
    }
}


package edu.monmouth.campusvehicle;

public class CampusVehicleConstants {

	// Constants used to validate vehicle IDs
    public static final int MIN_ID_LENGTH = 6;
    public static final int MAX_ID_LENGTH = 18;
    public static final String ID_PREFIX = "MU";
    public static final String UNKNOWN_ID = "unknown";

    // Constant used for invalid locations
    public static final String UNKNOWN_LOCATION = "UNKNOWN";

    // Default attribute values
    public static final boolean DEFAULT_AVAILABLE = false;
    public static final Color DEFAULT_COLOR = Color.UNKNOWN;

    // Array sizes
    public static final int NUMBER_OF_VEHICLES = 10;
    public static final int INIT_ARRAY_SIZE = 5;
    
 // Valid locations from Problem Set 2
    public static final String LIBRARY = "Library";
    public static final String UNIVERSITY_BLUFFS = "University Bluffs";
    public static final String PARKING_LOT = "Parking Lot";
    public static final String SPRUCE_HALL = "Spruce Hall";
    public static final String LAUREL_HALL = "Laurel Hall";

    public static final String[] VALID_LOCATIONS = {
        LIBRARY,
        UNIVERSITY_BLUFFS,
        PARKING_LOT,
        SPRUCE_HALL,
        LAUREL_HALL
    };

    // Prevent objects of this constants class from being created
    private CampusVehicleConstants() {
    }
}

package edu.monmouth.campusvehicle;

public class CampusVehicle {
	
	// Attributes 
	
	private String id; 
	private String location; 
	private Color color;
	private boolean available; 
	
	// Default constructor 
	
	public CampusVehicle() { 
		this(null, null, CampusVehicleConstants.DEFAULT_AVAILABLE);
		
	}
	
	// Three- parameter constructor 
	
	public CampusVehicle(String id, String location, boolean available) {
		this(id, location, available, CampusVehicleConstants.DEFAULT_COLOR);
	}
	
	// Four-parameter constructor 
	
	public CampusVehicle(String id, String location, boolean available, Color color) { 
		setId(id);
		setLocation(location);
		setAvailable(available);
		setColor(color);
	}
	
	// ID accessor
    public String getId() {
        return id;
    }

    // ID mutator: check length and the MU prefix
    public void setId(String id) {
        if (id == null
                || id.length() < CampusVehicleConstants.MIN_ID_LENGTH
                || id.length() > CampusVehicleConstants.MAX_ID_LENGTH
                || !id.substring(0, CampusVehicleConstants.ID_PREFIX.length())
                    .equalsIgnoreCase(CampusVehicleConstants.ID_PREFIX)) {

            this.id = CampusVehicleConstants.UNKNOWN_ID;
        } else {
            this.id = id.toLowerCase();
        }
    }

 // Location accessor
    public String getLocation() {
        return location;
    }

    // Location mutator: check the array of valid locations
    public void setLocation(String location) {
        this.location = CampusVehicleConstants.UNKNOWN_LOCATION;

        if (location != null) {
            for (int i = 0; i < CampusVehicleConstants.VALID_LOCATIONS.length; i++) {
                if (location.equalsIgnoreCase(CampusVehicleConstants.VALID_LOCATIONS[i])) {
                    this.location = location.toLowerCase();
                    break;
                }
            }
        }
    }
	
 // Availability accessor
    public boolean isAvailable() {
        return available;
    }

    // Availability mutator
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Color accessor
    public Color getColor() {
        return color;
    }

    // Color mutator
    public void setColor(Color color) {
        if (color == null) {
            this.color = CampusVehicleConstants.DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }
 // Check out only if available
    public void checkOut() {
        if (available) {
            available = false;
        }
    }

    // Keep the old method name from Problem Set 2
    public void checkout() {
        checkOut();
    }

    // Return a vehicle
    public void returnVehicle() {
        available = true;

	}
}

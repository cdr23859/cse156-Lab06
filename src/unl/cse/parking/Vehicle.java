package unl.cse.parking;

public class Vehicle {

	private final String license;	
	
	// The class constructor
	public Vehicle(String license) {
		this.license = license;
	}
	
	/**
	 * The getter method granting public access to reading the
	 * license plate number. Notice license does not have a
	 * setter since it cannot be modified.
	 */
	public String getLicense() {
		return license;
	}
	
}

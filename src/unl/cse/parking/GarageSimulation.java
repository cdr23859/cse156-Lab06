package unl.cse.parking;

public class GarageSimulation {
	public static void main(String[] args) {
		
		Garage safePark = new Garage(10);
		Vehicle herbie = new Vehicle("OFP 857");
		safePark.addVehicle(herbie);
		safePark.addDay();
		safePark.addDay();
		safePark.addDay();
		safePark.displayReport();
	}
}

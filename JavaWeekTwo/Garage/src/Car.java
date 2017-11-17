
public class Car extends Vehicle {

	private boolean ACFitted;
	private int standardCost = 200;
	
	public float calculateGarageCost() {
		
		float finalCost;
		float costMultiplier = 1;
		
		if (getCcRating() > 1800) {
			costMultiplier *= 1.1;
		}
		if (getFuelType().toUpperCase().equals("DIESEL")) {
			costMultiplier *= 1.2;
		}
		
		finalCost = standardCost * costMultiplier;
		
		if (ACFitted) {
			finalCost += 50;
		}
		return finalCost;
	}
	
}

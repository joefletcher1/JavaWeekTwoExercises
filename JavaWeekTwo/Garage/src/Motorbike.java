
public class Motorbike extends Vehicle{
	
	private boolean sideCar;
	private int standardCost = 100;
	
	public float calculateGarageCost() {
		float finalCost;
		float costMultiplier = 1;
		
		if (getCcRating() > 1000) {
			costMultiplier *= 1.1;
		}
		if (getFuelType().toUpperCase().equals("DIESEL")) {
			costMultiplier *= 1.2;
		}
		
		finalCost = standardCost * costMultiplier;
		
		if (sideCar) {
			finalCost += 150;
		}
		return finalCost;
	}

}

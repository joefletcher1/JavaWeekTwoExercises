
public class Bus extends Vehicle{
	
	private int numOfPassengers;
	private int standardCost = 400;
	
	
	public float calculateGarageCost() {
		float finalCost;
		float costMultiplier = 1;
		
		if (getCcRating() > 2200) {
			costMultiplier *= 1.2;
		}
		if (getFuelType().toUpperCase().equals("DIESEL")) {
			costMultiplier *= 1.5;
		}
		
		finalCost = standardCost * costMultiplier;
		
		if (numOfPassengers > 60) {
			finalCost += 250;
		}
		return finalCost;
	}

}

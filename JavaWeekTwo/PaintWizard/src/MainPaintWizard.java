
public class MainPaintWizard {

	public static void main(String[] args) {
		
		//Room room = new Room(10.0, 10.0, 10.0);
		double areaOfRoom = 2996;
		Inventory inventory = new Inventory();
		
		inventory.addToInventory(new Paint("cheapoMax", 20.0, 19.99, 10.0));
		inventory.addToInventory(new Paint("averageJoes", 15, 17.99, 11.0));
		inventory.addToInventory(new Paint("duluxuriousPaints", 10.0, 25.0, 20.0));
		
		inventory.printInventory();
		System.out.println();
		
		Paint leastWaste = inventory.findLeastWastePaint(areaOfRoom);
		
		Paint cheapestPaint = inventory.findCheapestPaint(areaOfRoom);
		
		System.out.println();
		System.out.println("Least Waste: " + leastWaste);
		System.out.println("Cheapest: " + cheapestPaint);
		
	}

}

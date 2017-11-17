import java.util.ArrayList;

public class Inventory {
	
	private ArrayList<Paint> paintSelection;
	
	public Inventory() {
		paintSelection = new ArrayList<Paint>();
	}
	
	public void addToInventory(Paint paint) {
		paintSelection.add(paint);
	}
	
	public void printInventory() {
		for (Paint p : paintSelection) {
			System.out.format("%18s%2s%.2f", p.getName(), "£", p.getPrice());
			System.out.println();
		}
	}
	
	public Paint findLeastWastePaint(double area) {
		Paint q = null;
		double leftovers = 0.0;
		double lastover = 65000;
		int numberOfTins = 0;
		
		for (Paint p : paintSelection) {
			System.out.format("%25s", p);
			
			numberOfTins = (int)Math.ceil(area / (p.getAreaPerLitre() * p.getVolume()));
			
			leftovers = ((numberOfTins * p.getAreaPerLitre() * p.getVolume()) - area) / p.getAreaPerLitre();
			
			p.setTotalCost(numberOfTins * p.getPrice());
			
			System.out.format("%10s%.2f%12s%3d%6s%.2f", " Leftovers: ", Math.round(leftovers * 100.0) / 100.0, "L No. of tins:",
					numberOfTins, " Cost:£", Math.round(p.getTotalCost() * 100.0) / 100.0);
			System.out.println();
			if (leftovers < lastover) {
				q = p;
				lastover = leftovers;
			}
		}
		return q;
	}
	
	public Paint findCheapestPaint(double area) {
		Paint w = null;
		int numberOfTins = 0;
		double cheapest = 65000;
		
		for (Paint p : paintSelection) {
			
			numberOfTins = (int)Math.ceil(area / (p.getAreaPerLitre() * p.getVolume()));
			
			if (p.efficiency() * numberOfTins < cheapest) {
				cheapest = p.efficiency();
				w = p;
			}
		}
		return w;
	}
}

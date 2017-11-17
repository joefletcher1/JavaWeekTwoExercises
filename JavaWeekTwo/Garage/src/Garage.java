import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles;
	
	public Garage() {
		vehicles = new ArrayList<>();
	}
	
	public void addToGarage(Vehicle v) {
		vehicles.add(v);
	}
	
	public void removeFromGarageID(String reg) {
		for (int i = vehicles.size() - 1; i > 0; i--) {
			
			if (vehicles.get(i).getRegestration().equals(reg)) {
				vehicles.remove(i);
			}
		}
	}
	
	public void removeFromGarageType(String type) {
		for (int i = vehicles.size() - 1; i > 0; i--) {
			
			if (vehicles.get(i).getClass().getCanonicalName().equals(type)) {
				vehicles.remove(i);
			}
		}
	}
	
	public void emptyTheGarage() {
		vehicles.clear();
	}
	
	public void printOutGarage() {
		for (Vehicle v : vehicles) {
			System.out.format("%10s%12s%8s%2s%4d", v.getRegestration(), v.getClass().getCanonicalName(), v.getColour(), "£", Math.round((v.calculateGarageCost() * 100.0) / 100.0));
			System.out.println();
		}
	}
	
	public int getNumCarsInGarage() {
		return vehicles.size();
	}
}

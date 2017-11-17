
public class Paint {
	
	private String name;
	private double volume;
	private double price;
	private double areaPerLitre;
	private double totalCost;
	
	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Paint(String name, double volume, double price, double areaPerLitre) {
		this.name = name;
		this.volume = volume;
		this.price = price;
		this.areaPerLitre = areaPerLitre;
	}
	
	public double efficiency() {
		double totalAreaCovered = volume * areaPerLitre;
		return totalAreaCovered / price;
		
	}
	
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAreaPerLitre() {
		return areaPerLitre;
	}
	public void getAreaPerLitre(double areaPerLitre) {
		this.areaPerLitre = areaPerLitre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name = " + name; //+ ", " + 
	}
	
}

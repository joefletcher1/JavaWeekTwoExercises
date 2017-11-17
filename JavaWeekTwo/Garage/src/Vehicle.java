
public abstract class Vehicle {
	
	private int price;
	private int ccRating;
	private String colour;
	private String fuelType;
	//private String vehicleType;
	private String regestration;
	
	public abstract float calculateGarageCost();
	
	public void setPrice(int price) {
		this.price = price;
	}

	public void setCcRating(int ccRating) {
		this.ccRating = ccRating;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

//	public void setVehicleType(String vehicleType) {
//		this.vehicleType = vehicleType;
//	}

	public void setRegestration(String regestration) {
		this.regestration = regestration;
	}

	public String getColour() {
		return colour;
	}
	
	public String getFuelType() {
		return fuelType;
	}
	
//	public String getVehicleType() {
//		return vehicleType;
//	}

	public String getRegestration() {
		return regestration;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getCcRating() {
		return ccRating;
	}
}

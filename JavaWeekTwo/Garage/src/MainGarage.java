
public class MainGarage {

	public static void main(String[] args) {
		
		Garage kwikFit = new Garage();
		
		Vehicle vehicle1 = new Car();
		{
			vehicle1.setCcRating(1900);
			vehicle1.setFuelType("Petrol");
			vehicle1.setRegestration("GNZ5256");
			vehicle1.setColour("Red");
		}
		kwikFit.addToGarage(vehicle1);
		
		Vehicle vehicle2 = new Bus();
		{
			vehicle2.setCcRating(2500);
			vehicle2.setFuelType("Diesel");
			vehicle2.setRegestration("YFC67834");
			vehicle2.setColour("Yellow");
		}
		kwikFit.addToGarage(vehicle2);
		
		Vehicle vehicle3 = new Motorbike();
		{
			vehicle3.setCcRating(900);
			vehicle3.setFuelType("Petrol");
			vehicle3.setRegestration("JCF500");
			vehicle3.setColour("Black");
		}
		kwikFit.addToGarage(vehicle3);
		
		kwikFit.printOutGarage();
		System.out.println();
		
		kwikFit.removeFromGarageID("JCF500");
		kwikFit.printOutGarage();
		System.out.println();
		
		Vehicle vehicle4 = new Bus();
		{
			vehicle4.setCcRating(2000);
			vehicle4.setFuelType("Diesel");
			vehicle4.setRegestration("NOREG");
			vehicle4.setColour("Pink");
		}
		kwikFit.addToGarage(vehicle4);
		kwikFit.printOutGarage();
		System.out.println();
		
		kwikFit.removeFromGarageType("Bus");
		
		kwikFit.printOutGarage();
		System.out.println();
		
		kwikFit.emptyTheGarage();
		System.out.println(kwikFit.getNumCarsInGarage());
	}

}


public class Factoral {
	
	public String checkFactoral(int input) {
		
		double result = input;
		int denominator = 1;
		
		while(result > 1) {
			//i = i + 1;
			denominator++;
			
			//result = result / denominator
			result /= denominator;
		}
		
		if(result == 1) {
			return Integer.toString(denominator) + "!";
		}
		else {
			return "NONE";
		}
	}
	
}

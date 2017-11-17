
public class Doggo {

	public void competition(int input) {
		input--;
		String s = "";
		for(int i = 0; i < 100; i++) {
			
			if(i != input){
				s = Integer.toString(i + 1);
				
				if (i <= 13 && i >= 10) System.out.println((i + 1) + "th");
				
				else {
					if(s.endsWith("1")) System.out.println((i + 1) + "st");
					
					else if(s.endsWith("2")) System.out.println((i + 1) + "nd");
					
					else if (s.endsWith("3")) System.out.println((i + 1) + "rd");
					
					else System.out.println((i + 1) + "th");
				}
			}
		}
	}
}

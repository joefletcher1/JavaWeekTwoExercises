
public class StringManager {
	public String task1(String inputString) {
		char[] newString = new char[2 * inputString.length()];
		
		for (int i = 0; i < inputString.length() * 2; i++) {
			if (i % 2 == 0) {
				newString[i] = inputString.charAt(i / 2);
			}
			else {
				char t = newString[i - 1];
				newString[i] = t;
			}
		}
		return String.valueOf(newString, 0, newString.length);
	}
	
	public String getSandwich(String sandwich) {
		String bread = "bread";
		int startChar = bread.length();
		int endChar = sandwich.lastIndexOf(bread);
		return sandwich.substring(startChar, endChar);
	}
	
	public boolean evenlySpaced(int a, int b, int c) {
		int ab = findDifference(a, b);
		int bc = findDifference(b, c);
		
		if (findDifference(ab, bc) == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	private int findDifference(int a, int b) {
		return Math.abs(a - b);
	}

	public String nTwice(String bigString, int n) {
		String s1 = bigString.substring(0, n);
		String s2 = bigString.substring(bigString.length() - n);
		
		return new StringBuilder(s1).append(s2).toString();
	}
	
	public boolean endsLy(String input) {
		return input.substring(input.length() - 2, input.length()).equals("ly");
	}
	
	public String stringClean(String dirtyString) {
		StringBuilder temp = new StringBuilder(dirtyString);
		for (int i = dirtyString.length() - 2; i >= 0; i--) {
			
			if (dirtyString.charAt(i + 1) == dirtyString.charAt(i)) {
				temp = temp.deleteCharAt(i);
			}
		}
		return temp.toString();
	}
	
	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1){
			return 1;
		}
		return fibonacci(n - 2) + fibonacci(n - 1);
		
	}
	
	public int bunnyEars(int arg) {
		if (arg == 0) {
			return 0;
		}
		return 2 + bunnyEars(arg - 1);
	}

	public void diamondBuilder() {
		//StringBuilder left = new StringBuilder("-------0");
		//StringBuilder right = new StringBuilder("-------");
		
		String dash = "-";
		String zero = "0";
		int e1 = 7;
		int e2 = 7;
		for (int i = 0; i < 8; i++) {
			for (int k = 0; k < 8; k++) {
				if (k >= e1) {
					System.out.print(zero);
				}
				else {
					System.out.print(dash);
				}
			}
			e1--;
			
			for (int k = 0; k < 7; k++) {
				if (k >= i) {
					System.out.print(dash);
				}
				else {
					System.out.print(zero);
				}
			}
			System.out.println();
		}
		e1 = 0;
		e2 = 6;
		for (int i = 0; i < 7; i++) {
			for (int k = 0; k < 8; k++) {
				if (k <= e1) {
					System.out.print(dash);
				}
				else {
					System.out.print(zero);
				}
			}
			e1++;
			
			for (int k = 0; k < 7; k++) {
				if (k >= e2) {
					System.out.print(dash);
				}
				else {
					System.out.print(zero);
				}
			}
			e2--;
			System.out.println();
		}
	}
}

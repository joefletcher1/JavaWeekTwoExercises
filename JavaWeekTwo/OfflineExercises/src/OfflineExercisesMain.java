public class OfflineExercisesMain {

	public static void main(String[] args) {
		
		StringManager manager = new StringManager();
		
		System.out.println(manager.task1("Google"));
		
		System.out.println(manager.getSandwich("breadhamandcheesebread"));
		
		System.out.println(manager.evenlySpaced(2, 4, 6));
		System.out.println(manager.evenlySpaced(2, 3, 6));
		
		System.out.println(manager.nTwice("chocolate", 3));
		System.out.println(manager.nTwice("Hello", 2));
		
		System.out.println(manager.endsLy("Hello"));
		System.out.println(manager.endsLy("Gramatically"));
		
		System.out.println(manager.stringClean("abbbcdd"));
		System.out.println(manager.stringClean("yyzzza"));
		
		System.out.println(manager.fibonacci(0));
		System.out.println(manager.fibonacci(1));
		System.out.println(manager.fibonacci(2));
		System.out.println(manager.fibonacci(3));
		System.out.println(manager.fibonacci(4));
		System.out.println(manager.fibonacci(5));
		
		System.out.println(manager.bunnyEars(12));
		
		manager.diamondBuilder();
		
	}

}

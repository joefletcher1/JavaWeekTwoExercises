
public class MainWorkingWithFiles {
	
	public static void main(String[] args) {
		
		PeopleManager manager = new PeopleManager();
		
		manager.addToPeople(new Person("Joe", "Dogwalker", 24));
		manager.addToPeople(new Person("Dave", "On the bru", 48));
		manager.addToPeople(new Person("Cal", "Serial procrastinator", 30));
		manager.addToPeople(new Person("Tommy", "Gang member", 29));
		manager.addToPeople(new Person("Ian", "Local weirdo", 37));
		
		manager.printAllPeopleAsText();
		
		manager.readTextFileOfPeople();
	}
	
}

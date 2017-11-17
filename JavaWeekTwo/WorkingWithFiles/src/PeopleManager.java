import java.util.ArrayList;

public class PeopleManager {
	
	private ArrayList<Person> people;
	
	public PeopleManager() {
		people = new ArrayList<Person>();
	}
	
	public void addToPeople(Person person) {
		people.add(person);
	}
	
	public void printAllPeopleAsText() {

		PeopleTextFile b = new PeopleTextFile();
		
		b.printPersonListAsText(people);
	}
	
	public void readTextFileOfPeople() {
		PeopleTextFile c = new PeopleTextFile();
		String path = "C:\\Users\\Admin\\JFletcher1\\eclipse-workspace\\WorkingWithFiles\\people.txt";
		
		people = c.readPeopleFromTextFile(path);
		
		for (Person p : people) {
			System.out.println(p.toString());
		}
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PeopleTextFile {

	public void printPersonListAsText(ArrayList<Person> people) {

		final String FILENAME = "C:\\Users\\Admin\\JFletcher1\\eclipse-workspace\\WorkingWithFiles\\people.txt";

		BufferedWriter bw = null;
		FileWriter fw = null;
		StringBuilder build = new StringBuilder();

		for (int i = 0; i < people.size(); i++) {
			build.append(people.get(i).toString() + "\r\n");
		}

		String content = build.toString();

		try {
			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public ArrayList<Person> readPeopleFromTextFile(String p) {

		ArrayList<Person> people = new ArrayList<Person>();
		BufferedReader br = null;
		String[] readIn = {};
		try {
			br = new BufferedReader(new FileReader(p));
			String line = br.readLine();

			while (line != null) {

				readIn = line.split(",");
				for (int i = 0; i < readIn.length; i++) {
					if (i != readIn.length - 1) {
						readIn[i] = readIn[i].substring(readIn[i].indexOf(":") + 2);
					}
					else {
						readIn[i] = readIn[i].substring(readIn[i].indexOf(":") + 1);
					}
					
				}
				
				Person q = new Person(readIn[0], readIn[1], Integer.parseInt(readIn[2]));
				
				people.add(q);
				
				line = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {

			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return people;
	}
}

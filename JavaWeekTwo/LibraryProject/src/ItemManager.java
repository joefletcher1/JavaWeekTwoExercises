import java.util.ArrayList;
import java.util.HashMap;

public class ItemManager {
	
	private ArrayList<Item> allItems;
	private HashMap<User, ArrayList<Item>> checkedOutItems;
	
	public ArrayList<Item> getAllItems() {
		return allItems;
	}
	
	public void setAllItems(ArrayList<Item> allItems) {
		this.allItems = allItems;
	}
	
	public ArrayList<Item> getCheckedOutItems(User user) {
		ArrayList<Item> item = checkedOutItems.get(user);
		return item;
	}
	
	public void setCheckedOutItems(User user, ArrayList<Item> checkedInItems) {
		if (true) {
			//checkedOutItems.put(key, value)
		}
		
	}
	
	
}


import java.util.ArrayList;
import java.util.List;

public abstract class Garden {

	private List<Item> items;	
	
	public Garden() {
		items = new ArrayList<Item>();
	}
	
	public void add(Item item) {
		if (isItemValid(item) && !items.contains(item)) {
			items.add(item);
		}
	}	
	
	public void display() {
		displayType();
		for (Item item : items) {
			System.out.println(item);
		}		
	}
	
	public abstract void displayType();

	public abstract boolean isItemValid(Item item);
	
}

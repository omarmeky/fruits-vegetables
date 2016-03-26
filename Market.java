
import java.util.ArrayList;
import java.util.List;

public class Market {

	private List<Item> inventory;
	
	public Market() {
		inventory = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		inventory.add(item);
	}
	
	public List<Item> getInventory() {
		return inventory;
	}
}

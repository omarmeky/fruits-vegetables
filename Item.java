
public abstract class Item {

	private String name;
	
	public Item(String itemName) {
		this.name = itemName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name;
	}

	public boolean equals(Object i) {
		if (i == null) {
			return false;
		}
		if (!Item.class.isAssignableFrom(i.getClass())) {
			return false;
		}
		final Item other = (Item) i;
		return other.name != null && other.name == this.name;
	}
}

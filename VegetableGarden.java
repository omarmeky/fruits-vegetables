
public class VegetableGarden extends Garden {

	public void displayType() {
		System.out.println("Vegetable Garden");
	}

	public boolean isItemValid(Item item) {
		return (item instanceof Vegetable);			
	}
}

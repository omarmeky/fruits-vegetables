
public class FruitGarden extends Garden {

	public void displayType() {
		System.out.println("Fruit Garden");
	}
	
	public boolean isItemValid(Item item) {
		return (item instanceof Fruit);			
	}	
}


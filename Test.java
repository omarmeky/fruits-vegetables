/*

	2.a: I expect the output to be the correct contents of the fruit and vegetable gardens without duplicates.

	2.b: I see duplicate values in both gardens. Also, both gardens have both fruits and vegetables.

	2.c: isItemValid should be abstract in the parent class and implemented in the inheriting classes
			Default Object equality should be overridden in the Item class for "contains" to work

 */

public class Test {

	public static void main(String[] args) {
		
		// -- Add Vegetables and Fruits to the market inventory
		Market market = new Market();	
		
		market.addItem(new Vegetable("Onion"));
		market.addItem(new Vegetable("Potato"));
		market.addItem(new Vegetable("Potato"));
		market.addItem(new Vegetable("Okra"));
		market.addItem(new Vegetable("Spinach"));		
	
		market.addItem(new Fruit("Apple"));
		market.addItem(new Fruit("Pineapple"));
		market.addItem(new Fruit("Plum"));
		market.addItem(new Fruit("Apricot"));
		market.addItem(new Fruit("Orange"));
		
		// -- Create the vegetable and fruit gardens
		Garden vegGarden = new VegetableGarden();
		for (Item item : market.getInventory())
			vegGarden.add(item);
		
		Garden fruitGarden = new FruitGarden();
		for (Item item : market.getInventory())
			fruitGarden.add(item);
		
		// -- Display the contents of the gardens		
		vegGarden.display();
		System.out.println();
		fruitGarden.display();
	}
	
}

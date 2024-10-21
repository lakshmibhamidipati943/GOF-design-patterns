package adapter;

public class Main {

	public static void main(String[] args) {
		SwiggyStore swiggyStore=new SwiggyStore();
		SwiggyStore.addItems(new FoodItem());
		SwiggyStore.addItems(new FoodItem());
		SwiggyStore.addItems(new GroceryItemAdapter(new GroceryProduct()));
	}
}

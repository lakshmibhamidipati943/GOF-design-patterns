package adapter;

public class GroceryItemAdapter implements Item{

	private GroceryItem item;
	public GroceryItemAdapter(GroceryItem item) {
		this.item=item;
	}
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return item.getName();
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return item.getPrice();
	}

	@Override
	public String getRestaurantName() {
		// TODO Auto-generated method stub
		return item.getStoreName();
	}

}

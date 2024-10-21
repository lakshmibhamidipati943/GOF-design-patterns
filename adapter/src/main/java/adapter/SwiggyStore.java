package adapter;

import java.util.ArrayList;

import java.util.List;

public class SwiggyStore {

	static List<Item> items=new ArrayList<>();
	public static void addItems(Item item) {
		items.add(item);
	}
}

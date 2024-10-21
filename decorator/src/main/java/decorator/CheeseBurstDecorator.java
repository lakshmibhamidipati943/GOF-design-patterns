package decorator;

public class CheeseBurstDecorator extends PizzaDecorator{

	public CheeseBurstDecorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	public String bake() {
		return pizza.bake()+addCheese();
	}
	public String addCheese() {
		return "Cheese";
	}
}

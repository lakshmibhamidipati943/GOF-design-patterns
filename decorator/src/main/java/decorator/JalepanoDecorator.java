package decorator;

public class JalepanoDecorator extends PizzaDecorator{

	public JalepanoDecorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	public String bake() {
		return pizza.bake()+addJalepano();
	}
	public String addJalepano() {
		return "jalepeno";
	}

}

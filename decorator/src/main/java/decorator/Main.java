package decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza=new JalepanoDecorator(new CheeseBurstDecorator(new BasePizza()));
		System.out.println(pizza.bake());
	}

}

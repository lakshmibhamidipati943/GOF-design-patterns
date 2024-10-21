package builder;

public class Main {

	public static void main(String[] args) {
		Burger burger=new Burger.BurgerBuilder()
				.mayonese(true)
				.onion(false)
				.egg(false)
				.extraCheese(true)
				.size("Large")
				.build();
		Meal meal=new MealDirector(new VegMealBuilder()).prepareMeal();
	}
}

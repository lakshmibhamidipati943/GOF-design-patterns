package builder;

public class NonVegMealBuilder extends MealBuilder{

	private Meal meal;
	public NonVegMealBuilder() {
		meal=new Meal();
	}
	@Override
	public void addBiryani() {
		// TODO Auto-generated method stub
		this.meal.setBiryani("Chicken");
	}

	@Override
	public void addBread() {
		// TODO Auto-generated method stub
		this.meal.setBread("Roti");
	}

	@Override
	public void addColdDrink() {
		// TODO Auto-generated method stub
		this.meal.setColdDrink("Sprite");
	}

	@Override
	public void addCurry() {
		// TODO Auto-generated method stub
		this.meal.setCurry("Non-Veg");
	}

	@Override
	public Meal build() {
		// TODO Auto-generated method stub
		return meal;
	}

}

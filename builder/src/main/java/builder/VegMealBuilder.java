package builder;

public class VegMealBuilder extends MealBuilder{

	private Meal meal;
	public VegMealBuilder() {
		meal=new Meal();
	}
	@Override
	public void addBiryani() {
		// TODO Auto-generated method stub
		this.meal.setBiryani("Veg");
	}

	@Override
	public void addBread() {
		// TODO Auto-generated method stub
		this.meal.setBread("Naan");
	}

	@Override
	public void addColdDrink() {
		// TODO Auto-generated method stub
		this.meal.setColdDrink("sprite");
	}

	@Override
	public void addCurry() {
		// TODO Auto-generated method stub
		this.meal.setCurry("Veg");
	}

	@Override
	public Meal build() {
		// TODO Auto-generated method stub
		return meal;
	}

}

package builder;

public class MealDirector {

	private MealBuilder mealBuilder;
	public MealDirector(MealBuilder mealBuilder) {
		this.mealBuilder=mealBuilder;
	}
	public Meal prepareMeal() {
		mealBuilder.addBiryani();
		mealBuilder.addBread();
		mealBuilder.addColdDrink();
		mealBuilder.addCurry();
		return mealBuilder.build();
	}
}

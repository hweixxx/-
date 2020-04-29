public class SubMealBuilderB extends MealBuilder implements BFoodAndDrink{

    public void buildFood(){
    	meal.setFood(chicken_roll.getFood());
    }

    public void buildDrink(){
    	meal.setDrink(fruit_juice.getDrink());
    }

}

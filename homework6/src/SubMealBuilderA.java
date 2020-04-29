public class SubMealBuilderA extends MealBuilder implements AFoodAndDrink{

    public void buildFood(){
    	meal.setFood(chicken_leg_fort.getFood());
    }

    public void buildDrink(){
    	meal.setDrink(cola.getDrink());
    }

}

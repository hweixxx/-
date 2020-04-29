public class MealBuilder {
    protected Meal meal;
    public MealBuilder() {
    	meal = new Meal();
    }
    public void buildFood(){
    }

    public void buildDrink(){
    }

    public Meal getMeal(){
        return meal;
    }

}

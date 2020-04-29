package Decorator_Pattern;

public class Cream extends Decorating {

    public void PutCream(){
    	System.out.println("Add Cream......");
    }

    public void Show(){
    	System.out.println("Cake Blank");
    }

    public Cream(IBirthdayCake birthdayCake){
    	super(birthdayCake);
    }

}

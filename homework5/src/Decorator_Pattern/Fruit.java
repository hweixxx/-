package Decorator_Pattern;

public class Fruit extends Decorating {

    public void PutFruit(){
        System.out.println("Add Fruit......");
    }

    public void Show(){
    	System.out.println("Cake Blank");
    }

    public Fruit(IBirthdayCake birthdayCake){
    	super(birthdayCake);
    }

}

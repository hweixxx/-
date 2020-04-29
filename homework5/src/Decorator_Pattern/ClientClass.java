package Decorator_Pattern;

public class ClientClass {
	//в╟йндёй╫
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBirthdayCake birthdayCake = new Cake();
		birthdayCake.Show();
		Cream cream = new Cream(birthdayCake);
		cream.PutCream();
		cream.Show();
		Fruit fruit = new Fruit(cream);
		fruit.PutFruit();
		fruit.Show();
	}

}

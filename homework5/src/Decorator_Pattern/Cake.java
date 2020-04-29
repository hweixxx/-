package Decorator_Pattern;

public class Cake implements IBirthdayCake {

	public Cake() {
		System.out.print("Cake blank was Created!\n");
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("Cake Blank");
	}

}

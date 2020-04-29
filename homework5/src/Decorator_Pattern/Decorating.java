package Decorator_Pattern;

public class Decorating implements IBirthdayCake {

	private IBirthdayCake birthdayCake;

	public Decorating(IBirthdayCake birthdayCake) {
		this.birthdayCake = birthdayCake;
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		birthdayCake.Show();
	}

}

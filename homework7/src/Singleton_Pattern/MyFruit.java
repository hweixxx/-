package Singleton_Pattern;

public class MyFruit implements Cloneable {
	protected String kind;

	public void Display() {
		System.out.print(kind + "\n");
	}

	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}

package Simple_factory;

public class ClientClass {
	// �򵥹���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new Factory();
		Fruit fruit = factory.CreateFruit("B");
		fruit.eat();
	}
//	public String factory(String fruitname) {
//		if (fruitname.equals("A"))
//			return "Apple";
//		if (fruitname.equals("B"))
//			return "Banana";
//		return null;
//	}

}

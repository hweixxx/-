package Factory_method_pattern;

public class ClientClass {
	//��������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new BFactory();
		Fruit fruit = factory.CreateFruit();
		fruit.eat();
//		Factory factory = (Factory)XMLUtil.getBean();
//		Fruit fruit = factory.CreateFruit();
//		fruit.eat();
	}

}

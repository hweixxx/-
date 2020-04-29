package Simple_factory;

public class Factory {

	// 构造一个水果工厂
	public Fruit CreateFruit(String kind) {
		if (kind.equals("A"))
			return new Apple();
		if (kind.equals("B"))
			return new Banana();
		return null;
	}

}

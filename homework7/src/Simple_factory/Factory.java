package Simple_factory;

public class Factory {

	// ����һ��ˮ������
	public Fruit CreateFruit(String kind) {
		if (kind.equals("A"))
			return new Apple();
		if (kind.equals("B"))
			return new Banana();
		return null;
	}

}

package Adapter_Pattern;

public class Adapter extends OldJuicer implements InewJuicer {
//  类继承关系
//	public String newPort(MyFruit fruit1, MyFruit fruit2) {
//		String str = "混合果汁" + onePort(fruit1);
//		str += onePort(fruit2);
//		return str;
//	}
	//对象关系
	private OldJuicer oldJuicer;
	public String newPort(MyFruit fruit1, MyFruit fruit2) {
		oldJuicer = new OldJuicer();
		String str = "混合果汁" + oldJuicer.onePort(fruit1);
		str += oldJuicer.onePort(fruit2);
		return str;
	}
}

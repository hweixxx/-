package Adapter_Pattern;

public class Adapter extends OldJuicer implements InewJuicer {
//  ��̳й�ϵ
//	public String newPort(MyFruit fruit1, MyFruit fruit2) {
//		String str = "��Ϲ�֭" + onePort(fruit1);
//		str += onePort(fruit2);
//		return str;
//	}
	//�����ϵ
	private OldJuicer oldJuicer;
	public String newPort(MyFruit fruit1, MyFruit fruit2) {
		oldJuicer = new OldJuicer();
		String str = "��Ϲ�֭" + oldJuicer.onePort(fruit1);
		str += oldJuicer.onePort(fruit2);
		return str;
	}
}

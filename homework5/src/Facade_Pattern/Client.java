package Facade_Pattern;

public class Client {
	// ���ģʽ
	public static void main(String args[]) {
		GeneralSwitchFacade gsf = new GeneralSwitchFacade();
		gsf.on();
		System.out.println("-------------");
		gsf.off();
	}
}

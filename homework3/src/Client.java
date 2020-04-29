
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MixMyFruit mmf = (MixMyFruit) XMLUtil.getBean();
		Adapter adapter = new Adapter();
		adapter.setMixFruit(mmf);
		MyFruit myfruit = adapter.construct();
		System.out.println(adapter.newPort(myfruit.getFruit1(), myfruit.getFruit2()));
	}

}

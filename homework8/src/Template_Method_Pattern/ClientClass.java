package Template_Method_Pattern;

public class ClientClass {
	//模板方法模式
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADefiniteIntegral[] x = new ADefiniteIntegral[2];
		x[0] = new DefIntegralXX(0, 20, 1000);
		x[1] = new DefIntegralLn(2.71, 20, 1000);
		for (int i = 0; i < 2; i++) {
			System.out.println(x[i].CalDefiniteIntegral());
		}
	}

}

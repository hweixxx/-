package Interpreter_Pattern;

public class Client {
	// ������ģʽ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression isMale = getMalExpression();
		Expression isMarriedWoman = getMarriedWoman();

		System.out.println("John is male?" + isMale.interpret("John"));
		System.out.println("Julie is a married woman?" + isMarriedWoman.interpret("Married Julie"));
	}

	// ����:Julie ��һ���ѻ��Ů��
	private static Expression getMarriedWoman() {
		// TODO Auto-generated method stub
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	// ����:Robert��John������
	public static Expression getMalExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

}

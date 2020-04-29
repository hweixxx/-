package Bridge_Pattern;

public class Client {
	//桥接模式
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color color;
		Pen pen;
		
		color = (Color)XMLUtilPen.getBean("color");
		pen = (Pen)XMLUtilPen.getBean("pen");
		
		pen.setColor(color);
		pen.draw("鲜花");;
	}

}

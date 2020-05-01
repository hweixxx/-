package Visitor_Pattern;

import Factory_method_pattern.XMLUtil;

public class Client {
	//访问者模式
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProduct b1 = new Book();
		IProduct b2 = new Book();
		IProduct a1 = new Apple();
		AVisitor visitor;
		
		BuyBasket basket = new BuyBasket();
		basket.addProduct(b1);
		basket.addProduct(b2);
		basket.addProduct(a1);
		
		visitor = (AVisitor)VisitorXMLUtil.getBean();
		
		visitor.setName("张三");
		basket.accept(visitor);
	}

}

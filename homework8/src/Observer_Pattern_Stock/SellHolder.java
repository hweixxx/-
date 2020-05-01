package Observer_Pattern_Stock;

import java.util.ArrayList;
import java.util.List;

public class SellHolder implements IStockHolder{
	private List<AStockPrice>attentionlist;
	private String name;
	public SellHolder(String name) {
		attentionlist = new ArrayList<AStockPrice>();
		this.name = name;
	}
	@Override
	public void update(AStockPrice asp) {
		// TODO Auto-generated method stub
		if(attentionlist.contains(asp)) {
			System.out.println(name);
			
			if(asp.getPrice() - asp.getPrice2()>0) {
				System.out.print(asp.code+":");
				System.out.print("原价:"+asp.price2+"-现价:"+asp.price);
				System.out.println("涨了，哭！");
			}else {
				System.out.print(asp.code+":");
				System.out.print("原价:"+asp.price2+"-现价:"+asp.price);
				System.out.println("跌了，爽！");
			}
		}
	}
	@Override
	public void AddHolder(AStockPrice asp) {
		// TODO Auto-generated method stub
		attentionlist.add(asp);
		asp.Add(this);
	}
}

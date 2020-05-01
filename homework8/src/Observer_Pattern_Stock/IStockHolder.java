package Observer_Pattern_Stock;

public interface IStockHolder {
	public void update(AStockPrice asp);
	public void AddHolder(AStockPrice asp);
}

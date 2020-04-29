public class equipment implements Cloneable{
	protected String kind;
    public void Display(){
    	System.out.println("玩家获得了装备："+kind);
    }
    public Object clone(){
        Object obj = null;
        try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return obj;
    }
}

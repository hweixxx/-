public class Adapter extends OldJuicer implements NewJuicer {
    private MixMyFruit mf;

    public String newPort(String fruit1, String fruit2){
        String str = "��Ϲ�֭��"+onePort(fruit1);
        str+=onePort(fruit2)+"֭";
        return str;
    }

    public void setMixFruit(MixMyFruit mf){
    	this.mf = mf;
    }
    
    public MyFruit construct() {
    	mf.buildFruit1();
    	mf.buildFruit2();
    	return mf.getMyFruit();
    }
}

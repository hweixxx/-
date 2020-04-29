public class Adapter extends OldJuicer implements NewJuicer {
    private MixMyFruit mf;

    public String newPort(String fruit1, String fruit2){
        String str = "»ìºÏ¹ûÖ­£º"+onePort(fruit1);
        str+=onePort(fruit2)+"Ö­";
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

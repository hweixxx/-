package Observer_Pattern;

public class ConcreteSubjectB extends SubjectS {

	public void notifyObserver(){
    	System.out.println("BĿ�귢���ı���");
    	for(ObserverO obs:observers) {
    		obs.response();
    	}
    }

	public ConcreteSubjectB() {
		super();
	}

}

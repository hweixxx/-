package Observer_Pattern;

public class ConcreteSubjectA extends SubjectS {

    public void notifyObserver(){
    	System.out.println("AĿ�귢���ı���");
    	for(ObserverO obs:observers) {
    		obs.response();
    	}
    }

	public ConcreteSubjectA() {
		super();
	}

}

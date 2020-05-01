package Observer_Pattern;

public class ConcreteSubjectB extends SubjectS {

	public void notifyObserver(){
    	System.out.println("B目标发生改变了");
    	for(ObserverO obs:observers) {
    		obs.response();
    	}
    }

	public ConcreteSubjectB() {
		super();
	}

}

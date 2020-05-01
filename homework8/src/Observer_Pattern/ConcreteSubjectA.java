package Observer_Pattern;

public class ConcreteSubjectA extends SubjectS {

    public void notifyObserver(){
    	System.out.println("A目标发生改变了");
    	for(ObserverO obs:observers) {
    		obs.response();
    	}
    }

	public ConcreteSubjectA() {
		super();
	}

}

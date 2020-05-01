package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectS {
    protected List<ObserverO> observers;

    public SubjectS() {
		observers = new ArrayList<ObserverO>();
	}

	public void add(ObserverO observer){
		observers.add(observer);
    }

    public void remove(ObserverO observer){
    	observers.remove(observer);
    }

    public abstract void notifyObserver();

}

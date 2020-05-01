package Observer_Pattern;

public class ClientClass {
	//观察者模式
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubjectS subject = new ConcreteSubjectB();
		ObserverO obs1 = new ConcreteObserver1();
		ObserverO obs2 = new ConcreteObserver2();
		subject.add(obs1);
		subject.add(obs2);
		subject.notifyObserver();
	}

}

package nick.observer;

public class ObserverImpl implements Observer {

	@Override
	public void read(String str) {
		System.out.println(str);
	}

}

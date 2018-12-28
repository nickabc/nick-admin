package nick.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverableImpl implements Observerable {
	
	List<Observer> list = new ArrayList<>();
	static String message = "123";
	
	@Override
	public void addObserver(Observer ob) {
		list.add(ob);
		
	}

	@Override
	public void deleteObserver(Observer ob) {
		list.remove(ob);
		
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : list) {
			observer.read(message);
		}
		
	}
	
	public void sendInformation(String str){
		this.message = str;
		notifyObserver();
	}
	
	public static void main(String[] args) {
		ObserverableImpl impl = new ObserverableImpl();
		impl.addObserver(new ObserverImpl());
		impl.sendInformation("abc");
		System.out.println(message);
	}



}

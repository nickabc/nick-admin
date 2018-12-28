package nick.observer;

//被观察的接口
public interface Observerable {

	void addObserver(Observer ob);
	void deleteObserver(Observer ob);
	void notifyObserver();
}

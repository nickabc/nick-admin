
public class Son extends Father {

	static{
		System.out.println("son");
	}
	
	static int b = 2;
	
	static final int c = 3;
	
	@Override
	void eat() {
		System.out.println("吃肉");
	}



}

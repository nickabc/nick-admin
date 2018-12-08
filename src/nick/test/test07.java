package nick.test;
//单列模式
public class test07 {

	private test07(){};//构造方法私有化，不能被实例
//	大对象，存在线程安全问题
//	private static test07 test;
//	public static test07 getInstance(){
//	if(test==null){
//	test = new test07();}
//		return test;
//	}
	
	//小对象，经常用
//	private static test07 test = new test07();
//	public static test07 getInstance(){
//		return test;
//	}
	//大对象，经常用
	private static class Inner{
		private static test07 test = new test07();
	}
	public static test07 getInstance(){
		return Inner.test;
	}
	
	//大对象，很少用
//    private static test07 test ;
//	private static synchronized test07 getInstance(){
//		if(test==null){
//			test= new test07();
//		}
//		return test;
//	}
	
	//大对象，很少用
//	private static  test07 test;
//	public static test07 getInstance(){
//		if(test==null){
//		synchronized(test07.class){
//			if(test==null){
//				test = new test07();
//			}
//				
//		}
//		}
//		return test;
//	}
}

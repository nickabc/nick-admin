package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
	
	public static void main(String[] args) {
		//创建第一个线程
		Thread thread1 = new Thread(){
			@Override
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println(Thread.currentThread().getName()+i);
				}
			}
		};
		thread1.setName("线程1");
		
		//创建第二个线程
		Runnable ra = new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10;i++){
					if(i==4){
						try {
							thread1.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName()+i);
				}
			}
		};
		Thread thread2 = new Thread(ra,"线程2");
		
		//执行线程
		thread1.start();
		thread2.start();
		
		
		

	}

}

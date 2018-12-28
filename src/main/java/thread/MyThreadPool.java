package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {

	public static void main(String[] args) {
		//创建线程池对象
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		//创建多个任务
		for (int i = 0; i < 6; i++) {
			Runnable ra = new Runnable(){
				@Override
				public void run() {
					for (int j = 0; j < 10; j++) {
						System.out.println(Thread.currentThread().getName()+j);
					}
				}
				
			};
			
			service.execute(ra);
		}
	}
}

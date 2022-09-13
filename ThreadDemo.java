package thread;

class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 1; i<=50; i++) {
			System.out.println(Thread.currentThread().getName() +" : "+i);
		}
		
	}
	
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
	
		for(int i = 1; i<=50; i++) {
			System.out.println(Thread.currentThread().getName() +" : "+i);
		}
	
	}
	
}


public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.setName("Class");
		t1.start();
		
		MyRunnable runnable = new MyRunnable();
		
		Thread t2 = new Thread(runnable);
		t2.setName("Interface");
		t2.start();
		
		
		for(int i = 1; i<=50; i++) {
			System.out.println(Thread.currentThread().getName() +" : "+i);
		}
	
	}

	
	
}

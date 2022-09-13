package thread;

class Table{
	
	// by using synchronized method
	/*
	 * synchronized void printTable(int n) { for(int i = 1; i<=10; i++) {
	 * System.out.println(Thread.currentThread().getName() +" : "+(i*n)); try {
	 * Thread.sleep(500); } catch (InterruptedException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } } }
	 */
	
	// by using synchronized block 
	void printTable(int n) {
		synchronized (this) {
			for(int i = 1; i<=10; i++) {
				System.out.println(Thread.currentThread().getName() +" : "+(i*n));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}

class Thread1 extends Thread{
	
	Table t;
	
	Thread1(Table t){
		this.t = t;
	}
	
	@Override
	public void run() {
		t.printTable(7);
	}
}

class Thread2 extends Thread{
	
	Table t;
	
	Thread2(Table t){
		this.t = t;
	}
	
	@Override
	public void run() {
		t.printTable(9);
	}
}

public class ThreadSample {

	public static void main(String[] args) {
		
		Table table = new Table();
		Thread1 t1 = new Thread1(table);
		Thread2 t2 = new Thread2(table);
		//t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
	
}

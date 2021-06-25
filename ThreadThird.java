
public class ThreadThird implements Runnable{
	public void run() {
		System.out.println("starting Thread" + Thread.currentThread().getName());
		for(int i=0; i<10; i++) {
			System.out.println("\t\tTortoise is crawling");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("completed Thread" + Thread.currentThread().getName());
	}
	

}

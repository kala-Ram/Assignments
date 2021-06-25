
public class ThreadFour implements Runnable {
	public void Run() {
		System.out.println("starting Thread" + Thread.currentThread().getName());
		for(int i=0; i<10; i++) {
			System.out.println("\t\t\tkangaroo is jumping");
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

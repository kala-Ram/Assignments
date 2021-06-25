
public class ThreadSec implements Runnable {
      public void run() {
    	  System.out.println("starting Thread" + Thread.currentThread().getName());
    	  for(int i=0; i<10; i++) {
  			System.out.println("\trabbit is Running");
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

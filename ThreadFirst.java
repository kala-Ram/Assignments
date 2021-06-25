
public class ThreadFirst  {
	public static void main(String args[])throws InterruptedException{
		new Thread((java.lang.Runnable) new ThreadSec(),"Rabbit is running").start();
		new Thread((java.lang.Runnable) new ThreadSec(),"tortoise is Crawling").start();
		new Thread((java.lang.Runnable) new ThreadSec(),"kangaroo is jumping").start();
		}
	}
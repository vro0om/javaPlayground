package threads;

public class TRunnable implements Runnable {

	
	private Object lock;

	public TRunnable(Object lock) {
		this.lock = lock;
		
	}

	/**
	 * Program order rule
	 * Lock happens before every subsequent unlock
	 * Volatile Variable rule : write happens before ever subsequent read
	 * Call to Thread.start happens before it is detected as terminated
	 *  
	 */
	@Override
	public void run() {
		long t = System.currentTimeMillis();
//		while(t-System.currentTimeMillis()>10000)
		{
			//busy spin
		}
		
	}

}

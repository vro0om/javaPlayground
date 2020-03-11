package prodCom;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class ProducerQ implements Runnable
{
	
	private BlockingQueue<Integer> q;

	public ProducerQ(BlockingQueue<Integer> q)
	{
		this.q = q;
	}

	@Override
	public void run()
	{
			
	}
	
}

public class BlockingQ
{
	public static void main(String[] args)
	{
		BlockingQueue<Integer> q =  new ArrayBlockingQueue<Integer>(5);
		new Thread(new ProducerQ(q),"Producer").start();
	}
}

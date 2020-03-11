package prodCom;

class Q
{
	private int num;
	boolean valueSet=false;
	int last=-1;
	public synchronized void get() throws InterruptedException
	{
		while(!valueSet)
		{
			wait();
		}
		if (num%10000==0 )
		{
			
			System.out.println("Get : " + num);
		}
		if (last+1!=num)
		{
			System.out.println("FAIL : " + num);
		}
		last=num;
		valueSet =false;
		notify();
	}

	public synchronized void put(int num) throws InterruptedException
	{
		while(valueSet)
		{
			wait();
		}
		if (num%10000==0)
		{
			System.out.println("Put : " + num);
		}
		
		this.num = num;
		valueSet =true;
		notify();
	}

}

class Producer implements Runnable
{

	private Q q;

	public Producer(Q q)
	{
		this.q = q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run()
	{
		int i = 0;
		while (true)
		{

			try
			{
				q.put(i++);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}
}

class Consumer implements Runnable
{

	private Q q;

	public Consumer(Q q)
	{
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run()
	{
		int i = 0;
		while (true)
		{

			try
			{
				q.get();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}
}

public class InterThread
{
	public static void main(String[] args)
	{
		Q q = new Q();
		Producer p = new Producer(q);
		new  Consumer(q);
	}
}

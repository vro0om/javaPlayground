package threads;

public class Player {
	private static Object lock;

	public static void main(String[] args) {
		for (int i = 0; i < 15000; i++) {
			
		Thread t = new Thread(new TRunnable(lock));
		long startT = System.currentTimeMillis();
		t.start();
		
//		do{
//			
//			System.out.println("Alive");
//		}while( t.isAlive() );
		System.out.println( i+" Dead  " + t.isAlive());
		}
	}
}

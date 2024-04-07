package multithrad;

public class Priority_methods extends Thread{
	@Override
	public void run() {
		System.out.println("child thread");
		System.out.println("priority "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Priority_methods obj=new Priority_methods();
		System.out.println("main thread");
		
		System.out.println("old priority "+Thread.currentThread().getPriority());
		//use any one of four
		//Thread.currentThread().setPriority(9);
		//Thread.currentThread().setPriority(MIN_PRIORITY);
		Thread.currentThread().setPriority(MAX_PRIORITY);
		//Thread.currentThread().setPriority(NORM_PRIORITY);
		System.out.println("new priority "+Thread.currentThread().getPriority());
		
		obj.start();
	}

}

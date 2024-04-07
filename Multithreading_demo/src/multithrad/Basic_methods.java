package multithrad;

public class Basic_methods extends Thread {
   @Override
   public void run() {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("task one");
	
   }

	public static void main(String[] args) {
		Basic_methods A=new Basic_methods();
		A.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		
		System.out.println(A.isAlive());

	}

}

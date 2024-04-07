package multithrad;

public class Daemon_Thread_methods extends Thread{
	
	
	public void run() {
		System.out.println("run method");
		if(Thread.currentThread().isDaemon())
		{
		System.out.println("Daemon thread");
		}
		else
		{
			System.out.println("not Daemon");
		}
	
	}

	public static void main(String[] args) {
		
		
		Daemon_Thread_methods obj=new Daemon_Thread_methods();
		obj.setDaemon(true);
		//we have to create deamon thread before start
		//if create after provide exception(runtime exception-illegal thread state exception)
		obj.start();
		
		
		//System.out.println("pranav");
		//deamon thread will run to provide service to main thread 
		//it will give output if  we do something in main thread
		//like printing something-uncooment and try

	}
}

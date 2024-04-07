package multithrad;

import java.util.Iterator;

public class join_method_2 extends Thread{
	static Thread mainThread;
	//using main thread reference
	public void run() 
	{
		
		try {
			
			for (int i=0;i<5;i++) 
			{
				mainThread.join();
				System.out.println(i+" child thread");
				Thread.sleep(1000);
			}
			
		}
		catch (Exception e) {
			
		}
	}

	public static void main(String[] args) 
	{
			  mainThread = Thread.currentThread();
				//main thread reference
			
			join_method_2 obj=new join_method_2();
			obj.start();
				
			try {
				
				for (int i=0;i<5;i++) 
				{
					System.out.println(i+" main thread");
					Thread.sleep(1000);
				}
				
			}
			catch (Exception e) {
				
			}
			
		
	}
}
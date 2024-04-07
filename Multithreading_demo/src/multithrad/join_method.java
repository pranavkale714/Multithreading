package multithrad;
public class join_method extends Thread 
{
	public void run() 
	{
		try {
				for(int i=0;i<5;i++)
				{
			
					Thread.sleep(1000);
					System.out.print("inside class- ");
					System.out.println(i+" "+Thread.currentThread().getName());
				} 
		}
	      catch (InterruptedException e) {
			
		}
			
			
		}
	public static void main(String[] args) {
		join_method obj=new join_method();
		obj.start();
		
		try {
			obj.join();
			
		} catch (InterruptedException e)
		{
		
		}
		
		try {
			for(int i=0;i<5;i++)
			{
		
				Thread.sleep(1000);
				System.out.print("inside main- ");
				System.out.println(i+" "+Thread.currentThread().getName());
			} 
	}
      catch (InterruptedException e) {
		
	}
		
		
		
	}
}



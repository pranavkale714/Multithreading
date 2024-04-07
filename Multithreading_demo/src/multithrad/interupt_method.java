package multithrad;



public class interupt_method extends Thread{
	
	public void run() 
	{
		
		try {
			
			for (int i=0;i<5;i++) 
			{
				System.out.println(i+"  thread");
				Thread.sleep(1000);
			}
			
		}
		catch (Exception e) {
			System.out.println("thread interrupted"+ e);
			
		}
	}

	public static void main(String[] args) 
	{
			 
			
			interupt_method obj=new interupt_method();
			obj.start();
			obj.interrupt();
			
	}
}

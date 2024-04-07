package multithrad;

public class yield_method_demo extends Thread{
	@Override
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"inside run");
			Thread.yield();
		}
		
	}

	public static void main(String[] args) {
       yield_method_demo obj=new yield_method_demo();
       obj.start();
      
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"inside main");
			
			
		}
	}

}

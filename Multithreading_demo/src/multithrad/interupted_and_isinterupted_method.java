package multithrad;

public class interupted_and_isinterupted_method extends Thread {

	
	public void run() {
try {
			//System.out.println(Thread.currentThread().isInterrupted());
			
			System.out.println(Thread.interrupted());//true-false
			//thread was interupted //but interrupted method change value from true to false
			//and normal execution is done
			//it does not go in catch block
			
			//if u do not interupt method both method will return false
		    
			for (int i=0;i<5;i++) 
			{
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println(Thread.interrupted());
				//it will return false because interrupted method change result
			}
			
		}
		catch (Exception e) {
			System.out.println("this line");
			System.out.println("thread interrupted"+ e);
			
		}
	}
	public static void main(String[] args) {
	
		interupted_and_isinterupted_method obj=new interupted_and_isinterupted_method();
		obj.start();
		obj.interrupt();
	}

}

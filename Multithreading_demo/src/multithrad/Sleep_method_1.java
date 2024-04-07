package multithrad;

public class Sleep_method_1 {

	public static void main(String[] args) throws InterruptedException {
	  for(int i=0;i<7;i++)
	  {
		  System.out.println(i);
		  Thread.sleep(1000);
		  //main thread sleep for 1 second
	  }

	}

}

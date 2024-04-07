package multithrad;
public class Using_Thread_class extends Thread{
	//1.extends thread class
	
	@Override
	public void run()
	//2.override run method
	{
	System.out.println("hi");
	System.out.println("pranav");
	//3.Thrad task
	}
	public static void main(String[] args) {
		
		Using_Thread_class obj=new Using_Thread_class();
		//4.creating object of class
		obj.start();
		//5.start the thrad(we are not calling run method,run method will call by start internally)
		

	}

}

package multithrad;

public class Naming_methods {

	public static void main(String[] args) {
		System.out.println("hi");
		System.out.println(Thread.currentThread().getName());
		
		//set name for thread
		Thread.currentThread().setName("pranav");
		System.out.println(Thread.currentThread().getName());
		
		
		//System.out.println(10/0);
		//the above the will give error
        //it will print "Exception in thread "pranav"
		//instead of main thread 
		//cause we change name of main thread
	}
}

package multithrad;

public class Using_runnable_interface implements Runnable{
	@Override
	public void run() {
		System.out.println("hi");
		
	}
	public static void main(String[] args) {
		
	Using_runnable_interface obj=new Using_runnable_interface();
	Thread a=new Thread(obj);
	a.start();
	}
}

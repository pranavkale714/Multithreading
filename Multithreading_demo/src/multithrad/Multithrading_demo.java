package multithrad;

public class Multithrading_demo extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread1");
	}

	public static void main(String[] args) {
		Multithrading_demo obj=new Multithrading_demo();
		obj.start();
		Multithrading_demo2 obj2=new Multithrading_demo2();
		obj2.start();
	}

}

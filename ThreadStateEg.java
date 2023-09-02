class MyThread extends Thread
{
	public MyThread (String name)
	{
		super(name);
		setPriority(Thread.MAX_PRIORITY);
	}
}

public class ThreadStateEg {

	public static void main(String[] args) {
		MyThread mt =new MyThread ("My Thread-1");
		
		System.out.println("ID-"+mt.getId());
		System.out.println("Name-"+mt.getName());
		System.out.println("Priority-"+mt.getPriority());
		System.out.println("Thread State-"+mt.getState());
		
		mt.start();
		System.out.println("Thread State-"+mt.getState());
	}
}

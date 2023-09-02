

class MyTest extends Thread
{
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println("Hello");
			i++;
		}
	}
}
public class MultiThreadingEg {

	public static void main(String[] args) {
//		//display();
		MyTest t = new MyTest();
		t.start();
		int i=1;
		while(true)
		{
			System.out.println("World");
			i++;
		}	
	}
}


//Thread Class:
//	 * 
//	 * Constructors:
//	 * 	1.Thread()
//	 * 	2.Thread(Runnable r)
//	 * 	3.Thread(Runnable r, String Name)
//	 * 
//	 * Thread Method() get and set method:
//	 *  1.long getId()
//	 *  2.String getName()
//	 *  3.int getPriority()
//	 *  4.Thread State getState()
//	 *  
//	 *  5.void setName(String name)
//	 *  6.void setPriority(int p)
//	 *  
//	 *  Thread Instance Method:
//	 *  
//	 *  1. start()
//	 *  2. run()
//	 *  3. interrupt()
//	 *  4. wait()
//	 * */
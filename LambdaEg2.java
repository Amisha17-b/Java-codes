interface MyLambda3
{
	public void display();
}
class UseLambda
{
	public void callLambda(MyLambda3 ml3) {
		ml3.display();
	}
}
class Demo1
{
	
	public void method1()
	{
		UseLambda ul=new UseLambda();
		ul.callLambda( ()->{System.out.println("Hello!!!");} );
	}
}
public class LambdaEg2 {
 public static void main(String[] args)
 {
	 Demo1 d1=new Demo1();
		d1.method1();
 }
}

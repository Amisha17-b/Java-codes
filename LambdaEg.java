
interface MyLambda2
{
	public void display();
}

class Demo
{
	public void method1()
	{
		MyLambda2 ml=()->{
			int count=0;
			System.out.println("Hi");
			System.out.println("Everyone");
			System.out.println("Everyone"+count);
			//System.out.println("values of X;"+ x);
		};
		ml.display();
	}
}
public class LambdaEg {
public static void main(String[] args) {
	
	Demo d= new Demo();
	d.method1();
}
}


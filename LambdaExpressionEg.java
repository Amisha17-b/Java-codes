interface MyLambda{
	public double display (double length, double width);
}
public class LambdaExpressionEg {
public static void main(String[] args) {
	MyLambda objLambda= (length, width)->(length*width);
	System.out.println("hello");
	double area=objLambda.display(7,6);
	System.out.println("The area of rectangle is"+ area);
	
}
}

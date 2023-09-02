
public class ExceptionHandling {
public static void main (String args[]) {
	System.out.println("welcome");
	int a,b,c;
	try {
		int arr[]= {10,20,40,56};
		a=5;
		b=0;
		c=arr [2]/ arr[0];
		System.out.println("Result="+c);
		System.out.println(arr[5]);
	}
	catch(ArithemeticException e) {
		System.out.println(e.getMessage());
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("You are inside the finally");
	}
	System.out.println("end ");
}
}

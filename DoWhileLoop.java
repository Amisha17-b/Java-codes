
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		int a,b,c;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter 2 number:");
			a = sc.nextInt();
			b = sc.nextInt();
			
			c= a+b;
			
			System.out.println("Add: " +c);
			
			System.out.println("press y to continue");
			ch = sc.next().charAt(0);
			
		}
		while(ch=='y' || ch=='y');
	}
}

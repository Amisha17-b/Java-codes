package programs;
//Program.7 chk no if pos/neg and even/odd
import java.util.Scanner;

public class Positive_negative {
       
	static void check(int number) {
		if (number>=0) {
			System.out.println("Number is positive");
		}
		else if (number<0) {
			System.out.println("Number is negative");
		}
	}
	
	static void integer(int number) {
		if (number%2==0) {
			System.out.println("Number is even");
		}
		else  {
			System.out.println("Number is 0dd");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
         int number;
         System.out.println("Enter a number");
          
         number = sc.nextInt(); // with no space... next word and next line
         check(number);
         integer(number);
	}

}

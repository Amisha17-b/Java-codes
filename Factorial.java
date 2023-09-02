

import java.util.Scanner;

public class Factorial {
  
	static void  toCalculateFactorial( int userNumber ) {
		int product =1;
		for(int ctr=1; ctr <= userNumber; ctr++) {
			product *=ctr;
		}
		System.out.println("factorial is" + product);
	}
	
	
//	static void callEvenOddFunc(int userNumber) {
//		
//		for(int ctr=1; ctr <= userNumber; ctr++) {
//			Even_odd.sayEven_odd(ctr);
//		}
//	}
//	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a number to calculate factorial ");
         int userNumber = scan.nextInt();
          toCalculateFactorial(userNumber);
//         callEvenOddFunc(userNumber);
	}

}

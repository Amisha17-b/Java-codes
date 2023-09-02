//Check input whether given number is Armstrong number
package programs;

import java.util.Scanner;

public class Armstrong {
	/*
	//370 = 3^3 + 7^3 + 0^3 and the sum will be equal to the number=370
   */
	public static void main(String args[])
	{
		 int a,sum = 0,number,temp =0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 number = sc.nextInt();
		 temp = number;
		
		 for(;number!=0; number/=10) {
			 a= number%10;
			 sum= sum +(a*a*a);
		
		}
		
		if (sum== temp)
		  System.out.println("Its a Armstrong number");
		else
			 System.out.println("Its not a Armstrong number");
		
	}
}

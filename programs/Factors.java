package programs;

import java.util.Scanner;
public class Factors {
 private static void calculatefactors(int usernumber) 
	{
		
		for(int number = 1; number<= usernumber/2; number++) 
		{
			if(usernumber % number == 0)
			{
				System.out.println(number+ " ");
				}
		}
	}

 public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to calculate factors:");
		int usernumber = scan.nextInt();
		calculatefactors(usernumber);
				
		
	}
	}

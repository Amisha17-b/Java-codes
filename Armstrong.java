//Check whether given number is Armstrong number
public class Armstrong {
	/*
	//370 = 3^3 + 7^3 + 0^3 and the sum will be equal to the number=370
   */
	public static void main(String args[])
	{
		int number = 376;
		int temp = number; // assign value to temp ...to perform operation on temp
		int r , sum = 0;
		 
		while(number>0)
		{
		  r = number%10; //perform operation
		  number = number/10;
		  sum = sum + r*r*r;
		}
		
		if (temp == sum)
		  System.out.println("Its a Armstrong number");
		else
			 System.out.println("Its not a Armstrong number");
		
	}
}

package programs;
//program.6 print days of the week by accepting user input

import java.util.Scanner; 
public class Days_of_the_week {
	
	static void Days(int number) {
    	if (number == 0) {
    		System.out.println("Sunday");
    	}
    	else if (number ==1) {
    		System.out.println("monday");
    	}
    	else if(number ==2) {
    		System.out.println("tuesday");
    	}
    	else if(number ==3) {
    		System.out.println("Wednesday");
    	}
    	else if(number==4) {
    		System.out.println("thursday");
    	}
    	else if(number ==5) {
    		System.out.println("friday");
    	}
    	 else if(number ==6) {
    		System.out.println("Saturday");
	    }
//    	 else{
//    		 System.out.println("Invalid number");
//    	 }
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
       	 int number;
//		do { 
       		 System.out.println("Enter the Week Number(1-7) :");
    	number = sc.nextInt();
//       	 }
		
//       	while(number);
//	int number=7;
    	Days(number);
       	 

	}
}

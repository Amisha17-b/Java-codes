package programs;
//program.5 check buzz number or not
public class Buzz_no {

	static void check(int num) {
		if (num%7==0) {
			 System.out.println(num+" is buzz number ");
        	 }
		else {
			 System.out.println(num+" is not buzz number");
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num = 81;
          if (num==0) {
        	  System.out.println("Entered number is 0");
        	 
          }
          
          
          check(num);
	}
}

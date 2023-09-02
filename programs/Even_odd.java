package programs;
//program.1 check even or odd
//program.3 check positive  or negative

public class Even_odd {

	static void check(int num) {
		if (num%2==0) {
			 System.out.println(num+" is even &");
        	 }
		else {
			 System.out.println(num+" is odd &");
		}
	}
		static void magnitude(int num) {
			if (num>=0) {
				 System.out.println(num+" is positive ");
	        	 }
			else {
				 System.out.println(num+" is negative ");
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num =0;
          if (num==0) {
        	  System.out.println("Entered number is 0");
        	 
          }
          
          
          check(num);
    	  magnitude(num);
	}
//	public static void sayEven_odd(int ctr) {
//		// TODO Auto-generated method stub
//		
//	}

}

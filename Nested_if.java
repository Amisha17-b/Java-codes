
public class Nested_if {
	static void check(int marks) {
		if (marks>=0 && marks<=100) {
			
			if(marks >=41 && marks <=60 ) {
				System.out.print("grade e");
			}
			 if(marks >=61 && marks <=70 ) {
				System.out.print("grade d");
			}
			 if(marks >=71 && marks <=80 ) {
				System.out.print("grade c");
			}
			 if(marks >=81 && marks <=90 ) {
				System.out.print("grade b");
			}
			 if(marks >=91 && marks <=100 ) {
				System.out.print("grade a");
		}
			 if(marks <=40 ) {
				System.out.print("better luck next time");
		}
			 else
				 System.out.print("Invalid input ");
		}
	
	}
    public static void main(String args[]) {
    	int marks=100;
    	check(marks);
    	
    }
}

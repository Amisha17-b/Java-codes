
public class Marks {
	static void score (int value){
		if (value>=0 && value<=100) {
			
				if(value >=41 && value <=60 ) {
					System.out.print("grade e");
				}
				else if(value >=61 && value <=70 ) {
					System.out.print("grade d");
				}
				else if(value >=71 && value <=80 ) {
					System.out.print("grade c");
				}
				else if(value >=81 && value <=90 ) {
					System.out.print("grade b");
				}
				else if(value >=91 && value <=100 ) {
					System.out.print("grade a");
			}
				else if(value <=40 ) {
					System.out.print("better luck next time");
			}
		}
	}

public static void main(String arsg[]) {
	int value = 42;
	score(value);
}
}
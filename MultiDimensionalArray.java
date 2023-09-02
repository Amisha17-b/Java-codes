import java.util.Scanner;

public class MultiDimensionalArray {
    
	private static Scanner scan = new Scanner(System.in);
	
	private static void readValues(int arr[][]) {
		for(int row = 0 ; row < arr.length; row++ ) {  //3
			for(int col = 0 ; col < arr[row].length; col++ ) {  //3
				//00 01 02
				//10 11 12
				//20 21 22
				arr[row][col] = scan.nextInt();
			}
		}
	}
	
	public static void main(String args[]) {
		int row = scan.nextInt();
		int col = scan.nextInt();
		 
		     int arr[][] = new int[row][col];
		     readValues(arr);
		     displayArrValues(arr);
		     
		
	}
	private static void displayArrValues(int[][] arr) {
		for(int row = 0 ; row < arr.length; row++ ) {  //3
			for(int col = 0 ; col < arr[row].length; col++ ) {  //3
				//00 01 02
				//10 11 12
				//20 21 22
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	
	}
}

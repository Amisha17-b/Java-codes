package programs;

import java.util.Scanner;

public class LinearSearch{

	 public static void array(int num){
		  int arr[];
		 
		  Scanner sc = new Scanner(System.in);
		  int num1 = sc.nextInt();
		  arr = new int[num1];
		     for(int ctr = 0; ctr < num1; ctr++){
	      arr[ctr] = sc.nextInt();
	      
	     }
	   for(int ctr = 0; ctr < num1; ctr++){
	        arr[ctr] = sc.nextInt();
		    System.out.print(arr[ctr]+" ");  
		    
	  }
	  
	 }
	  public static void main(String args[]){
	    int arr[];
	    boolean flag = false;
	    System.out.println("Enter the number of elements");
	    Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	    arr = new int[num]; 
	    array(num);
//	   
	    System.out.println("Enter the number to searach");
	    int search = sc.nextInt();

	    for(int ctr = 0; ctr < num; ctr++){
	      // arr[ctr] = sc.nextInt();
	      if(arr[ctr]==search){
	        System.out.println("Entered Element found at index " +ctr);
	        flag = true;
	        break;
	      }
	         
	    }
	    if (flag){
	      System.out.println("Entered Element not found");
	    }


	    
	  }
	}

//import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq= new PriorityQueue<>();
	  pq.add(10);
	  pq.add(20);
	  pq.add(30);
	  pq.remove(20);
	  
	  pq.forEach((i)->System.out.println("The Priority queue ele are"+i)); //lambda expression
	  
	  System.out.println("Priority queue element are" +pq);
	
	}
}
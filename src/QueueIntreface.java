import java.util.LinkedList;
import java.util.Queue;

public class QueueIntreface {
   public static void main(String[] args) {
	
	   
	   Queue<Integer> q = new LinkedList<>();
	   q.add(1);
	   q.add(2);
	   q.add(3);
	   q.add(4);
	   System.out.println(q);
	   
	   System.out.println(q.poll());    ///Poll deletes the first element in the collection
	   System.out.println(q);   // 
	   System.out.println(q.peek());
	   System.out.println();
	   q.clear();
}  
}

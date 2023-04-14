package collections;
import java.util.*;

public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("John");
		q.add("Rock");
		q.add("Hemant");
		q.add("Ritu");
		q.add("Alex");
		System.out.println("head:"+q.element());
		System.out.println("Queue:"+q);
		System.out.println("head:"+q.peek());
		System.out.println("Queue:"+q);
		System.out.println("Iterating the elements");
		Iterator<String> itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("head: "+q.poll());
		System.out.println("Queue: "+q);
		System.out.println("head: "+q.remove());
		System.out.println("Queue: "+q);
		System.out.println("After Removing: ");
		Iterator<String> itr1=q.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}

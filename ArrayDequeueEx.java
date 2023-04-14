package collections;
import java.util.*;
public class ArrayDequeueEx {
	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Jain");
		dq.add("Ritu");
		dq.add("Aman");
		dq.add("Jack");
		dq.add("Martin");
		//dq.add(null);//null are not allowed
		System.out.println(dq);
		dq.addFirst("Hemant");
		dq.addLast("Gautam");
		System.out.println("New List");
		for(String s:dq) {
			System.out.println(s);
		}
		dq.removeFirst();
		dq.removeLast();
		System.out.println("new List after Removal");
		for(String s2:dq) {
			System.out.println(s2);
		}
	}
}

package collections;
import java.util.*;

public class ArrayDequeEx2 {
	public static void main(String[] args) {
		//creating & adding
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Hemant");
		dq.add("Aryan");
		dq.add("Megha");
		dq.add("Amit");
		dq.offerFirst("Ritu");
		System.out.println("After offer first");
		//traversing
		for(String str:dq) {
			System.out.println(str);
		}
		dq.offerLast("Aman");
		System.out.println("After offer last");
		//traversing
		for(String str1:dq) {
			System.out.println(str1);
		}
		//deque.peek() & deque.peekFirst same as peek()
		System.out.println("Peek: "+dq.peek());
		System.out.println("Peek First: "+dq.peekFirst());
		System.out.println("Peek Last: "+dq.peekLast());
		System.out.println("After Peek");
		for(String str2:dq) {
			System.out.println(str2);
		}
		//deque.poll() & deque.pollFirst same as poll()
		System.out.println("Poll: "+dq.poll());
		System.out.println("Poll First: "+dq.pollFirst());
		System.out.println("Poll Last: "+dq.pollLast());
		System.out.println("After poll");
		for(String str3:dq) {
			System.out.println(str3);
		}
	}
}

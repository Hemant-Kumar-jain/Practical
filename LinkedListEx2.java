package collections;
import java.util.*;
public class LinkedListEx2 {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();// create list
		ll.add("Aryan");
		ll.add("Megha");
		ll.add("Amit");
		ll.add("Hemant");
		ll.add("Ritu");
		ll.add("Aman");
		System.out.println("List 1 elements: "+ll+" ");
		//retrieves the 1st elements of the list-- by default
		System.out.println(ll.peek());
		//retrieves the 1st elements of the list
		System.out.println(ll.peekFirst());
		//retrieves the last elements of the list
		System.out.println(ll.peekLast());
		//retrieve and remove the 1st elements of the list -- by default
		System.out.println(ll.poll());
		System.out.println("List 1 elements: "+ll+" ");
		//retrieve and remove the 1st elements of the list
		System.out.println(ll.pollFirst());
		System.out.println("List 1 elements: "+ll+" ");
		//retrieve and remove the last elements of the list
		System.out.println(ll.pollLast());
		System.out.println("List 1 elements: "+ll+" ");
		System.out.println(ll.pop());
		System.out.println("List 1 elements: "+ll+" ");
	}

}

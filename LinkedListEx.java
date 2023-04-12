package collections;
import java.util.*;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();// create list
		ll.add("Hemant");
		ll.add("Ritu");
		ll.add("Amit");
		ll.add("Aryan");
		ll.add("Megha");
		ll.add("Aman");
		System.out.println(ll);
		Iterator<String>itr=ll.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		
		//adding an element at the specific position
		ll.add(2, "Pooja");//add(int index,element)
		System.err.println("After adding: "+""+ll);
		
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("Ritu");
		ll2.add("Gautam");
		ll2.add("Hemant");
		ll2.add("Kumar");
		ll2.add("Jain");
		System.err.println("List 2 elements: "+""+ll2);
		//adding all 2nd list elements to the 1st list 
		ll.addAll(ll2);
		System.err.println("After ading all elements of list 2: "+""+ll);
		//adding all 2nd list elements to the 1st list at a specific position
		ll.addAll(2, ll2);
		System.err.println("After adding all elements of list 2 at specific position: "+""+ll);
		//adding element at the 1st position
		ll2.addFirst("Ajay");
		System.out.println("Add element at 1st: "+""+ll2);
		//adding element at the last position
		ll2.addLast("Gupta");
		System.out.println("Add element at last: "+""+ll2);
	}
}

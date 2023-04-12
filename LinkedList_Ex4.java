package collections;
import java.util.*;

public class LinkedList_Ex4 {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Anudip");
		ll.add("Hemant");
		System.out.println("After Adding: ");
		// Adding an element at the specific position
		ll.add(1,"Ritu");
		LinkedList<String> ll1=new LinkedList<String>();//new element and list
		ll1.add("aa");
		ll1.add("bb");
		//adding 2nd list elements to the first list
		ll.addAll(ll1);
		//adding 2nd list elements to the 1st list at specific position
		ll.addAll(1,ll1);
		//adding an elements at the 1st position
		ll.addFirst("skill");
		//adding an elements at the last position 
		ll.addLast("Development");
		//Removing specific element from arraylist
		ll.remove("Hemant");
		//removing specific element on the basis of particular position
		ll.remove(1);
		//remove all the new elements
		ll.removeAll(ll1);
		//remove first elements from the list
		ll.removeFirst();
		//remove last elements of list
		ll.removeLast();
		//remove first occurance of element
		ll.removeFirstOccurrence(ll1);
		//remove last occurance of element
		ll.removeLastOccurrence(ll1);
		//remove all the elements
		ll.clear();
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Traversing the list of elements in reverse order
		Iterator i=ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}


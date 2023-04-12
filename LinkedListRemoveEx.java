package collections;
import java.util.*;
// Remove method combination
public class LinkedListRemoveEx {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();// create list
		ll.add("Hemant");
		ll.add("Ritu");
		ll.add("Amit");
		ll.add("Aryan");
		ll.add("Megha");
		ll.add("Aman");
		System.out.println("List 1 elements: "+ll+" ");
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("Ritu");
		ll2.add("Gautam");
		ll2.add("Hemant");
		ll2.add("Kumar");
		ll2.add("Jain");
		System.out.println("List 2 elements: "+ll2+" ");
		//adding new element to the list 1
		ll.addAll(ll2);
		System.out.println("After adding new elements: "+ll+" ");
		
		//Removing specific element from arraylist 1
		ll.remove("Amit");
		System.err.println("After Removing: "+ll+" ");
		//Removing specific element on the basis of particular position
		ll.remove(1);
		System.out.println("After Removing from specific position: "+ll+" ");
		//remove all the new elements of list 2
		ll.removeAll(ll2);
		System.err.println("After removing all new elements: "+ll+" ");
		//remove 1st elements from the list
		ll.removeFirst();
		System.out.println("After Removing 1st elements: "+ll+" ");
		//remove last elements from the list
		ll.removeLast();
		System.err.println("After Removing last elements: "+ll+" ");
		//adding new elements to the list 1
		ll.add("Rahul");
		ll.add("Saurabh");
		ll.add("Sagar");
		ll.add("Yuvraj");
		ll.add("Sagar");
		System.out.println("updated list elements: "+ll+" ");
		//remove first occurrance of element
		ll.removeFirstOccurrence("Sagar");
		System.out.println("Removing first occurance: "+ll+" ");
		//remove last occurance of element
		ll.removeLastOccurrence("Sagar");
		System.out.println("After removing last occurance: "+ll+" ");
		//Traversing the list of elements in reverse order
		Iterator i=ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//remove all the elements
		ll.clear();
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

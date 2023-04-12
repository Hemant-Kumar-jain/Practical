package collections;
import java.util.*;

public class VectorExample {
	public static void main(String[] args) {
		// creating vector
		Vector<String> vc=new Vector<String>();
		//adding elements to a vector
		vc.add("Dog");
		vc.add("Cat");
		vc.add("Tiger");
		//checking size & capacity
		System.out.println("Size: "+vc.size());
		System.out.println("Capacity: "+vc.capacity());//old cap *3 /2 +1
		//add more elements
		vc.addElement("Cow");
		vc.addElement("Goat");
		System.out.println("After adding elements:");
		System.out.println("Size: "+vc.size());
		System.out.println("Capacity: "+vc.capacity());
		//checking cat is present in the vector or not
		System.out.println(vc);
		if(vc.contains("Cat")) {
			System.out.println("Element Present");
		}
		else {
			System.out.println("Element Not Present");
		}
		// getting 1st element
		System.out.println("1st element: "+vc.firstElement());
		//getting last element
		System.out.println("Last element: "+vc.lastElement());
		//checking index of specified element
		System.out.println("index: "+vc.indexOf("Cat"));
	}
}

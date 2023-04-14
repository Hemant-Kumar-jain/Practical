package collections;
import java.util.*;
public class LinkedHashSetEx {
	public static void main(String[] args) {
		//creating hashset and adding elements
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Four");
		lhs.add("Two");
		lhs.add("One");
		lhs.add("Three");
		lhs.add("Five");
		System.out.println("Original List: "+lhs);
		//removing specific element from the above mentioned list
		System.out.println(lhs.remove("Two"));
		System.out.println("Updated list: "+lhs);
		//six is not present
		//return false
		System.out.println(lhs.remove("Six"));
	}
}

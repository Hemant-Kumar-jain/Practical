package collections;
import java.util.*;
public class HashSetEx2 {
	public static void main(String[] args) {
		//creating HashSet and adding element
		HashSet<String> set=new HashSet<>();//set 1
		set.add("Ram");
		set.add("Rima");
		set.add("Shyam");
		set.add("Ram");
		set.add("Ramesh");
		System.out.println("ORiginal list: "+set);
		//removing specific element from hash set
		set.remove("Ram");
		System.out.println("After invoking remove: "+set);
		
		HashSet<String> set1=new HashSet<>();//set 2
		set1.add("Hemant");
		set.add("Ritu");
		System.out.println("New Set: "+set1);
		set.addAll(set1);
		System.out.println("Updated list: "+set);
		
		//remove all the new elements
		set.removeAll(set1);
		//remove all
		set.clear();
		System.out.println("Present list: "+set);
	}
}

package collections;
import java.util.*;
public class ArrayListEx {
	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("Ram");
		al.add("Sam");
		al.add("Rose");
		al.add("Liza");
		al.add("Devid");
		al.add("Maria");
		Collections.sort(al);
		System.out.println("Traversing after sorting");
		for(String name:al) {
			System.out.println(name);
		}
		String element =al.get(2);//get()method
		System.out.println("Get index: "+element);
		System.out.println("Array list is: "+al.isEmpty());// isEmpty()
		String element1=al.remove(4);//remove()
		System.out.println("Remove index: "+element1);
		System.out.println("Traversing using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}

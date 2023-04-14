package collections;
// LinkedHashSet inherits the hashset class & implements the set interfaces
import java.util.*;
public class LinkedHashSetEx2 {
	public static void main(String[] args) {
		Set<String> s=new LinkedHashSet<String>();
		s.add("Pen");
		s.add("Pencil");
		s.add("Mouse");
		s.add("Phone");
		s.add(null);//allow null element
		s.add("Ac");
		s.add("Bottle");
		s.add("Earphone");
		s.add("Pen");//not allow duplicate values
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

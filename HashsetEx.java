package collections;
import java.util.*;

public class HashsetEx {
	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();//creating hashset object
		s.add("Ac");
		s.add("Pencil");
		s.add("Mouse");
		s.add("Phone");
		s.add(null);//allow null element
		s.add("Ac");//not allow duplicate values
		s.add("Bottle");
		s.add("Earphone");
		s.add("Pen");
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

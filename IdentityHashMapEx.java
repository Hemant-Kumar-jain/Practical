package map;
import java.util.*;

public class IdentityHashMapEx {
	public static void main(String[] args) {
		//check content comparison
//		HashMap m=new HashMap();
//		Integer l1=new Integer(10);
//		Integer l2=new Integer(10);
//		m.put(l1,"Hemant");
//		m.put(l2,"Aman");
//		System.out.println(m);
		//check Reference comparison
		IdentityHashMap<Object, Object> m=new IdentityHashMap<>();//creating object of Identity HashMap
		Integer l1=new Integer(10);
		Integer l2=new Integer(10);
		m.put(l1,"Aman");
		m.put(l2,"Hemant");
		System.out.println(l1==l2);//check reference comparison
		System.out.println(l1.equals(l2));//check content comparison
		System.out.println(m);
	}
}

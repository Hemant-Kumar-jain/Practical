package map;
import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> m=new HashMap<String, Integer>();
		m.put("Mango",101);
		m.put("Banana",102);
		m.put("Apple",105);
		m.put("Litchi",104);
		m.put(null,107);
		m.put("Guava",null);
		System.out.println(m);
		System.out.println(m.put("Chiru",1000));
		Set<String> s=m.keySet();
		System.out.println(s);
		Collection<Integer> c=m.values();
		System.out.println(c);
		Set s1=m.entrySet();
		System.out.println(s1);
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"...."+m1.getValue());
//			if(m1.getKey().equals("Nag")) {
//				m1.setValue(50000);
//			}
		}
		System.out.println(m);
		System.out.println("-----------------------------------");
		m.putIfAbsent("Guava",110);
		m.putIfAbsent("Litchi",112);
		for(Map.Entry map:m.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
		}
		m.remove("Apple");
		System.out.println(m);
	}                                                             
}

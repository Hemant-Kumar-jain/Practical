package map;
import java.util.*;
public class LinkedHashMapEx {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> m=new LinkedHashMap<String, Integer>();
		m.put("Chiru",700);
		m.put("Bala",800);
		m.put("Venki",200);
		m.put("Nag",500);
		System.out.println(m);
		System.out.println(m.put("Chiru",1000));
		Set<String> s=m.keySet();
		System.out.println(s);
		Collection<Integer> c=m.values();
		System.out.println(c);
		m.remove("Venki");
		System.out.println(m);
		Set s1=m.entrySet();
		System.out.println(s1);
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"...."+m1.getValue());
			if(m1.getKey().equals("Nag")) {
				m1.setValue(50000);
			}
		}
		System.out.println(m);
		
	}
}

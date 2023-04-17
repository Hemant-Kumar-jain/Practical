package map;
import java.util.*;
public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer,String> m=new TreeMap<>();
		m.put(null,"Mango");
		m.put(108,"Orange");
		m.put(105,"Banana");
		m.put(103,"Grapes");
		m.put(105,"Banana");
		m.put(107,null);
		System.out.println(m);
		m.putIfAbsent(107,"Chiku");
		m.putIfAbsent(101,"Banana");
		System.out.println("-------------------------------");
		for(Map.Entry map:m.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
		}
		m.remove(103);
		System.out.println("----------------------------------");
		System.out.println("After Removal: ");
		System.out.println("----------------------------------");
		for(Map.Entry map:m.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}
}

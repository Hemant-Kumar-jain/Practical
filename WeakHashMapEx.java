package map;
import java.util.*;

public class WeakHashMapEx {
	public static void main(String[] args) throws Exception {
		WeakHashMap<Temp, String> m=new WeakHashMap<>();
		Temp t=new Temp();
		m.put(t,"Hemant");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}
class Temp{
	public String toString() {
		return "Hello";
	}
	public void finalize() {
		System.out.println("finalize() called");
	}
}

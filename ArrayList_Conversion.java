package collections;
import java.util.*;
public class ArrayList_Conversion {
	public static void main(String[] args) {
		//Arralist all=new ArrayList();//non-generic
		ArrayList<String> al=new ArrayList<String>();//create object -generic
		al.add("Ritu");
		al.add("Hemant");
		al.add("Deepak");
		al.add("Aryan");
		al.add("Megha");
		//conversion of list to array
		System.out.println("List to Array");
		//toArray() Method used to convert list to array
		String [] arr=al.toArray(new String[al.size()]);
		for(String s:arr) { //traversing using for each
			System.out.println(s);
		}
		//array to list
		System.out.println("Array to List");
		List<String> all=new ArrayList<String>();
		all=Arrays.asList(arr);//asList method convert array to list
		System.out.println(all);
	}
}

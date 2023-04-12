package collections;
import java.util.*;
public class ArrayListUsing_UserdefineEx {
	public static void main(String[] args) {
		Bank b1=new Bank(12345,"Mamta",5000,34);
		Bank b2=new Bank(12347,"Hemant",9000,57);
		Bank b3=new Bank(12346,"Ritu",8000,39);
		Bank b4=new Bank(12349,"Hemant",4500,46);
		Bank b5=new Bank(12341,"Ritu",2500,21);
		
		ArrayList<Bank> al=new ArrayList<Bank>();
		al.add(b1);
		al.add(b3);
		al.add(b4);
		al.add(b2);
		al.add(b5);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Bank obj=(Bank)itr.next();
			System.out.println(obj.accountNo+" "+obj.customerName+" "+obj.balance+" "+obj.customerAge);
		}
	}
}

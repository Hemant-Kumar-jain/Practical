package hemant.com;
import java.util.*;

class Base{	
	int base_salary;
}

class Derived1 extends Base{
	int Bonus;
}

class Derived2 extends Derived1{
	int ha;
	void get(int x,int y,int z) {
		this.base_salary=x;
		this.Bonus=y;
		this.ha=z;
	}
	void show() {
		System.out.println("Salary is :"+base_salary);
		System.out.println("Bonus is :"+Bonus);
		System.out.println("Housing allowance is :"+ha);
		System.out.println("Net Salary is :"+base_salary+" + "+Bonus+" + "+ha+" = "+(base_salary+Bonus+ha));
	}
}

public class Multi_Level_eg2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Base Salary");
		int a=sc.nextInt();
		System.out.println("Enter the Bonus");
		int b=sc.nextInt();
		System.out.println("Enter the House Allowance");
		int c=sc.nextInt();
		Derived2 child=new Derived2();
		child.get(a, b, c);
		child.show();
	}

}

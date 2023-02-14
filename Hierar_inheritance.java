package hemant.com;
class Employee{
	int salary=10000;
	int bonus=1500;
	void action() {
		int updated_salary=salary+bonus;
		System.out.println(updated_salary);
	}
}

class Engineer extends Employee{
	int Benefits=10;
}
class Doctor extends Employee{
	int da=5;
}

public class Hierar_inheritance {
	public static void main(String[] args) {
		Engineer e=new Engineer();
		System.out.println(e.salary+" "+e.Benefits+" "+"incremented salary for engineer");
		e.action();
		Doctor d=new Doctor();
		System.out.println(d.salary+" "+d.da+" "+"increamented salary for Doctor");
		d.action();
		
	}
}

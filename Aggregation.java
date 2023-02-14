package hemant.com;

class Student2{
	String name;
	int Id;
	int phone;
	Address address;
	public Student2(String name,int Id,int phone,Address address) {
		this.name=name;
		this.Id=Id;
		this.phone=phone;
		this.address=address;
	}
	void show() {
		System.out.println(name+" "+Id+" "+phone);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
    }
public class Aggregation {
	public static void main(String[] args) {
		Address address1=new Address("Faridabad","Haryana","India");
		Address address2=new Address("Vrindavan","Up","India");
		
		Student2 s=new Student2("Hemant",101,12345,address1);
		Student2 s1=new Student2("Aman",102,98765,address2);
		
		s.show();
		s1.show();
		
		
	}
}


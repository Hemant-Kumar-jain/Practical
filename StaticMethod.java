package hemant.com;

class StaticMethod1{
	int rollno;
	String name;
	float fee;
	static String college="YMCA";
	// static method to change the value of static variable
	//static void change() {
		//college="MDU";
	//}
	// Constructor
	StaticMethod1(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		// call static method with class name
		StaticMethod1.college="DAV";
		// creating object
		StaticMethod1 s1=new StaticMethod1(105,"Hemant",5000);
		StaticMethod1 s2=new StaticMethod1(106,"Rahul",6000);
		s1.display();
		s2.display();
	}
	

}

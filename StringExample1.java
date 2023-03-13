

public class StringExample1{
public void show(){
char[] arr={'j','a','v','a'};
System.out.println(arr);
String s=new String(arr);
System.out.println("Value is :"+s);
}

public void myFunction(){
String s1="Hemant";
String s2=new String(s1);
System.out.println(s2);
}
public static void main(String[] args){
StringExample1 str=new StringExample1();
str.show();
str.myFunction();
}
}
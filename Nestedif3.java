class Nestedif3{
public static void main(String[] args){
int a=2;
int b=8;

int c=a%b;
int d=a/b;
if(c!=d){
if(c==d){
System.out.println("c is equal d");
}
else if(c!=d){
System.out.println("c not equal d");
}
else{
System.out.println("choose right value");
}
}
}
}
class Nestedif
{
public static void main(String[] args) 
{
String address = "Faridabad,india";

if(address.endsWith("india")){
if(address.contains("Kolkata")){
System.out.println("Your city is Kolkata");
}

else if(address.contains("Mumbai")){
System.out.println("your city is Mumbai");
}
else{
System.out.println(address.split(",")[0]);
}
}

else{
System.out.println("You are not living in India");
}
}
}


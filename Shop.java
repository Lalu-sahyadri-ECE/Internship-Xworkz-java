class Shop{
public static void main(String [] pC){
String shopName = "Pavithra COllections";
String address  = "Rajajinaga Bhysham Cricle";
String [] workersName = {"Sagar","Pranam P Gowda"};
System.out.println("Shop name is :"+shopName);
System.out.println("Shop address is :"+address);
System.out.println("Number of workers :"+workersName.length);
for(String name : workersName) System.out.println(name);
}}
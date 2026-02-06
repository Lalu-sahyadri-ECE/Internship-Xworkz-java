class PoliceStation {
public static void main(String [] args){
String name = "TOWN POLICE STATION";
String inspector = "Kumar";
String address = "Mysore";
String departments[] = {"Traffic","Crime","Cyber","Women Safety"};
String officers[] = {"Ravi","Arjun","Vinay","Deepak"};

System.out.println("The Police Station Name is :"+name);
System.out.println("The Inspector Name is :"+inspector);
System.out.println("The Address is :"+address);
System.out.println("The Number of Departments is "+departments.length);
for(String dept : departments){System.out.println(dept);}
System.out.println("The Number of Officers are "+officers.length);
for(String officer : officers){System.out.println(officer);}
}
}

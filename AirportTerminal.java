class AirportTerminal {
public static void main(String[] args){
String terminalName = "INTERNATIONAL TERMINAL";
String director = "Mahendra";
String location = "Kempegowda Airport";
String airlines[] = {"Indigo","Air India","Emirates","Vistara"};
String staff[] = {"Suresh","Kavya","Nitin","Harini"};

System.out.println("The Terminal Name is :"+terminalName);
System.out.println("The Director Name is :"+director);
System.out.println("The Location is :"+location);
System.out.println("The Number of Airlines is "+airlines.length);
for(String airline : airlines){System.out.println(airline);}
System.out.println("The Number of Staff are "+staff.length);
for(String member : staff){System.out.println(member);}
}
}

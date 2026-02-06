class MetroStation {
public static void main(String[] args){
String stationName = "MAJESTIC METRO";
String controller = "Shivraj";
String city = "Bangalore";
String lines[] = {"Purple Line","Green Line"};
String staff[] = {"Ajith","Megha","Suraj","Kavitha"};
System.out.println("The Metro Station Name is :"+stationName);
System.out.println("The Controller Name is :"+controller);
System.out.println("The City is :"+city);
System.out.println("The Number of Lines is "+lines.length);
for(String line : lines){System.out.println(line);}
System.out.println("The Number of Staff are "+staff.length);
for(String member : staff){System.out.println(member);}
}
}

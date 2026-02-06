class Gym {
public static void main(String [] args){
String name = "ROCK Fitness";
String trainer = "Ajay";
String address = "Kollegal";
String equipments[] = {"Treadmill","Dumbbells","Bench Press","Cycling"};
String members[] = {"Rohit","Manoj","Karthik","Lalu"};

System.out.println("The Gym Name is :"+name);
System.out.println("The Trainer Name is :"+trainer);
System.out.println("The Address is :"+address);
System.out.println("The Number of Equipments is "+equipments.length);
for(String equip : equipments){System.out.println(equip);}
System.out.println("The Number of Members are "+members.length);
for(String member : members){System.out.println(member);}
}
}

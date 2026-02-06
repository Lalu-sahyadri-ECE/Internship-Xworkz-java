class Restuarant {
public static void main(String [] args){
String name  = "KINGSPIN";
String owner = "Symon";
String address = "Chennai";
String branches[] ={"Tamil Nadu","Andhra","Karnataka","Kerala"};
String managers[]= {"Deva","Dhaha","Dayal","Khaleesa"};
System.out.println("The Restuarant Name is :"+name);
System.out.println("The Name of the Owner is :"+owner);
System.out.println("The Address of the Owner is :"+address);
System.out.println("The Number of Branches is "+branches.length);
for(String branch : branches){System.out.println(branch);}
System.out.println("The Number of Managers are "+managers.length);
for(String manager : managers){System.out.println(manager);}
}
}
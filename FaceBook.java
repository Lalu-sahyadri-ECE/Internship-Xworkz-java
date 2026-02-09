class FaceBook{
public static void main(String [] newAccount){
createNewAccount("Lalu Prasad",
"B",
"25/11/2004",
"Male",
8217279387l,
"laluprasad2504@gmail.com",
"Lalu@2504");}
static void createNewAccount(String firstName,String surName,String dateOfBirth,String gender,long mobileNumber ,String emailAddress,String password){
System.out.println("User Frist name is "+ firstName);
System.out.println("User surname is "+surName);
System.out.println("User date of birth is "+dateOfBirth);
System.out.println("User gender is "+gender);
System.out.println("User Mobile Number is "+mobileNumber);
System.out.println("User Email Address is "+emailAddress);
System.out.println("User Password is "+password);
}
}
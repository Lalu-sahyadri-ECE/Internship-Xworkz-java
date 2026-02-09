class RedCrossBlood{
public static void main(String [] bloodDonation){
createDonorAccount("laluprasad@2504",2505,
				   "Lalu","Prasad",
				   "25/11/2004","LALU2511",
				   571440,"Lalu@2511",
				   "Lalu@2511","O+ve");}
static void createDonorAccount(String emailID, int donorId ,
							   String firstName , String lastName, 
							   String dateOfBirth ,String userName , 
							   int zipCode , String passWord , 
							   String repeatePassword ,String bloodGroup){
System.out.println("The Donor email ID is :"+  emailID);
System.out.println("The Donor ID is :"+ donorId);
System.out.println("Donor First Name is :"+firstName);
System.out.println("Donor Last Name is :"+lastName);
System.out.println("Date of Birth of the Donor is :"+ dateOfBirth);
System.out.println("Donor User name is :"+userName);
System.out.println("Donor zip Code is :"+zipCode);
System.out.println("Password of the user Account is :"+passWord);
System.out.println("Re-confirming the password :"+repeatePassword);
System.out.println("User Blood Gorup is :"+bloodGroup);
}
}
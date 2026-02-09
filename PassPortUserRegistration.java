class PassPortUserRegistration{
public static void main(String[] passPortSeva){
newPassPortApplication(5,"laluprasad2504@gmail.com",true,"LALU PRASAD B","LaluPrasad@250","laluprasad2504@gmail.com");
}
static void newPassPortApplication(int dcdrLocation ,String email ,boolean emailloginSame,String userName ,String password,String userId ){
System.out.println("User name is "+userName);
System.out.println("User Id is "+userId);
System.out.println("User email is "+email);
System.out.println("User login is same as email :"+emailloginSame);
System.out.println("User Passport verification location s "+dcdrLocation);
System.out.println("User password is "+password);
}
}
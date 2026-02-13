class TelevisionExecutor{

public static void main(String [] args){

boolean on = Television.onOrOff();
System.out.println("The Television is turned on "+on);

Television.nextChannel();
Television.nextChannel();
Television.nextChannel();
Television.nextChannel();
Television.nextChannel();
Television.nextChannel();


Television.previousChannel();
Television.previousChannel();

boolean off = Television.onOrOff();
System.out.println("The Television is turned on "+off);

Television.previousChannel();

}}

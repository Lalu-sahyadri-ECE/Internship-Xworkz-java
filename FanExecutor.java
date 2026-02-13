class FanExecutor{

public static void main(String [] args){

boolean on = Fan.onOrOff();
System.out.println("The Fan is turned on "+on);
Fan.increaseSpeed();
Fan.increaseSpeed();
Fan.increaseSpeed();
Fan.increaseSpeed();
Fan.increaseSpeed();
Fan.increaseSpeed();
boolean off = Fan.onOrOff();
System.out.println("The Fan is turned on "+off);
Fan.decreaseSpeed();
Fan.onOrOff();
Fan.increaseSpeed();

}}

class HeaterExecutor{
public static void main(String [] trim){
boolean state = Heater.onOrOff();
System.out.println(state);
Heater.increaseHeat();
boolean off = Heater.onOrOff();
System.out.println("The Heater is turned on"+off);
Heater.increaseHeat();
Heater.onOrOff();
System.out.println("The Heater is turned on "+ state);
Heater.increaseHeat();
Heater.increaseHeat();
Heater.increaseHeat();
Heater.increaseHeat();

Heater.increaseHeat();

Heater.increaseHeat();

Heater.increaseHeat();

Heater.decreaseHeat();
Heater.decreaseHeat();
Heater.decreaseHeat();
Heater.decreaseHeat();
Heater.onOrOff();
System.out.println("The Heater is turned on"+off);
Heater.decreaseHeat();

Heater.onOrOff();
System.out.println("The Heater is turned on "+ state);
Heater.decreaseHeat();
Heater.decreaseHeat();
Heater.decreaseHeat();

}
}
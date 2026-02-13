class BulbExecutor{
public static void main(String [] bulb){
boolean state = Bulb.onOrOff();
System.out.println(state);
Bulb.increaseBrightness();
boolean off = Bulb.onOrOff();
System.out.println("The Bulb is turned on"+off);
Bulb.increaseBrightness();
Bulb.onOrOff();
System.out.println("The Bulb is turned on "+ state);
Bulb.increaseBrightness();
Bulb.increaseBrightness();
Bulb.increaseBrightness();
Bulb.decreaseBrightness();
}
}
class VaccumCleanerExecutor{
public static void main(String [] bulb){
boolean state = VaccumCleaner.onOrOff();
System.out.println(state);
VaccumCleaner.increasePower();
boolean off = VaccumCleaner.onOrOff();
System.out.println("The VaccumCleaner is turned on"+off);
VaccumCleaner.increasePower();
VaccumCleaner.onOrOff();
System.out.println("The VaccumCleaner is turned on "+ state);
VaccumCleaner.increasePower();
VaccumCleaner.increasePower();
VaccumCleaner.increasePower();
VaccumCleaner.increasePower();

VaccumCleaner.increasePower();

VaccumCleaner.increasePower();

VaccumCleaner.increasePower();

VaccumCleaner.decreasePower();
VaccumCleaner.decreasePower();
VaccumCleaner.decreasePower();
VaccumCleaner.decreasePower();
VaccumCleaner.onOrOff();
System.out.println("The VaccumCleaner is turned on"+off);
VaccumCleaner.decreasePower();

VaccumCleaner.onOrOff();
System.out.println("The VaccumCleaner is turned on "+ state);
VaccumCleaner.decreasePower();
VaccumCleaner.decreasePower();
VaccumCleaner.decreasePower();

}
}
class TrimmerExecutor{

public static void main(String [] trim){

boolean state = Trimmer.onOrOff();
System.out.println(state);
Trimmer.increasePower();
boolean off = Trimmer.onOrOff();
System.out.println("The Trimmer is turned on"+off);
Trimmer.increasePower();
Trimmer.onOrOff();
System.out.println("The Trimmer is turned on "+ state);
Trimmer.increasePower();
Trimmer.increasePower();
Trimmer.increasePower();
Trimmer.increasePower();

Trimmer.increasePower();

Trimmer.increasePower();

Trimmer.increasePower();

Trimmer.decreasePower();
Trimmer.decreasePower();
Trimmer.decreasePower();
Trimmer.decreasePower();
Trimmer.onOrOff();
System.out.println("The Trimmer is turned on"+off);
Trimmer.decreasePower();

Trimmer.onOrOff();
System.out.println("The Trimmer is turned on "+ state);
Trimmer.decreasePower();
Trimmer.decreasePower();
Trimmer.decreasePower();

}

}
class RadioExecutor{
public static void main(String [] fm){
boolean state = Radio.onOrOff();
System.out.println(state);
Radio.increaseVolume();
boolean off = Radio.onOrOff();
System.out.println("The Radio is turned on"+off);
Radio.increaseVolume();
Radio.onOrOff();
System.out.println("The Radio is turned on "+ state);
Radio.increaseVolume();
Radio.increaseVolume();
Radio.increaseVolume();
Radio.increaseVolume();

Radio.increaseVolume();

Radio.increaseVolume();

Radio.increaseVolume();

Radio.decreaseVolume();
Radio.decreaseVolume();
Radio.decreaseVolume();
Radio.decreaseVolume();
Radio.onOrOff();
System.out.println("The Radio is turned on"+off);
Radio.decreaseVolume();

Radio.onOrOff();
System.out.println("The Radio is turned on "+ state);
Radio.decreaseVolume();
Radio.decreaseVolume();
Radio.decreaseVolume();
}
}
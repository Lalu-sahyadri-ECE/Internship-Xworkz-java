class TorchExecutor{
public static void main(String [] torch){
boolean state = Torch.onOrOff();
System.out.println(state);
Torch.increaseBrightness();
boolean off = Torch.onOrOff();
System.out.println("The Torch is turned on"+off);
Torch.increaseBrightness();
Torch.onOrOff();
System.out.println("The Torch is turned on "+ state);
Torch.increaseBrightness();
Torch.increaseBrightness();
Torch.increaseBrightness();
Torch.increaseBrightness();
Torch.increaseBrightness();
Torch.decreaseBrightness();
Torch.decreaseBrightness();
Torch.decreaseBrightness();
}
}
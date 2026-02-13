class Torch{
static boolean isTurnedOn;
 static int currentBrightness ;
	static int maxBrightness  =5;
	static int minBrightness ;
static boolean onOrOff(){
if (isTurnedOn == false){
isTurnedOn = true ;
System.out.println("The Torch is turned On...");
}
else{
isTurnedOn = false ;
System.out.println("The Torch is turned Off...");}
return isTurnedOn;
}
static void increaseBrightness(){
	System.out.println("Increase Brightness is invoked..");
	System.out.println("Number of arguments is 0..");
	  if(isTurnedOn == true){
	  System.out.println("Proceed to increase Brightness");
	  if(currentBrightness  < maxBrightness ){
	  currentBrightness = currentBrightness  +1;
	  System.out.println("The current Brightness is   :"+currentBrightness );}
	  else{
	  System.out.println("Max Brightness is Reached");}}
	  else{
	  System.out.println("First Turn on the Torch..");
}
}
static void decreaseBrightness(){
	System.out.println("Decrease Brightness  is invoked..");
	System.out.println("Number of arguments is 0..");
	  if(isTurnedOn == true){
	  System.out.println("Proceed to Decrease Brightness ");
	  if(currentBrightness  > minBrightness ){
	  currentBrightness = currentBrightness  -1;
	  System.out.println("The current Brightness  is   :"+currentBrightness);}
	  else{
	  System.out.println("minimum Brightness  is Reached");}}
	  else{
	  System.out.println("First Turn on the Torch..");
}
}
}
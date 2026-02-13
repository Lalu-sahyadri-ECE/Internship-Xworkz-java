class Speaker{
	static boolean isTurnedOn;
	static int currentVolume ;
	static int maxVolume =8;
	static int minVolume;
static boolean onOrOff(){
	   if (isTurnedOn == false){
	   isTurnedOn = true ;
	   System.out.println("The Speaker is turned On...");}
	   else{
	   isTurnedOn = false ;
	   System.out.println("The Speaker is turned Off...");}
	   return isTurnedOn;
}
static void increaseVolume(){
	System.out.println("Increase volume is invoked..");
	System.out.println("Number of arguments is 0..");
	  if(isTurnedOn == true){
	  System.out.println("Proceed to increase volume");
	  if(currentVolume < maxVolume){
	  currentVolume= currentVolume +1;
	  System.out.println("The current Volume is   :"+currentVolume);}
	  else{
	  System.out.println("Max Volume is Reached");}}
	  else{
	  System.out.println("First Turn on the speaker..");
}
}
static void decreaseVolume(){
	System.out.println("Decrease volume is invoked..");
	System.out.println("Number of arguments is 0..");
	  if(isTurnedOn == true){
	  System.out.println("Proceed to Decrease volume");
	  if(currentVolume > minVolume){
	  currentVolume= currentVolume -1;
	  System.out.println("The current Volume is   :"+currentVolume);}
	  else{
	  System.out.println("minimum Volume is Reached");}}
	  else{
	  System.out.println("First Turn on the speaker..");
}
}
}
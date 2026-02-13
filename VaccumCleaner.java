class VaccumCleaner{
static boolean isTurnedOn;
static int currentPower ;
static int maxPower= 5 ;
static int minPower ;
static boolean onOrOff(){
if (isTurnedOn == false){
isTurnedOn = true ;
System.out.println("The VaccumCleaner is turned On...");
}
else{
isTurnedOn = false ;
System.out.println("The VaccumCleaner is turned Off...");}
return isTurnedOn;
}

static void increasePower(){
	System.out.println("Increase Power is invoked..");
	System.out.println("Number of arguments is 0..");
	  if(isTurnedOn == true){
	  System.out.println("Proceed to increase Power");
	  if(currentPower  < maxPower ){
	  currentPower = currentPower  +1;
	  System.out.println("The current Power is   :"+currentPower );}
	  else{
	  System.out.println("Max Power is Reached");}}
	  else{
	  System.out.println("First Turn on the VaccumCleaner..");
}
}
static void decreasePower(){
	System.out.println("Decrease Power  is invoked..");
	System.out.println("Number of arguments is 0..");
	  if(isTurnedOn == true){
	  System.out.println("Proceed to Decrease Power ");
	  if(currentPower  > minPower ){
	  currentPower = currentPower  -1;
	  System.out.println("The current Power  is   :"+currentPower);}
	  else{
	  System.out.println("minimum Power  is Reached");}}
	  else{
	  System.out.println("First Turn on the VaccumCleaner..");
}
}

}
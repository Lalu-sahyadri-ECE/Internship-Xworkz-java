class Heater{

static boolean isTurnedOn;
static int currentHeat ;
static int maxHeat = 5 ;
static int minHeat ;
static boolean onOrOff(){
if (isTurnedOn == false){
isTurnedOn = true ;
System.out.println("The Heater is turned On...");
}
else{
isTurnedOn = false ;
System.out.println("The Heater is turned Off...");}
return isTurnedOn;

}
static void increaseHeat(){
	System.out.println("Increase Heat is invoked..");
	System.out.println("Number of arguments is 0..");
	  if(isTurnedOn == true){
	  System.out.println("Proceed to increase Heat");
	  if(currentHeat  < maxHeat ){
	  currentHeat = currentHeat  +1;
	  System.out.println("The current Heat is   :"+currentHeat );}
	  else{
	  System.out.println("Max Heat is Reached");}}
	  else{
	  System.out.println("First Turn on the Heater..");
}
}
static void decreaseHeat(){
	System.out.println("Decrease Heat  is invoked..");
	System.out.println("Number of arguments is 0..");
	  if(isTurnedOn == true){
	  System.out.println("Proceed to Decrease Heat ");
	  if(currentHeat  > minHeat ){
	  currentHeat = currentHeat  -1;
	  System.out.println("The current Heat  is   :"+currentHeat);}
	  else{
	  System.out.println("minimum Heat  is Reached");}}
	  else{
	  System.out.println("First Turn on the Heater..");
}
}


}
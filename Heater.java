class Heater{

static boolean isTurnedOn;
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

}
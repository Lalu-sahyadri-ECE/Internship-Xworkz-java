class Bulb{
static boolean isTurnedOn;
static boolean onOrOff(){
if (isTurnedOn == false){
isTurnedOn = true ;
System.out.println("The Bulb is turned On...");
}
else{
isTurnedOn = false ;
System.out.println("The Bulb is turned Off...");}
return isTurnedOn;
}
}
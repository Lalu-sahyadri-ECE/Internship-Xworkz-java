class Torch{
static boolean isTurnedOn;
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
}
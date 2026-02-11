class Calculator{
static boolean isTurnedOn;
static boolean onOrOff(){
if (isTurnedOn == false){
isTurnedOn = true ;
System.out.println("The Calculator is turned On...");
}
else{
isTurnedOn = false ;
System.out.println("The Calculator is turned Off...");}
return isTurnedOn;
}
}	
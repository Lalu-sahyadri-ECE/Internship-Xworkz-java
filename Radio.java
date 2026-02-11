class Radio{
static boolean isTurnedOn;
static boolean onOrOff(){
if (isTurnedOn == false){
isTurnedOn = true ;
System.out.println("The Radio is turned On...");
}
else{
isTurnedOn = false ;
System.out.println("The Radio is turned Off...");}
return isTurnedOn;
}
}	
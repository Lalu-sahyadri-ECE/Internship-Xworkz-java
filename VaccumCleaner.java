class VaccumCleaner{
static boolean isTurnedOn;
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
}
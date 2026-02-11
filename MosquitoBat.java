class MosquitoBat{
static boolean isTurnedOn;
static boolean onOrOff(){
if (isTurnedOn == false){
isTurnedOn = true ;
System.out.println("The MosquitoBat is turned On...");
}
else{
isTurnedOn = false ;
System.out.println("The MosquitoBat is turned Off...");}
return isTurnedOn;
}
}
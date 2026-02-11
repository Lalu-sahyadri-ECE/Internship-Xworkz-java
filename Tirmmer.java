class Tirmmer{

static boolean isTurnedOn;
static boolean onOrOff(){
if (isTurnedOn == false){
isTurnedOn = true ;
System.out.println("The Tirmmer is turned On...");
}
else{
isTurnedOn = false ;
System.out.println("The Tirmmer is turned Off...");}
return isTurnedOn;

}

}
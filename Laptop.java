class Laptop{

static boolean isTurnedOn;
static boolean onOrOff(){
if (isTurnedOn == false){
isTurnedOn = true ;
System.out.println("The Laptop is turned On...");
}
else{
isTurnedOn = false ;
System.out.println("The Laptop is turned Off...");}
return isTurnedOn;

}

}
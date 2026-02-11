class SecretBox{
static boolean lockedOrUnlocked;
static boolean onOrOff(){
if (lockedOrUnlocked == false){
lockedOrUnlocked = true ;
System.out.println("The SecretBox is Locked...");
}
else{
lockedOrUnlocked = false ;
System.out.println("The SecretBox is Unlocked...");}
return lockedOrUnlocked;
}
}
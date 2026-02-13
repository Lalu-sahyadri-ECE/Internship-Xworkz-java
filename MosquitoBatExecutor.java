class MosquitoBatExecutor{
public static void main(String [] trim){
boolean state = MosquitoBat.onOrOff();
System.out.println(state);
MosquitoBat.increasePower();
boolean off = MosquitoBat.onOrOff();
System.out.println("The MosquitoBat is turned on"+off);
MosquitoBat.increasePower();
MosquitoBat.onOrOff();
System.out.println("The MosquitoBat is turned on "+ state);
MosquitoBat.increasePower();
MosquitoBat.increasePower();
MosquitoBat.increasePower();
MosquitoBat.increasePower();

MosquitoBat.increasePower();

MosquitoBat.increasePower();

MosquitoBat.increasePower();

MosquitoBat.decreasePower();
MosquitoBat.decreasePower();
MosquitoBat.decreasePower();
MosquitoBat.decreasePower();
MosquitoBat.onOrOff();
System.out.println("The MosquitoBat is turned on"+off);
MosquitoBat.decreasePower();

MosquitoBat.onOrOff();
System.out.println("The MosquitoBat is turned on "+ state);
MosquitoBat.decreasePower();
MosquitoBat.decreasePower();
MosquitoBat.decreasePower();

}
}
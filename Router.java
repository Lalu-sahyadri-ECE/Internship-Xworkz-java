class Router{
static String brandName = "TPLink";
static String model = "ArcherC6";
static int speed = 1200;
static float annualEnergyConsumption = 0.01f;
static int ports = 4;
static String installationType = "Desktop";
static String partNumber = "RT900";
static String colour = "Black";
static int voltage = 12;
static long price = 2600;

public static void main(String[] net){
/*String brandName = "TPLink";
String model = "ArcherC6";
int speed = 1200;
float annualEnergyConsumption = 0.01f;
int ports = 4;
String installationType = "Desktop";
String partNumber = "RT900";
String colour = "Black";
int voltage = 12;
long price = 2600;*/

System.out.println("The Brand name of Router is " + brandName);
System.out.println("Model number of the Router is " + model);
System.out.println("The Internet speed of the Router is " + speed + " Mbps");
System.out.println("The Annual Energy Consumption is " + annualEnergyConsumption + " kilowatt hours");
System.out.println("The number of LAN ports in Router is " + ports);
System.out.println("Installation Type is " + installationType);
System.out.println("The Part number is " + partNumber);
System.out.println("The voltage it requires to run is " + voltage + " volt");
System.out.println("The Colour of the Router is " + colour);
System.out.println("The price of the Router is " + price);
}
}

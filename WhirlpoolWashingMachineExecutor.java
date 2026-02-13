class WhirlpoolWashingMachineExecutor {

    public static void main(String[] args) {

		System.out.println("Price: Rs " + WhirlpoolWashingMachine.getPrice());
        System.out.println("Brand name: " + WhirlpoolWashingMachine.getBrand());
        System.out.println("Load capacity: " + WhirlpoolWashingMachine.getCapacity() + " kg");
        System.out.println("Machine colour: " + WhirlpoolWashingMachine.getColour());
        System.out.println("Access type: " + WhirlpoolWashingMachine.getAccessType());
        System.out.println("Operating voltage: " + WhirlpoolWashingMachine.getVoltage() + " Volts");
        System.out.println("Power consumption: " + WhirlpoolWashingMachine.getWattage() + " Watts");
        System.out.println("Number of wash cycles: " + WhirlpoolWashingMachine.getWashingCycles());
        System.out.println("Surface finish:" + WhirlpoolWashingMachine.getFinishType());
        System.out.println("Drum material:" + WhirlpoolWashingMachine.getDrumMaterial());
        System.out.println("Operation mode: " + WhirlpoolWashingMachine.getOperationMode());
    }
}

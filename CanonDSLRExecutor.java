class CanonDSLRExecutor {

    public static void main(String[] args) {

        System.out.println("Brand: " + CanonDSLR.getBrand());
        System.out.println("Model Name: " + CanonDSLR.getModelName());
        System.out.println("Resolution: " + CanonDSLR.getResolution());
        System.out.println("Sensor Type: " + CanonDSLR.getSensorType());
        System.out.println("ISO Range: " + CanonDSLR.getIsoRange());
        System.out.println("Display Size: " + CanonDSLR.getDisplaySize());
        System.out.println("Connectivity: " + CanonDSLR.getConnectivity());
        System.out.println("Battery Type: " + CanonDSLR.getBatteryType());
        System.out.println("Item Weight: " + CanonDSLR.getItemWeight() + " g");
        System.out.println("Price: Rs " + CanonDSLR.getPrice());
    }
}

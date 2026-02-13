class AirTagExecutor {

    public static void main(String[] args) {

        System.out.println("Product Name: " + AirTag.getProductName());
        System.out.println("Price: Rs " + AirTag.getPrice());

        System.out.println("Diameter: " + AirTag.getDiameter());
        System.out.println("Height: " + AirTag.getHeight());
        System.out.println("Weight: " + AirTag.getWeight() + " grams");

        System.out.println("Water and Dust Resistance: " + AirTag.getWaterResistance());

        System.out.println("Connectivity: " + AirTag.getConnectivity());
        System.out.println("Speaker: " + AirTag.getSpeaker());
        System.out.println("Battery: " + AirTag.getBattery());
        System.out.println("Sensor: " + AirTag.getSensor());

        System.out.println("Accessibility Features: " + AirTag.getAccessibility());
        System.out.println("System Requirements: " + AirTag.getSystemRequirements());
        System.out.println("In the Box: " + AirTag.getInTheBox());

        System.out.println("Release Date: " + AirTag.getReleaseDate());

        System.out.println("Manufacturer: " + AirTag.getManufacturer());
        System.out.println("Country of Origin: " + AirTag.getCountryOfOrigin());
        System.out.println("Language: " + AirTag.getLanguage());
        System.out.println("Item Model Number: " + AirTag.getItemModelNumber());
        System.out.println("Product Dimensions: " + AirTag.getProductDimensions());
        System.out.println("ASIN: " + AirTag.getAsin());
    }
}

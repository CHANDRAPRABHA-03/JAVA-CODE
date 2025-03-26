class Engine{
   public static void info(String brand, int horsepower, int cylinders, String fuelType, double displacement, boolean turbocharged, String coolingType,int torque, double weight, String transmissionType, boolean hybrid, String emissionsStandard, String country, int maxRPM, double fuelEfficiency,
  String ignitionType, int valves, String fuelInjection, double compressionRatio, String engineBlock, boolean electricMotor, String usage,String exhaustType, double cost) {
	  
System.out.println("Engine Info - Brand: " + brand + ", Horsepower: " + horsepower + " HP, Cylinders: " + cylinders + ", Fuel Type: " + fuelType + ", Displacement: " + displacement +
  " L, Turbocharged: " + (turbocharged ? "Yes" : "No") + ", Cooling Type: " + coolingType + ", Torque: " + torque + " Nm, Weight: " + weight + " kg, Transmission: " +
                           transmissionType + ", Hybrid: " + (hybrid ? "Yes" : "No") + ", Cost: $" + cost);
    }
}
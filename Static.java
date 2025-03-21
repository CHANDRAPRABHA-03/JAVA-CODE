class Syringe{
	
	
    public static void details(int quantity,String medicinename, String nursename,boolean status){
	
	System.out.println("quantity: " + quantity +   "medicine: " +medicinename +   "Nursename : " +nursename);
    System.out.println("Injection Given: " + (status ? "Yes" : "No"));
}   }
   //Tablets
   
        

   //Helmet
class Tablets{
    public static void details(String brand,String type,String colour,char size,int price){
	
	System.out.println("Brand:" + brand +  "Type:" + type + "Colour:" + colour + "Size:" + size +  "price:" + price );
}
}
//Wheel
class Wheel{
	public static void info(String brand, double diameter, String type, String material, int spokes, boolean tubeless, double weight, int maxLoad, String terrain, String color){
	System.out.println("Brand:" + brand + "Diameter:" + diameter + "Type:" + type + "Material:" + material + "spokes:" + spokes + "tubeless:" + tubeless + "weight:" + weight + "MaxLoad:" +maxLoad + "Terrain:" + terrain + "Color:" + color );
	}	
}
//Latch
class Latch{
	public static void info(String type,int price){
	System.out.println("Type:" +type + "Price" + price + "rupees");
	}
}
class Glass{
	public static void seller(String name, long phoneno, String address,int price, String type){
	System.out.println("Name:" +  name  + "Phoneno:" +  phoneno  + "Address:" +  address  + "Price:" +  price  + "Type:" + type);
    }
}
//gun
class Gun{
public static void info(String brand, String model, double caliber, double weight, int magazineCapacity, String firingMode, double price, String countryOfOrigin) {
        System.out.println("Gun Info - Brand: " + brand + ", Model: " + model + ", Caliber: " + caliber + " mm, Weight: " + weight + " kg, Magazine Capacity: " + magazineCapacity +
                           ", Firing Mode: " + firingMode + ", Price: $" + price + ", Country: " + countryOfOrigin);
    }
}
// Bullet
class Bullet{
    public static void info(String type, double caliber, double weight, String material, int velocity) {
        System.out.println("Bullet Info - Type: " + type + ", Caliber: " + caliber + " mm, Weight: " + weight + " g, Material: " + material + ", Velocity: " + velocity + " m/s");
    }
}
// Engine
class Engine{
   public static void info(String brand, int horsepower, int cylinders, String fuelType, double displacement, boolean turbocharged, String coolingType,int torque, double weight, String transmissionType, boolean hybrid, String emissionsStandard, String country, int maxRPM, double fuelEfficiency,
  String ignitionType, int valves, String fuelInjection, double compressionRatio, String engineBlock, boolean electricMotor, String usage,String exhaustType, double cost) {
	  
System.out.println("Engine Info - Brand: " + brand + ", Horsepower: " + horsepower + " HP, Cylinders: " + cylinders + ", Fuel Type: " + fuelType + ", Displacement: " + displacement +
  " L, Turbocharged: " + (turbocharged ? "Yes" : "No") + ", Cooling Type: " + coolingType + ", Torque: " + torque + " Nm, Weight: " + weight + " kg, Transmission: " +
                           transmissionType + ", Hybrid: " + (hybrid ? "Yes" : "No") + ", Cost: $" + cost);
    }
}
    // Tile 
class Tiles{
    public static void details(String material, double length, double width, double price, String finish) {
        System.out.println("Tile - Material: " + material + ", Length: " + length + " cm, Width: " + width + " cm, Price: $" + price + ", Finish: " + finish);
    }
}
// Bomb 
class Bomb{
    public static void details(String type, double weight, String explosiveMaterial, int radius, boolean remoteDetonation, int timer, String origin, double power, String category, boolean active) {
System.out.println("Bomb - Type: " + type + ", Weight: " + weight + " kg, Explosive Material: " + explosiveMaterial + ", Radius: " + radius + " meters, Remote Detonation: " + (remoteDetonation ? "Yes" : "No") + ", Timer: " + timer + " sec, Power: " + power + " TNT, Category: " + category + ", Active: " + (active ? "Yes" : "No"));
    }
}

// Key
class Key{
    public static void details(String type, String material, double price) {
        System.out.println("Key - Type: " + type + ", Material: " + material + ", Price: $" + price);
    }
}

class RocketRunner{

public static void main(String[] args) {
        Rocket rocket1 = new Rocket("Falcon 9", 500000, 25000, "White", true, 22500, "Merlin", "2022-06-01", true, "USA", 7600000, 2, "Aluminum", 70, 7, "SpaceX", "Mars", true, 70000000, true);
		
        Rocket rocket2 = new Rocket("Chandrayaan 2", 300000, 12000, "White", false, 1475, "Vikas", "2019-07-22", false, "India", 3000000, 3, "Steel", 44, 0, "ISRO", "Moon", false, 50000000, false);
		
        Rocket rocket3 = new Rocket("Soyuz", 400000, 16000, "Red", false, 2500, "RD-180", "2021-03-14", true, "Russia", 7000000, 2, "Titanium", 60, 3, "Roscosmos", "International Space Station", true, 40000000, true);
		
        System.out.println("Rocket1 Details:");
        System.out.println("Name: " + rocket1.name);
        System.out.println("Fuel Capacity: " + rocket1.fuelCapacity + " liters");
        System.out.println("Speed: " + rocket1.speed + " km/h");
        System.out.println("Color: " + rocket1.color);
        System.out.println("Reusable: " + rocket1.reusable);
        System.out.println("Payload Capacity: " + rocket1.payloadCapacity + " kg");
        System.out.println("Engine Type: " + rocket1.engineType);
        System.out.println("Launch Date: " + rocket1.launchDate);
        System.out.println("Manned: " + rocket1.isManned);
        System.out.println("Country of Origin: " + rocket1.countryOfOrigin);
        System.out.println("Thrust: " + rocket1.thrust + " N");
        System.out.println("Number of Stages: " + rocket1.numberOfStages);
        System.out.println("Material: " + rocket1.material);
        System.out.println("Height: " + rocket1.height + " m");
        System.out.println("Crew Capacity: " + rocket1.crewCapacity);
        System.out.println("Manufacturer: " + rocket1.manufacturer);
        System.out.println("Destination: " + rocket1.destination);
        System.out.println("Has Parachute: " + rocket1.hasParachute);
        System.out.println("Price: ₹" + rocket1.price);
        System.out.println("Has Landing Gear: " + rocket1.hasLandingGear);
        System.out.println();
		
		System.out.println("Rocket2 Details:");
        System.out.println("Name: " + rocket2.name);
        System.out.println("Fuel Capacity: " + rocket2.fuelCapacity + " liters");
        System.out.println("Speed: " + rocket2.speed + " km/h");
        System.out.println("Color: " + rocket2.color);
        System.out.println("Reusable: " + rocket2.reusable);
        System.out.println("Payload Capacity: " + rocket2.payloadCapacity + " kg");
        System.out.println("Engine Type: " + rocket2.engineType);
        System.out.println("Launch Date: " + rocket2.launchDate);
        System.out.println("Manned: " + rocket2.isManned);
        System.out.println("Country of Origin: " + rocket2.countryOfOrigin);
        System.out.println("Thrust: " + rocket2.thrust + " N");
        System.out.println("Number of Stages: " + rocket2.numberOfStages);
        System.out.println("Material: " + rocket2.material);
        System.out.println("Height: " + rocket2.height + " m");
        System.out.println("Crew Capacity: " + rocket2.crewCapacity);
        System.out.println("Manufacturer: " + rocket2.manufacturer);
        System.out.println("Destination: " + rocket2.destination);
        System.out.println("Has Parachute: " + rocket2.hasParachute);
        System.out.println("Price: ₹" + rocket2.price);
        System.out.println("Has Landing Gear: " + rocket2.hasLandingGear);
        System.out.println();
		
		System.out.println("Rocke3 Details:");
        System.out.println("Name: " + rocket3.name);
        System.out.println("Fuel Capacity: " + rocket3.fuelCapacity + " liters");
        System.out.println("Speed: " + rocket3.speed + " km/h");
        System.out.println("Color: " + rocket3.color);
        System.out.println("Reusable: " + rocket3.reusable);
        System.out.println("Payload Capacity: " + rocket3.payloadCapacity + " kg");
        System.out.println("Engine Type: " + rocket3.engineType);
        System.out.println("Launch Date: " + rocket3.launchDate);
        System.out.println("Manned: " + rocket3.isManned);
        System.out.println("Country of Origin: " + rocket3.countryOfOrigin);
        System.out.println("Thrust: " + rocket3.thrust + " N");
        System.out.println("Number of Stages: " + rocket3.numberOfStages);
        System.out.println("Material: " + rocket3.material);
        System.out.println("Height: " + rocket3.height + " m");
        System.out.println("Crew Capacity: " + rocket3.crewCapacity);
        System.out.println("Manufacturer: " + rocket3.manufacturer);
        System.out.println("Destination: " + rocket3.destination);
        System.out.println("Has Parachute: " + rocket3.hasParachute);
        System.out.println("Price: ₹" + rocket3.price);
        System.out.println("Has Landing Gear: " + rocket3.hasLandingGear);
      
    }
  
}
class DroneRunner {
	
    public static void main(String[] args) {
        Drone drone1 = new Drone("CHANDU","DJI", 5.5, 799, 45, true, 12, "Black", "Plastic", 5000, true, true, 4, 600, 50000, true, "Smartphone", 30, 80, true);
		
        Drone drone2 = new Drone("SHANKAR","GoPro", 3.5, 650, 30, true, 10, "White", "Aluminum", 4000, true, false, 6, 500, 30000, false, "Standard", 20, 70, false);
		
        Drone drone3 = new Drone("PARIMALA","Parrot", 6, 850, 40, false, 0, "Red", "Plastic", 4500, true, true, 4, 400, 60000, true, "Tablet", 40, 90, true);
		
		System.out.println("Drone1 Details:");
		System.out.println("ownerName: " + drone1.ownerName);
        System.out.println("Brand: " + drone1.brand);
        System.out.println("Battery Life: " + drone1.batteryLife + " hours");
        System.out.println("Weight: " + drone1.weight + " grams");
        System.out.println("Speed: " + drone1.speed + " km/h");
        System.out.println("Camera Enabled: " + drone1.cameraEnabled);
        System.out.println("Camera Resolution: " + drone1.cameraResolution + " MP");
        System.out.println("Color: " + drone1.color);
        System.out.println("Material: " + drone1.material);
        System.out.println("Range: " + drone1.range + " meters");
        System.out.println("GPS Enabled: " + drone1.gpsEnabled);
        System.out.println("Is Foldable: " + drone1.isFoldable);
        System.out.println("Number of Propellers: " + drone1.numberOfPropellers);
        System.out.println("Max Altitude: " + drone1.maxAltitude + " meters");
        System.out.println("Price: ₹" + drone1.price);
        System.out.println("Has Obstacle Avoidance: " + drone1.hasObstacleAvoidance);
        System.out.println("Remote Control Type: " + drone1.remoteControlType);
        System.out.println("Flight Time: " + drone1.flightTime + " minutes");
        System.out.println("Max Speed: " + drone1.maxSpeed + " km/h");
        System.out.println("Has Live Streaming: " + drone1.hasLiveStreaming);
        System.out.println();
		

        System.out.println("Drone2 Details:");
		System.out.println("ownerName: " + drone2.ownerName);
        System.out.println("Brand: " + drone2.brand);
        System.out.println("Battery Life: " + drone2.batteryLife + " hours");
        System.out.println("Weight: " + drone2.weight + " grams");
        System.out.println("Speed: " + drone2.speed + " km/h");
        System.out.println("Camera Enabled: " + drone2.cameraEnabled);
        System.out.println("Camera Resolution: " + drone2.cameraResolution + " MP");
        System.out.println("Color: " + drone2.color);
        System.out.println("Material: " + drone2.material);
        System.out.println("Range: " + drone2.range + " meters");
        System.out.println("GPS Enabled: " + drone2.gpsEnabled);
        System.out.println("Is Foldable: " + drone2.isFoldable);
        System.out.println("Number of Propellers: " + drone2.numberOfPropellers);
        System.out.println("Max Altitude: " + drone2.maxAltitude + " meters");
        System.out.println("Price: ₹" + drone2.price);
        System.out.println("Has Obstacle Avoidance: " + drone2.hasObstacleAvoidance);
        System.out.println("Remote Control Type: " + drone2.remoteControlType);
        System.out.println("Flight Time: " + drone2.flightTime + " minutes");
        System.out.println("Max Speed: " + drone2.maxSpeed + " km/h");
        System.out.println("Has Live Streaming: " + drone2.hasLiveStreaming);
        System.out.println();
		
		System.out.println("Drone3 Details:");
		System.out.println("ownerName: " + drone3.ownerName);
        System.out.println("Brand: " + drone3.brand);
        System.out.println("Battery Life: " + drone3.batteryLife + " hours");
        System.out.println("Weight: " + drone3.weight + " grams");
        System.out.println("Speed: " + drone3.speed + " km/h");
        System.out.println("Camera Enabled: " + drone3.cameraEnabled);
        System.out.println("Camera Resolution: " + drone3.cameraResolution + " MP");
        System.out.println("Color: " + drone3.color);
        System.out.println("Material: " + drone3.material);
        System.out.println("Range: " + drone3.range + " meters");
        System.out.println("GPS Enabled: " + drone3.gpsEnabled);
        System.out.println("Is Foldable: " + drone3.isFoldable);
        System.out.println("Number of Propellers: " + drone3.numberOfPropellers);
        System.out.println("Max Altitude: " + drone3.maxAltitude + " meters");
        System.out.println("Price: ₹" + drone3.price);
        System.out.println("Has Obstacle Avoidance: " + drone3.hasObstacleAvoidance);
        System.out.println("Remote Control Type: " + drone3.remoteControlType);
        System.out.println("Flight Time: " + drone3.flightTime + " minutes");
        System.out.println("Max Speed: " + drone3.maxSpeed + " km/h");
        System.out.println("Has Live Streaming: " + drone3.hasLiveStreaming);
        System.out.println();
    }
}

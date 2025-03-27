class Drone {
	String ownerName;
    String brand;
    double batteryLife;
    double weight;
    int speed;
    boolean cameraEnabled;
    double cameraResolution;
    String color;
    String material;
    int range;
    boolean gpsEnabled;
    boolean isFoldable;
    int numberOfPropellers;
    double maxAltitude;
    int price;
    boolean hasObstacleAvoidance;
    String remoteControlType;
    double flightTime;
    int maxSpeed;
    boolean hasLiveStreaming;

    public Drone(String ownerName,String brand, double batteryLife, double weight, int speed, boolean cameraEnabled, double cameraResolution,String color, String material, int range, boolean gpsEnabled, boolean isFoldable, int numberOfPropellers,double maxAltitude, int price, boolean hasObstacleAvoidance, String remoteControlType, double flightTime,int maxSpeed, boolean hasLiveStreaming)
	{
	    this.ownerName = ownerName;
        this.brand = brand;
        this.batteryLife = batteryLife;
        this.weight = weight;
        this.speed = speed;
        this.cameraEnabled = cameraEnabled;
        this.cameraResolution = cameraResolution;
        this.color = color;
        this.material = material;
        this.range = range;
        this.gpsEnabled = gpsEnabled;
        this.isFoldable = isFoldable;
        this.numberOfPropellers = numberOfPropellers;
        this.maxAltitude = maxAltitude;
        this.price = price;
        this.hasObstacleAvoidance = hasObstacleAvoidance;
        this.remoteControlType = remoteControlType;
        this.flightTime = flightTime;
        this.maxSpeed = maxSpeed;
        this.hasLiveStreaming = hasLiveStreaming;
    }

}
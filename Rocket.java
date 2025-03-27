class Rocket {
    String name;
    double fuelCapacity;
    int speed;
    String color;
    boolean reusable;
    int payloadCapacity;
    String engineType;
    String launchDate;
    boolean isManned;
    String countryOfOrigin;
    double thrust;
    int numberOfStages;
    String material;
    double height;
    int crewCapacity;
    String manufacturer;
    String destination;
    boolean hasParachute;
    int price;
    boolean hasLandingGear;

    public Rocket(String name, double fuelCapacity, int speed, String color, boolean reusable, int payloadCapacity,String engineType, String launchDate, boolean isManned, String countryOfOrigin, double thrust,int numberOfStages, String material, double height, int crewCapacity, String manufacturer, 
    String destination, boolean hasParachute, int price, boolean hasLandingGear) 
	{
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.speed = speed;
        this.color = color;
        this.reusable = reusable;
        this.payloadCapacity = payloadCapacity;
        this.engineType = engineType;
        this.launchDate = launchDate;
        this.isManned = isManned;
        this.countryOfOrigin = countryOfOrigin;
        this.thrust = thrust;
        this.numberOfStages = numberOfStages;
        this.material = material;
        this.height = height;
        this.crewCapacity = crewCapacity;
        this.manufacturer = manufacturer;
        this.destination = destination;
        this.hasParachute = hasParachute;
        this.price = price;
        this.hasLandingGear = hasLandingGear;
    }
}

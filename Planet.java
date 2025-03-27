class Planet {
    String name;
    double mass;
    double radius;
    String color;
    boolean hasRings;
    int numberOfMoons;
    double distanceFromSun;
    boolean habitable;
    String atmosphereType;
    String discoveryDate;
    double orbitalPeriod;
    boolean hasLife;
    double temperature;
    String surfaceType;
    double gravitationalPull;
    String satelliteType;
    boolean hasMagneticField;
    double axialTilt;
    boolean hasWater;
    String surfaceFeature;

    public Planet(String name, double mass, double radius, String color, boolean hasRings, int numberOfMoons, 
                  double distanceFromSun, boolean habitable, String atmosphereType, String discoveryDate, double orbitalPeriod,boolean hasLife, double temperature, String surfaceType, double gravitationalPull, String satelliteType,boolean hasMagneticField, double axialTilt, boolean hasWater, String surfaceFeature) 
	{
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.color = color;
        this.hasRings = hasRings;
        this.numberOfMoons = numberOfMoons;
        this.distanceFromSun = distanceFromSun;
        this.habitable = habitable;
        this.atmosphereType = atmosphereType;
        this.discoveryDate = discoveryDate;
        this.orbitalPeriod = orbitalPeriod;
        this.hasLife = hasLife;
        this.temperature = temperature;
        this.surfaceType = surfaceType;
        this.gravitationalPull = gravitationalPull;
        this.satelliteType = satelliteType;
        this.hasMagneticField = hasMagneticField;
        this.axialTilt = axialTilt;
        this.hasWater = hasWater;
        this.surfaceFeature = surfaceFeature;
    }

    
}

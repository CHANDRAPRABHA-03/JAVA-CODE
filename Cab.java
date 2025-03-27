class Cab {
    String cabType;
    String company;
    String model;
    int seatingCapacity;
    double farePerKm;
    String driverName;
    boolean isACAvailable;
    boolean hasMusicSystem;
    boolean hasGPS;
    String fuelType;
    int tripCount;
    double rating;
    boolean isAvailable;
    String color;
    int yearOfManufacture;
    boolean isLuxury;
    double bootSpace;
    boolean petFriendly;
    String licensePlate;
    boolean isElectric;

    public Cab(String cabType, String company, String model, int seatingCapacity, double farePerKm, String driverName, boolean isACAvailable, boolean hasMusicSystem, boolean hasGPS, String fuelType, int tripCount, double rating,boolean isAvailable, String color, int yearOfManufacture, boolean isLuxury, double bootSpace, boolean petFriendly,String licensePlate, boolean isElectric)
	{
        this.cabType = cabType;
        this.company = company;
        this.model = model;
        this.seatingCapacity = seatingCapacity;
        this.farePerKm = farePerKm;
        this.driverName = driverName;
        this.isACAvailable = isACAvailable;
        this.hasMusicSystem = hasMusicSystem;
        this.hasGPS = hasGPS;
        this.fuelType = fuelType;
        this.tripCount = tripCount;
        this.rating = rating;
        this.isAvailable = isAvailable;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.isLuxury = isLuxury;
        this.bootSpace = bootSpace;
        this.petFriendly = petFriendly;
        this.licensePlate = licensePlate;
        this.isElectric = isElectric;
    }
}
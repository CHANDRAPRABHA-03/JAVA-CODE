class Ak47 {
    String manufacturer;
    String countryOfOrigin;
    int yearOfManufacture;
    double weight;
    int maximumCapacity;
    boolean isAutomatic;
    double barrelLength;
    String materialUsed;
    boolean isUsedByMilitary;
    double price;

    
    public Ak47() {
    }

    public Ak47(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Ak47(String manufacturer, String countryOfOrigin) {
        this(manufacturer);
        this.countryOfOrigin = countryOfOrigin;
    }

    public Ak47(String manufacturer, String countryOfOrigin, int yearOfManufacture) {
        this(manufacturer, countryOfOrigin);
        this.yearOfManufacture = yearOfManufacture;
    }

    public Ak47(String manufacturer, String countryOfOrigin, int yearOfManufacture, double weight) {
        this(manufacturer, countryOfOrigin, yearOfManufacture);
        this.weight = weight;
    }

    public Ak47(String manufacturer, String countryOfOrigin, int yearOfManufacture, double weight, int maximumCapacity) {
        this(manufacturer, countryOfOrigin, yearOfManufacture, weight);
        this.maximumCapacity = maximumCapacity;
    }

    public Ak47(String manufacturer, String countryOfOrigin, int yearOfManufacture, double weight, int maximumCapacity, boolean isAutomatic) {
        this(manufacturer, countryOfOrigin, yearOfManufacture, weight, maximumCapacity);
        this.isAutomatic = isAutomatic;
    }

    public Ak47(String manufacturer, String countryOfOrigin, int yearOfManufacture, double weight, int maximumCapacity, boolean isAutomatic, double barrelLength) {
        this(manufacturer, countryOfOrigin, yearOfManufacture, weight, maximumCapacity, isAutomatic);
        this.barrelLength = barrelLength;
    }

    public Ak47(String manufacturer, String countryOfOrigin, int yearOfManufacture, double weight, int maximumCapacity, boolean isAutomatic, double barrelLength, String materialUsed) {
        this(manufacturer, countryOfOrigin, yearOfManufacture, weight, maximumCapacity, isAutomatic, barrelLength);
        this.materialUsed = materialUsed;
    }

    public Ak47(String manufacturer, String countryOfOrigin, int yearOfManufacture, double weight, int maximumCapacity, boolean isAutomatic, double barrelLength, String materialUsed, boolean isUsedByMilitary) {
        this(manufacturer, countryOfOrigin, yearOfManufacture, weight, maximumCapacity, isAutomatic, barrelLength, materialUsed);
        this.isUsedByMilitary = isUsedByMilitary;
    }

    public Ak47(String manufacturer, String countryOfOrigin, int yearOfManufacture, double weight, int maximumCapacity, boolean isAutomatic, double barrelLength, String materialUsed, boolean isUsedByMilitary, double price) {
        this(manufacturer, countryOfOrigin, yearOfManufacture, weight, maximumCapacity, isAutomatic, barrelLength, materialUsed, isUsedByMilitary);
        this.price = price;
    }

  
    public void info() {
        System.out.println("------AK47 Information-----");
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Country of Origin: " + this.countryOfOrigin);
        System.out.println("Year of Manufacture: " + this.yearOfManufacture);
        System.out.println("Weight: " + this.weight);
        System.out.println("maximum Capacity: " + this.maximumCapacity);
        System.out.println("Is Automatic: " + this.isAutomatic);
        System.out.println("Barrel Length: " + this.barrelLength);
        System.out.println("Material Used: " + this.materialUsed);
        System.out.println("Used by Military: " + this.isUsedByMilitary);
        System.out.println("Price: " + this.price);
    }
}

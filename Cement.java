class Cement {
    String type;
    String grade;
    double weight;
    double price;
    String manufactureDate;
    String expiryDate;
    boolean isWaterResistant;
    boolean isHighStrength;
    String manufacturer;
    String color;

    public Cement() {
    }

    public Cement(String type) {
        this.type = type;
    }

    public Cement(String type, String grade) {
        this(type);
        this.grade = grade;
    }

    public Cement(String type, String grade, double weight) {
        this(type, grade);
        this.weight = weight;
    }

    public Cement(String type, String grade, double weight, double price) {
        this(type, grade, weight);
        this.price = price;
    }

    public Cement(String type, String grade, double weight, double price, String manufactureDate) {
        this(type, grade, weight, price);
        this.manufactureDate = manufactureDate;
    }

    public Cement(String type, String grade, double weight, double price, String manufactureDate, String expiryDate) {
        this(type, grade, weight, price, manufactureDate);
        this.expiryDate = expiryDate;
    }

    public Cement(String type, String grade, double weight, double price, String manufactureDate, String expiryDate, boolean isWaterResistant) {
        this(type, grade, weight, price, manufactureDate, expiryDate);
        this.isWaterResistant = isWaterResistant;
    }

    public Cement(String type, String grade, double weight, double price, String manufactureDate, String expiryDate, boolean isWaterResistant, boolean isHighStrength) {
        this(type, grade, weight, price, manufactureDate, expiryDate, isWaterResistant);
        this.isHighStrength = isHighStrength;
    }

    public Cement(String type, String grade, double weight, double price, String manufactureDate, String expiryDate, boolean isWaterResistant, boolean isHighStrength, String manufacturer) {
        this(type, grade, weight, price, manufactureDate, expiryDate, isWaterResistant, isHighStrength);
        this.manufacturer = manufacturer;
    }

    public Cement(String type, String grade, double weight, double price, String manufactureDate, String expiryDate, boolean isWaterResistant, boolean isHighStrength, String manufacturer, double density) {
        this(type, grade, weight, price, manufactureDate, expiryDate, isWaterResistant, isHighStrength, manufacturer);
        this.color = color;
    }

    public void info() {
        System.out.println("------Cement Information-----");
        System.out.println("Type: " + this.type);
        System.out.println("Grade: " + this.grade);
        System.out.println("Weight: " + this.weight);
        System.out.println("Price: " + this.price);
        System.out.println("Manufacture Date: " + this.manufactureDate);
        System.out.println("Expiry Date: " + this.expiryDate);
        System.out.println("Water Resistant: " + this.isWaterResistant);
        System.out.println("High Strength: " + this.isHighStrength);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Color: " + this.color);
    }
}

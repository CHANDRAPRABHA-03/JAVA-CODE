class Wine {
    String name;
    String type;
    String countryOfOrigin;
    int yearOfProduction;
    double alcoholContent;
    double price;
    String grapeVariety;
    boolean isOrganic;
    double volume;
    String brand;

    
    public Wine() {
    }

    public Wine(String name) {
        this.name = name;
    }

    public Wine(String name, String type) {
        this(name);
        this.type = type;
    }

    public Wine(String name, String type, String countryOfOrigin) {
        this(name, type);
        this.countryOfOrigin = countryOfOrigin;
    }

    public Wine(String name, String type, String countryOfOrigin, int yearOfProduction) {
        this(name, type, countryOfOrigin);
        this.yearOfProduction = yearOfProduction;
    }

    public Wine(String name, String type, String countryOfOrigin, int yearOfProduction, double alcoholContent) {
        this(name, type, countryOfOrigin, yearOfProduction);
        this.alcoholContent = alcoholContent;
    }

    public Wine(String name, String type, String countryOfOrigin, int yearOfProduction, double alcoholContent, double price) {
        this(name, type, countryOfOrigin, yearOfProduction, alcoholContent);
        this.price = price;
    }

    public Wine(String name, String type, String countryOfOrigin, int yearOfProduction, double alcoholContent, double price, String grapeVariety) {
        this(name, type, countryOfOrigin, yearOfProduction, alcoholContent, price);
        this.grapeVariety = grapeVariety;
    }

    public Wine(String name, String type, String countryOfOrigin, int yearOfProduction, double alcoholContent, double price, String grapeVariety, boolean isOrganic) {
        this(name, type, countryOfOrigin, yearOfProduction, alcoholContent, price, grapeVariety);
        this.isOrganic = isOrganic;
    }

    public Wine(String name, String type, String countryOfOrigin, int yearOfProduction, double alcoholContent, double price, String grapeVariety, boolean isOrganic, double volume) {
        this(name, type, countryOfOrigin, yearOfProduction, alcoholContent, price, grapeVariety, isOrganic);
        this.volume = volume;
    }

    public Wine(String name, String type, String countryOfOrigin, int yearOfProduction, double alcoholContent, double price, String grapeVariety, boolean isOrganic, double volume, String brand) {
        this(name, type, countryOfOrigin, yearOfProduction, alcoholContent, price, grapeVariety, isOrganic, volume);
        this.brand = brand;
    }

    
    public void info() {
        System.out.println("------Wine Information-----");
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Country of Origin: " + this.countryOfOrigin);
        System.out.println("Year of Production: " + this.yearOfProduction);
        System.out.println("Alcohol Content: " + this.alcoholContent);
        System.out.println("Price: " + this.price);
        System.out.println("Grape Variety: " + this.grapeVariety);
        System.out.println("Is Organic: " + this.isOrganic);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brand: " + this.brand);
    }
}

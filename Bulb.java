class Bulb {
    String bulbType;
    int wattage;
    double length;
    int lumens;
    int colorTemperature;
    boolean isEnergyEfficient;
    String brand;
    String material;
    double price;
    int warrantyPeriod;

    
    public Bulb() 
	{
		
    }

    public Bulb(String bulbType) {
        this.bulbType = bulbType;
    }

    
    public Bulb(String bulbType, int wattage) {
        this(bulbType);
        this.wattage = wattage;
    }

    
    public Bulb(String bulbType, int wattage, double length) {
        this(bulbType, wattage);
        this.length = length;
    }

   
    public Bulb(String bulbType, int wattage, double length, int lumens) {
        this(bulbType, wattage, length);
        this.lumens = lumens;
    }

    
    public Bulb(String bulbType, int wattage, double length, int lumens, int colorTemperature) {
        this(bulbType, wattage, length, lumens);
        this.colorTemperature = colorTemperature;
    }

    
    public Bulb(String bulbType, int wattage, double length, int lumens, int colorTemperature, boolean isEnergyEfficient) {
        this(bulbType, wattage, length, lumens, colorTemperature);
        this.isEnergyEfficient = isEnergyEfficient;
    }

    
    public Bulb(String bulbType, int wattage, double length, int lumens, int colorTemperature, boolean isEnergyEfficient, String brand, String material) {
        this(bulbType, wattage, length, lumens, colorTemperature, isEnergyEfficient);
        this.brand = brand;
        this.material = material;
    }

    
    public Bulb(String bulbType, int wattage, double length, int lumens, int colorTemperature, boolean isEnergyEfficient, String brand, String material, double price, int warrantyPeriod) {
        this(bulbType, wattage, length, lumens, colorTemperature, isEnergyEfficient, brand, material);
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
    }

    
    public void info() {
        System.out.println("------Bulb Information-----");
        System.out.println("Bulb Type: " + this.bulbType);
        System.out.println("Wattage: " + this.wattage);
        System.out.println("Length (cm): " + this.length);
        System.out.println("Lumens: " + this.lumens);
        System.out.println("Color Temperature (K): " + this.colorTemperature);
        System.out.println("Energy Efficient: " + this.isEnergyEfficient);
        System.out.println("Brand: " + this.brand);
        System.out.println("Material: " + this.material);
        System.out.println("Price: " + this.price);
        System.out.println("Warranty Period (years): " + this.warrantyPeriod);
    }
}


    
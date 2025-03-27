class Tab {
    String brand;
    String model;
    double price;
    String color;
    int storage;
    boolean hasStylus;
    int batteryLife;
    String os;
    boolean supportsSim;
    float screenSize;
    int cameraMP;
    String processor;
    boolean hasKeyboardSupport;
    int ram;
    int weight;
    boolean hasFaceUnlock;
    boolean hasFingerprintSensor;
    boolean waterResistant;
    boolean fastCharging;
    int warranty;

    public Tab(String brand, String model, double price, String color, int storage, boolean hasStylus,int batteryLife, String os, boolean supportsSim, float screenSize, int cameraMP,String processor, boolean hasKeyboardSupport, int ram, int weight, boolean hasFaceUnlock, boolean hasFingerprintSensor, boolean waterResistant, boolean fastCharging, int warranty) 
	{
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.storage = storage;
        this.hasStylus = hasStylus;
        this.batteryLife = batteryLife;
        this.os = os;
        this.supportsSim = supportsSim;
        this.screenSize = screenSize;
        this.cameraMP = cameraMP;
        this.processor = processor;
        this.hasKeyboardSupport = hasKeyboardSupport;
        this.ram = ram;
        this.weight = weight;
        this.hasFaceUnlock = hasFaceUnlock;
        this.hasFingerprintSensor = hasFingerprintSensor;
        this.waterResistant = waterResistant;
        this.fastCharging = fastCharging;
        this.warranty = warranty;
    }

}

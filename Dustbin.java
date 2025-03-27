class Dustbin {
    String material;
    String color;
    double capacity;
    boolean hasLid;
    boolean isRecyclable;
    String shape;
    double height;
    double width;
    boolean odorResistant;
    String openingMechanism;
    boolean isSmartBin;
    String brand;
    boolean hasFootPedal;
    boolean fireResistant;
    int warranty;
    int weight;
    boolean UVProtected;
    boolean easyToClean;
    String usageArea;
    int price;

    public Dustbin(String material, String color, double capacity, boolean hasLid, boolean isRecyclable,String shape, double height, double width, boolean odorResistant, String openingMechanism,
    boolean isSmartBin, String brand, boolean hasFootPedal, boolean fireResistant, int warranty,
    int weight, boolean UVProtected, boolean easyToClean, String usageArea, int price) 
	{
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.hasLid = hasLid;
        this.isRecyclable = isRecyclable;
        this.shape = shape;
        this.height = height;
        this.width = width;
        this.odorResistant = odorResistant;
        this.openingMechanism = openingMechanism;
        this.isSmartBin = isSmartBin;
        this.brand = brand;
        this.hasFootPedal = hasFootPedal;
        this.fireResistant = fireResistant;
        this.warranty = warranty;
        this.weight = weight;
        this.UVProtected = UVProtected;
        this.easyToClean = easyToClean;
        this.usageArea = usageArea;
        this.price = price;
    }

}
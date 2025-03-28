class Wallet {
    String brand;
    String material;
    String color;
    double price;
    String noOfRows;
    boolean isLeather;
    boolean hasCoinPocket;
    int cardSlots;
    boolean isCustomized;
    boolean isWaterProof;

  
    public Wallet() {
    }

    public Wallet(String brand) {
        this.brand = brand;
    }

    public Wallet(String brand, String material) {
        this(brand);
        this.material = material;
    }

    public Wallet(String brand, String material, String color) {
        this(brand, material);
        this.color = color;
    }

    public Wallet(String brand, String material, String color, double price) {
        this(brand, material, color);
        this.price = price;
    }

    public Wallet(String brand, String material, String color, double price, String noOfRows) {
        this(brand, material, color, price);
        this.noOfRows = noOfRows;
    }

    public Wallet(String brand, String material, String color, double price, String noOfRows, boolean isLeather) {
        this(brand, material, color, price, noOfRows);
        this.isLeather = isLeather;
    }

    public Wallet(String brand, String material, String color, double price, String noOfRows, boolean isLeather, boolean hasCoinPocket) {
        this(brand, material, color, price, noOfRows, isLeather);
        this.hasCoinPocket = hasCoinPocket;
    }

    public Wallet(String brand, String material, String color, double price, String noOfRows, boolean isLeather, boolean hasCoinPocket, int cardSlots) {
        this(brand, material, color, price, noOfRows, isLeather, hasCoinPocket);
        this.cardSlots = cardSlots;
    }

    public Wallet(String brand, String material, String color, double price, String noOfRows, boolean isLeather, boolean hasCoinPocket, int cardSlots, boolean isCustomized) {
        this(brand, material, color, price, noOfRows, isLeather, hasCoinPocket, cardSlots);
        this.isCustomized = isCustomized;
    }

    public Wallet(String brand, String material, String color, double price, String noOfRows, boolean isLeather, boolean hasCoinPocket, int cardSlots, boolean isCustomized, boolean isWaterProof) {
        this(brand, material, color, price, noOfRows, isLeather, hasCoinPocket, cardSlots, isCustomized);
        this.isWaterProof = isWaterProof;
    }

    public void info() 
	{
        System.out.println("------Wallet Information-----");
        System.out.println("Brand: " + this.brand);
        System.out.println("Material: " + this.material);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Number of Rows: " + this.noOfRows);
        System.out.println("Is Leather: " + this.isLeather);
        System.out.println("Has Coin Pocket: " + this.hasCoinPocket);
        System.out.println("Card Slots: " + this.cardSlots);
        System.out.println("Is Customized: " + this.isCustomized);
        System.out.println("Is Waterproof: " + this.isWaterProof);
    }
}

class Diamond {
    String type;
    double weight;
    String color;
    double price;
    String origin;
    boolean isPolished;
    boolean isRare;
    double hardness;
    String use;
    String cutType;

   
    public Diamond() {
    }

    public Diamond(String type) {
        this.type = type;
    }

    public Diamond(String type, double weight) {
        this(type);
        this.weight = weight;
    }

    public Diamond(String type, double weight, String color) {
        this(type, weight);
        this.color = color;
    }

    public Diamond(String type, double weight, String color, double price) {
        this(type, weight, color);
        this.price = price;
    }

    public Diamond(String type, double weight, String color, double price, String origin) {
        this(type, weight, color, price);
        this.origin = origin;
    }

    public Diamond(String type, double weight, String color, double price, String origin, boolean isPolished) {
        this(type, weight, color, price, origin);
        this.isPolished = isPolished;
    }

    public Diamond(String type, double weight, String color, double price, String origin, boolean isPolished, boolean isRare) {
        this(type, weight, color, price, origin, isPolished);
        this.isRare = isRare;
    }

    public Diamond(String type, double weight, String color, double price, String origin, boolean isPolished, boolean isRare, double hardness) {
        this(type, weight, color, price, origin, isPolished, isRare);
        this.hardness = hardness;
    }

    public Diamond(String type, double weight, String color, double price, String origin, boolean isPolished, boolean isRare, double hardness, String use) {
        this(type, weight, color, price, origin, isPolished, isRare, hardness);
        this.use = use;
    }

    public Diamond(String type, double weight, String color, double price, String origin, boolean isPolished, boolean isRare, double hardness, String use, String cutType) {
        this(type, weight, color, price, origin, isPolished, isRare, hardness, use);
        this.cutType = cutType;
    }

    
    public void info() {
        System.out.println("------Diamond Information-----");
        System.out.println("Type: " + this.type);
        System.out.println("Weight: " + this.weight);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Origin: " + this.origin);
        System.out.println("Is Polished: " + this.isPolished);
        System.out.println("Is Rare: " + this.isRare);
        System.out.println("Hardness: " + this.hardness);
        System.out.println("Use: " + this.use);
        System.out.println("Cut Type: " + this.cutType);
    }
}

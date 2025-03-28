class Palette {
    String paletteUserName;
    String brand;
    String shape;
    int price;
    String dateOfManufacture;
    int noOfholesToMix;
    String typeOfPalette;
    boolean isLightWeight;
    boolean isBrushFree;
    String paletteShop;

    
    public Palette() {
		
	}

    public Palette(String paletteUserName) {
        this.paletteUserName = paletteUserName;
    }

    
    public Palette(String paletteUserName, String brand) {
        this(paletteUserName);
        this.brand = brand;
    }

 
    public Palette(String paletteUserName, String brand, String shape) {
        this(paletteUserName, brand);
        this.shape = shape;
    }

    
    public Palette(String paletteUserName, String brand, String shape, int price) {
        this(paletteUserName, brand, shape);
        this.price = price;
    }

    
    public Palette(String paletteUserName, String brand, String shape, int price, String dateOfManufacture) {
        this(paletteUserName, brand, shape, price);
        this.dateOfManufacture = dateOfManufacture;
    }

    
    public Palette(String paletteUserName, String brand, String shape, int price, String dateOfManufacture, int noOfholesToMix) {
        this(paletteUserName, brand, shape, price, dateOfManufacture);
        this.noOfholesToMix = noOfholesToMix;
    }

    public Palette(String paletteUserName, String brand, String shape, int price, String dateOfManufacture, int noOfholesToMix, String typeOfPalette) {
        this(paletteUserName, brand, shape, price, dateOfManufacture, noOfholesToMix);
        this.typeOfPalette = typeOfPalette;
    }

    public Palette(String paletteUserName, String brand, String shape, int price, String dateOfManufacture, int noOfholesToMix, String typeOfPalette, boolean isLightWeight) {
        this(paletteUserName, brand, shape, price, dateOfManufacture, noOfholesToMix, typeOfPalette);
        this.isLightWeight = isLightWeight;
    }

    public Palette(String paletteUserName, String brand, String shape, int price, String dateOfManufacture, int noOfholesToMix, String typeOfPalette, boolean isLightWeight, boolean isBrushFree) {
        this(paletteUserName, brand, shape, price, dateOfManufacture, noOfholesToMix, typeOfPalette, isLightWeight);
        this.isBrushFree = isBrushFree;
    }

    public Palette(String paletteUserName, String brand, String shape, int price, String dateOfManufacture, int noOfholesToMix, String typeOfPalette, boolean isLightWeight, boolean isBrushFree, String paletteShop) {
        this(paletteUserName, brand, shape, price, dateOfManufacture, noOfholesToMix, typeOfPalette, isLightWeight, isBrushFree);
        this.paletteShop = paletteShop;
    }

   
    public void info() {
        System.out.println("-------Palette Information----");
        System.out.println("Palette User: " + this.paletteUserName);
        System.out.println("Brand: " + this.brand);
        System.out.println("Shape: " + this.shape);
        System.out.println("Price: " + this.price);
        System.out.println("Date of Manufacture: " + this.dateOfManufacture);
        System.out.println("Number of Holes to Mix: " + this.noOfholesToMix);
        System.out.println("Type of Palette: " + this.typeOfPalette);
        System.out.println("Lightweight: " + this.isLightWeight);
        System.out.println("Brush Free: " + this.isBrushFree);
        System.out.println("Palette Shop: " + this.paletteShop);
    }
}


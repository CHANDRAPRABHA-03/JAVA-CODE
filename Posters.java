class Posters {
    
    String posterType;
    String artist;
    int sizeWidth; 
    int sizeHeight; 
    String material;
    boolean isFramed;
    String frameMaterial;
    double price;
    int yearCreated;
    String genre;

    
    public Posters() 
	{
        
    }

    public Posters(String posterType) {
       
        this.posterType = posterType;
    }

    
    public Posters(String posterType, String artist) {
        this(posterType);
        this.artist = artist;
    }

    
    public Posters(String posterType, String artist, int sizeWidth, int sizeHeight) {
        this(posterType, artist);
        this.sizeWidth = sizeWidth;
        this.sizeHeight = sizeHeight;
    }

    
    public Posters(String posterType, String artist, int sizeWidth, int sizeHeight, String material) {
        this(posterType, artist, sizeWidth, sizeHeight);
        this.material = material;
    }

    
    public Posters(String posterType, String artist, int sizeWidth, int sizeHeight, String material, boolean isFramed) {
        this(posterType, artist, sizeWidth, sizeHeight, material);
        this.isFramed = isFramed;
    }

   
    public Posters(String posterType, String artist, int sizeWidth, int sizeHeight, String material, boolean isFramed, String frameMaterial) {
        this(posterType, artist, sizeWidth, sizeHeight, material, isFramed);
        this.frameMaterial = frameMaterial;
    }

    
    public Posters(String posterType, String artist, int sizeWidth, int sizeHeight, String material, boolean isFramed, String frameMaterial, double price) {
        this(posterType, artist, sizeWidth, sizeHeight, material, isFramed, frameMaterial);
        this.price = price;
    }

    
    public Posters(String posterType, String artist, int sizeWidth, int sizeHeight, String material, boolean isFramed, String frameMaterial, double price, int yearCreated) {
        this(posterType, artist, sizeWidth, sizeHeight, material, isFramed, frameMaterial, price);
        this.yearCreated = yearCreated;
    }

    
    public Posters(String posterType, String artist, int sizeWidth, int sizeHeight, String material, boolean isFramed, String frameMaterial, double price, int yearCreated, String genre) {
        this(posterType, artist, sizeWidth, sizeHeight, material, isFramed, frameMaterial, price, yearCreated);
        this.genre = genre;
    }

   
    public void info() {
        System.out.println("------Poster Information-----");
        System.out.println("Poster Type: " + this.posterType);
        System.out.println("Artist: " + this.artist);
        System.out.println("Size: " + this.sizeWidth + " cm x " + this.sizeHeight + " cm");
        System.out.println("Material: " + this.material);
        System.out.println("Is Framed: " + this.isFramed);
        System.out.println("Frame Material: " + this.frameMaterial);
        System.out.println("Price: $" + this.price);
        System.out.println("Year Created: " + this.yearCreated);
        System.out.println("Genre: " + this.genre);
    }
}

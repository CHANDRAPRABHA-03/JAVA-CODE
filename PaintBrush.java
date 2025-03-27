public class PaintBrush {
    String brandName;
    String brushType;
    String bristleMaterial;
    String handleMaterial;
    double price;
    String size;
    String intendedUse; 
    String countryOfOrigin;
    int bristleCount;
    boolean isEcoFriendly;
    boolean isWaterResistant;
    String recommendedFor;
    double length; 
    double width; 
    boolean isDurable;
    String color;
    String packaging;
    boolean isReusable;
    String handleShape;
    String bristleShape;

    public PaintBrush(String brandName, String brushType, String bristleMaterial, String handleMaterial, double price,String size, String intendedUse, String countryOfOrigin, int bristleCount, boolean isEcoFriendly,
    boolean isWaterResistant, String recommendedFor, double length, double width, boolean isDurable,
    String color, String packaging, boolean isReusable, String handleShape, String bristleShape)
	{
        this.brandName = brandName;
        this.brushType = brushType;
        this.bristleMaterial = bristleMaterial;
        this.handleMaterial = handleMaterial;
        this.price = price;
        this.size = size;
        this.intendedUse = intendedUse;
        this.countryOfOrigin = countryOfOrigin;
        this.bristleCount = bristleCount;
        this.isEcoFriendly = isEcoFriendly;
        this.isWaterResistant = isWaterResistant;
        this.recommendedFor = recommendedFor;
        this.length = length;
        this.width = width;
        this.isDurable = isDurable;
        this.color = color;
        this.packaging = packaging;
        this.isReusable = isReusable;
        this.handleShape = handleShape;
        this.bristleShape = bristleShape;
    }
}

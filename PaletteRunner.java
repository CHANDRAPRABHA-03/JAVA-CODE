class PaletteRunner {
    public static void main(String[] args) {
        
        Palette palette = new Palette(); 

        Palette palette1 = new Palette("Chandra", "Faber-Castell", "Oval", 500, "12-02-2024", 6, "Wood", true, true, "Art Shop");

        Palette palette2 = new Palette("Sunset", "Winsor & Newton", "Square", 300, "15-03-2024", 12, "Plastic", false, true, "Color World");

        Palette palette3 = new Palette("Ocean Breeze", "Prismacolor", "Circular", 600, "20-01-2024", 8, "Metal", true, false, "Art Supplies");

        Palette palette4 = new Palette("Mountain Peak", "Sennelier", "Rectangle", 400, "10-11-2023", 4, "Wood", true, true, "Creative Corner");

        Palette palette5 = new Palette("Forest Green", "Liquitex", "Oval", 500, "01-12-2023", 10, "Wood", true, false, "Art Supply Co.");

        Palette palette6 = new Palette("Rainbow", "Faber-Castell", "Hexagonal", 350, "25-09-2023", 16, "Plastic", false, true, "Art Shop");

        Palette palette7 = new Palette("Sunrise", "Winsor & Newton", "Square", 200, "02-10-2024", 5, "Metal", true, true, "Art Gallery");

        Palette palette8 = new Palette("Twilight", "Prismacolor", "Oval", 450, "30-08-2024", 9, "Wood", true, true, "Canvas Store");

        Palette palette9 = new Palette("Autumn Leaves", "Sennelier", "Circular", 550, "12-05-2023", 7, "Plastic", false, true, "Art House");

        Palette palette10 = new Palette("Desert Sand", "Liquitex", "Rectangle", 600, "11-07-2024", 14, "Wood", true, false, "Creative Hub");

        
        palette.info();
        palette1.info();
        palette2.info();
        palette3.info();
        palette4.info();
        palette5.info();
        palette6.info();
        palette7.info();
        palette8.info();
        palette9.info();
        palette10.info();
    }
}
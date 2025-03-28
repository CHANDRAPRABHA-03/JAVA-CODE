public class DiamondRunner {
    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        Diamond diamond1 = new Diamond("Triangle", 1.5, "Blue", 5000.0, "South Africa", true, true, 10.0, "Jewelry", "Brilliant");
        Diamond diamond2 = new Diamond("Round", 2.0, "White", 10000.0, "India", true, false, 9.5, "Engagement", "Ideal");
        Diamond diamond3 = new Diamond("Square", 1.2, "Yellow", 7000.0, "Australia", false, true, 8.0, "Luxury", "Radiant");
        Diamond diamond4 = new Diamond("Heart", 1.8, "Pink", 15000.0, "Brazil", true, true, 10.0, "Jewelry", "Hearts & Arrows");
        Diamond diamond5 = new Diamond("Cushion", 1.6, "Green", 12000.0, "South Africa", false, false, 8.5, "Wedding", "Antique");
        Diamond diamond6 = new Diamond("Oval", 2.3, "Red", 18000.0, "Russia", true, true, 9.0, "Engagement", "Modified Brilliant");
        Diamond diamond7 = new Diamond("Princess", 1.0, "Blue", 4000.0, "Canada", true, true, 9.8, "Jewelry", "Brilliant");
        Diamond diamond8 = new Diamond("Marquise", 2.5, "White", 25000.0, "Africa", false, true, 7.5, "Luxury", "French Cut");
        Diamond diamond9 = new Diamond("Radiant", 1.3, "Pink", 9000.0, "India", true, true, 9.7, "Engagement", "Radiant");
        Diamond diamond10 = new Diamond("Emerald", 1.7, "Black", 20000.0, "Brazil", false, false, 7.8, "Jewelry", "Step Cut");
       
        diamond.info();
        diamond1.info();
        diamond2.info();
        diamond3.info();
        diamond4.info();
        diamond5.info();
        diamond6.info();
        diamond7.info();
        diamond8.info();
        diamond9.info();
        diamond10.info();
    

    }
}

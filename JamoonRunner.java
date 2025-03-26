class JamoonRunner {
    public static void main(String[] args) {
        Jamoon sweet = new Jamoon();

        System.out.println("Jamoon Type: " + sweet.type);
        System.out.println("Jamoon Shape: " + sweet.Shape);
        System.out.println("Jamoon Sugar Level: " + sweet.sugarLevel);
        System.out.println("Is Jamoon Stuffed? " + sweet.isStuffed);

        
        sweet.type = "Gulab Jamun";
        sweet.shape = "circle";
        sweet.sugarLevel = 80;
        sweet.isStuffed = true;

        System.out.println("Updated Jamoon Type: " + sweet.type);
        System.out.println("Updated Jamoon Shape: " + sweet.shape);
        System.out.println("Updated Jamoon Sugar Level: " + sweet.sugarLevel);
        System.out.println("Updated Is Jamoon Stuffed? " + sweet.isStuffed);
    }
}

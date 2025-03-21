class Towel {
    public static void main(String[] args) {
        // Initializing variables
        int cost = 100;
        int price = 200;
        cost = price;  // Re-initializing 

        double weight = 1.5;
        double mass = 2.3;
        weight = mass;

        char grade = 'A';
        char level = 'B';
        grade = level;

        boolean isAvailable = true;
        boolean status = false;
        isAvailable = status;

        float height = 5.7f;
        float length = 10.2f;
        height = length;

        byte smallNumber = 10;
        byte anotherSmall = 20;
        smallNumber = anotherSmall;

        short shortValue = 150;
        short anotherShort = 300;
        shortValue = anotherShort;

        long largeNumber = 1000000L;
        long anotherLarge = 500000L;
        largeNumber = anotherLarge;

        String name = "Alice";
        String newName = "Bob";
        name = newName; // Re-initializing String

        // Printing values after re-initialization
        System.out.println("cost: " + cost + "Rupees");
        System.out.println("weight: " + weight);
        System.out.println("grade: " + grade);
        System.out.println("isAvailable: " + isAvailable);
        System.out.println("height: " + height);
        System.out.println("smallNumber: " + smallNumber);
        System.out.println("shortValue: " + shortValue);
        System.out.println("largeNumber: " + largeNumber);
        System.out.println("name: " + name);
    }
}
class Scope {
    
    static int tax = 5;

    public static void main(String[] args) {
        int tax = 100; 
		{
			int discount =10;
			price -= discount;
			System.out.println("Price after discount:"+price");
		}

    public static void anotherMethod() {
       
        System.out.println("Tax applied: " + tax);
        
    }
}
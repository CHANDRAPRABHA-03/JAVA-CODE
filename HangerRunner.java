class HangerRunner {
    public static void main(String[] args) {
        Hanger hanger = new Hanger();

        
        System.out.println("Hanger Material: " + hanger.material);
        System.out.println("Hanger Type: " + hanger.type);
        System.out.println("Hanger Capacity: " + hanger.capacity);
        System.out.println("Hanger Price: " + hanger.price);

       
        hanger.material = "Fiber";
        hanger.type = "Clothes Hanger";
        hanger.capacity = 10;
        hanger.price = 299.99;

        
        System.out.println("Updated Hanger Material: " + hanger.material);
        System.out.println("Updated Hanger Type: " + hanger.type);
        System.out.println("Updated Hanger Capacity: " + hanger.capacity);
        System.out.println("Updated Hanger Price: " + hanger.price);
    }
}

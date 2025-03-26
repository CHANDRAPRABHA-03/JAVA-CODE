class ShirtRunner {
    public static void main(String[] args) {
        Shirt shirt = new Shirt(); 
        
        System.out.println("Shirt Brand: " + shirt.brand);
        System.out.println("Shirt Size: " + shirt.size);
        System.out.println("Shirt Color: " + shirt.color);
        System.out.println("Shirt Price: " + shirt.price);
        
        shirt.brand = "Nike";
        shirt.size = "M";
        shirt.color = "Blue";
        shirt.price = 1499.99;

        System.out.println("Updated Shirt Brand: " + shirt.brand);
        System.out.println("Updated Shirt Size: " + shirt.size);
        System.out.println("Updated Shirt Color: " + shirt.color);
        System.out.println("Updated Shirt Price: " + shirt.price);
    }
}

class SambarRunner {
    public static void main(String[] args) {
        
        String[] vegetables = Sambar.vegetables();
        System.out.println("Vegetables in the sambar:");
        for (String veg : vegetables) {
            System.out.println(veg);
          }

        int quantity = SambarQuantity.getQuantity();
        System.out.println("Vegetables Quantity: " + quantity);
       
        boolean isHot = SambarHotOrCold.HotCheck();
        System.out.println("Is Sambar Hot? " + isHot);

        
        boolean isGood = SambarGud.GoodCheck();
        System.out.println("Is Sambar Good? " + isGood);
    }
}

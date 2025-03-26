class IronBoxRunner {
    public static void main(String[] args) {
        IronBox iron = new IronBox();

       
        System.out.println("IronBox Brand: " + iron.brand);
        System.out.println("IronBox Power: " + iron.power);
        System.out.println("Is IronBox Automatic " + iron.isAutomatic);
        System.out.println("IronBox Weight: " + iron.weight);

      
        iron.brand = "Bajaj";
        iron.power = 1200;
        iron.isAutomatic = true;
        iron.weight = 1.5;

       
        System.out.println("Updated IronBox Brand: " + iron.brand);
        System.out.println("Updated IronBox Power: " + iron.power);
        System.out.println("Updated Is IronBox Automatic " + iron.isAutomatic);
        System.out.println("Updated IronBox Weight: " + iron.weight);
    }
}

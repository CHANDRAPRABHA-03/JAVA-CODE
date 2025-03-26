class AnchorRunner {
    public static void main(String[] args) {
        Anchor anchor = new Anchor(); 

       
        System.out.println("Anchor Material: " + anchor.material);
        System.out.println("Anchor Weight: " + anchor.weight);
        System.out.println("Anchor Type: " + anchor.type);
        System.out.println("Anchor Strength: " + anchor.strength);

        
        anchor.material = "Iron";
        anchor.weight = 15.5;
        anchor.type = "Marine Anchor";
        anchor.strength = 500;

        
        System.out.println("Updated Anchor Material: " + anchor.material);
        System.out.println("Updated Anchor Weight: " + anchor.weight);
        System.out.println("Updated Anchor Type: " + anchor.type);
        System.out.println("Updated Anchor Strength: " + anchor.strength);
    }
}

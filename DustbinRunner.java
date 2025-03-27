class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin1 = new Dustbin("Plastic", "Blue", 30, true, true, "Cylindrical", 60, 40,
                                       true, "Swing Lid", false, "Pigeon", true, false, 2, 5,
                                       true, true, "Kitchen", 800);

        Dustbin dustbin2 = new Dustbin("Metal", "Silver", 50, true, false, "Rectangular", 80, 50,
                                       false, "Step-On", false, "Prestige", true, true, 3, 7,
                                       true, true, "Outdoor", 1200);

        Dustbin dustbin3 = new Dustbin("Plastic", "Green", 20, false, true, "Round", 40, 30,
                                       true, "Push Button", false, "Nilkamal", false, false, 1, 4,
                                       false, true, "Office", 500);
									   
        System.out.println("-----Dustbin1 Details----- ");
        System.out.println("Dustbin1 Material: " + dustbin1.material);
        System.out.println("Dustbin1 Color: " + dustbin1.color);
        System.out.println("Dustbin1Capacity: " + dustbin1.capacity + " Liters");
        System.out.println("Dustbin1 Has Lid: " + dustbin1.hasLid);
        System.out.println("Dustbin1 Is Recyclable: " + dustbin1.isRecyclable);
        System.out.println("Dustbin1 Shape: " + dustbin1.shape);
        System.out.println("Dustbin1 Height: " + dustbin1.height + " cm");
        System.out.println("Dustbin1Width: " + dustbin1.width + " cm");
        System.out.println("Dustbin1 Odor Resistant: " + dustbin1.odorResistant);
        System.out.println("Dustbin1 Opening Mechanism: " + dustbin1.openingMechanism);
        System.out.println("Dustbin1 Smart Bin: " + dustbin1.isSmartBin);
        System.out.println("Dustbin1 Brand: " + dustbin1.brand);
        System.out.println("Dustbin1 Has Foot Pedal: " + dustbin1.hasFootPedal);
        System.out.println("Dustbin1 Fire Resistant: " + dustbin1.fireResistant);
        System.out.println("Dustbin1 Warranty: " + dustbin1.warranty + " years");
        System.out.println("Dustbin1 Weight: " + dustbin1.weight + " kg");
        System.out.println("Dustbin1 UV Protected: " + dustbin1.UVProtected);
        System.out.println("Dustbin1 Easy To Clean: " + dustbin1.easyToClean);
        System.out.println("Dustbin1 Usage Area: " + dustbin1.usageArea);
        System.out.println("Dustbin1 Price: " + dustbin1.price + " INR");
        System.out.println();
		
		System.out.println("-----Dustbin2 Details----- ");
        System.out.println("Dustbin2 Material: " + dustbin2.material);
        System.out.println("Dustbin2 Color: " + dustbin2.color);
        System.out.println("Dustbin2 Capacity: " + dustbin2.capacity + " Liters");
        System.out.println("Dustbin2 Has Lid: " + dustbin2.hasLid);
        System.out.println("Dustbin2 Is Recyclable: " + dustbin2.isRecyclable);
        System.out.println("Dustbin2 Shape: " + dustbin2.shape);
        System.out.println("Dustbin2 Height: " + dustbin2.height + " cm");
        System.out.println("Dustbin2 Width: " + dustbin2.width + " cm");
        System.out.println("Dustbin2 Odor Resistant: " + dustbin2.odorResistant);
        System.out.println("Dustbin2 Opening Mechanism: " +dustbin2.openingMechanism);
        System.out.println("Dustbin2 Smart Bin: " + dustbin2.isSmartBin);
        System.out.println("Dustbin2 Brand: " + dustbin2.brand);
        System.out.println("Dustbin2 Has Foot Pedal: " + dustbin2.hasFootPedal);
        System.out.println("Dustbin2 Fire Resistant: " + dustbin2.fireResistant);
        System.out.println("Dustbin2 Warranty: " + dustbin2.warranty + " years");
        System.out.println("Dustbin2 Weight: " + dustbin2.weight + " kg");
        System.out.println("Dustbin2 UV Protected: " + dustbin2.UVProtected);
        System.out.println("Dustbin2 Easy To Clean: " + dustbin2.easyToClean);
        System.out.println("Dustbin2 Usage Area: " + dustbin2.usageArea);
        System.out.println("Dustbin2 Price: " + dustbin2.price + " INR");
        System.out.println();
		
		System.out.println("-----Dustbin3 Details----- ");
        System.out.println("Dustbin3 Material: " + dustbin3.material);
        System.out.println("Dustbin3 Color: " + dustbin3.color);
        System.out.println("Dustbin3 Capacity: " + dustbin3.capacity + " Liters");
        System.out.println("Dustbin3 Has Lid: " + dustbin3.hasLid);
        System.out.println("Dustbin3 Is Recyclable: " + dustbin3.isRecyclable);
        System.out.println("Dustbin3 Shape: " + dustbin3.shape);
        System.out.println("Dustbin3 Height: " + dustbin3.height + " cm");
        System.out.println("Dustbin3 Width: " + dustbin3.width + " cm");
        System.out.println("Dustbin3 Odor Resistant: " + dustbin3.odorResistant);
        System.out.println("Dustbin3 Opening Mechanism: " +dustbin3.openingMechanism);
        System.out.println("Dustbin3 Smart Bin: " + dustbin3.isSmartBin);
        System.out.println("Dustbin3 Brand: " + dustbin3.brand);
        System.out.println("Dustbin3 Has Foot Pedal: " + dustbin3.hasFootPedal);
        System.out.println("Dustbin3 Fire Resistant: " + dustbin3.fireResistant);
        System.out.println("Dustbin3 Warranty: " + dustbin3.warranty + " years");
        System.out.println("Dustbin3 Weight: " + dustbin3.weight + " kg");
        System.out.println("Dustbin3 UV Protected: " + dustbin3.UVProtected);
        System.out.println("Dustbin3 Easy To Clean: " + dustbin3.easyToClean);
        System.out.println("Dustbin3 Usage Area: " + dustbin3.usageArea);
        System.out.println("Dustbin3 Price: " + dustbin3.price + " INR");
    }
}

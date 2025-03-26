class StaticRunner{
	public static void main(String[] args){
	System.out.println("Details of Syringe:");
	Syringe.details(100,"Dolo650","Dr.Urmila",true);
	Syringe.details(200,"Vitamin C","Dr.Shankarprasad",false);
	Syringe.details(450,"Collagen","Dr.Suprith",true);
	Syringe.details(150,"Paracetamol","Dr.Manoj",true);
	Syringe.details(310,"Dolophar","Dr.uma",false);
	System.out.println("----------------------------------");
	    
        Tablet.tablet = new Tablet();
        tablet.dissolve(0.5, 25);  
        tablet.cure("Headache");   
        tablet.killThePain(7);     
        tablet.react("Dizziness"); 
        tablet.dissolve(1.0, 37);  
        tablet.cure("Cold");       
        tablet.killThePain(5);    
        tablet.react("Nausea");   
        tablet.dissolve(0.8, 30);  
        tablet.cure("Stomach Ache"); 
        tablet.killThePain(8);     
        tablet.react("Fatigue");   
        tablet.cure("Fever");      
        tablet.killThePain(6);     
        tablet.react("Rash");      
        tablet.dissolve(0.3, 20);  
        tablet.dissolve(0.6, 22);  
        tablet.cure("Back Pain"); 
        tablet.killThePain(9);     
        tablet.react("Headache"); 
  
	System.out.println("Details of Helmet:");
	Tablets.details("Thunder", "Gents","Red",'M',2500);
	Tablets.details("Chrome","Gents","Black",'M',2390);
	Tablets.details("Scorpion","Ladies","Pink",'S',1900);
	Tablets.details("Bravo","Ladies","Pink",'M',1800);
	Tablets.details("Jade","Gents","Yellow",'L',2300);
	System.out.println("----------------------------------");
	Wheel.info("Michelin", 18, "Radial", "Rubber", 36, true, 7.5,500, "All-Terrain","Black");
	Wheel.info("Michelin", 120, "Radial", "Rubber", 46, false, 9.5,560, "Terrain","Black");
	Wheel.info("Michelin", 148, "Radial", "Rubber", 16, true, 8.0,670, "All-Terrain","Black");
	Wheel.info("Michelin", 158,  "Radial", "Rubber", 89, true, 7.5,760, "All-Terrain","Black");
	Wheel.info("Michelin", 17,  "Radial", "Rubber", 15, false, 5.6,900, "All-Terrain","Black");
	
	
	System.out.println("----------------------------------");
	
	Latch.info("Deadbolt", 250);
	Latch.info("Spring Latch " ,1200);
    Latch.info("Chain Latch",800);
    Latch.info("Slide Bolt Latch",1000);
    Latch.info("Cam Latch",500);
	System.out.println("------------------------------");
	Glass.seller("John", 659869867, "Mysuru", 10000, "Bromo");
	Glass.seller("Deo", 567458739, "Bengaluru", 7000, "Diamond");
	Glass.seller("Pinkpanther", 98988777, "Bengaluru", 9980, "Quadra");
	Glass.seller("Bheem", 576869879, "Mangaluru", 8789, "Wave");
	Glass.seller("Deeshitha", 87989908, "Mangaluru", 5676, "Clear");
	System.out.println("----------------------------------");
	Gun.info("Glock", "G19", 9.0, 0.9, 15, "Semi-Auto", 499.99, "Austria");
	
	System.out.println("----------------------------------");
	
    Bullet.info("FMJ", 9.0, 7.5, "Brass", 1200);
	Bullet.info("Hollow Point ", 7.0, 8.5, "Brass", 1270);
	Bullet.info("Armor-Piercing", 8.0, 4.5, "Brass", 2890);
	Bullet.info("Tracer Bullet", 9.0, 7.5, "Brass", 2200);
	Bullet.info("Soft Point", 3.8, 5.7, "Brass", 2298);
	System.out.println("----------------------------------");
	
    Engine.info("Honda", 200, 6, "Petrol", 2.0, true, "Water", 300, 150, "Automatic", false, "EURO 6", "Japan", 7000, 25.5, "Electronic", 24, "Direct Injection", 10.5, "Aluminum", true, "Automotive", "Single", 3500);
	Engine.info("Honda", 200, 6, "Petrol", 2.0, true, "Water", 300, 150, "Automatic", false, "EURO 6", "Japan", 7000, 25.5, "Electronic", 24, "Direct Injection", 10.5, "Aluminum", true, "Automotive", "Single", 3500);
        
    Engine.info("Toyota", 150, 4, "Diesel", 1.8, false, "Air", 250, 140, "Manual", false, "BS6", "USA", 6500, 20.0, "Spark", 16, "MPFI", 9.5, "Iron", false, "Passenger", "Inline", 2800);

    Engine.info("Tesla", 400, 0, "Electric", 0.0, false, "Liquid", 500, 180, "Single Speed", true, "Zero Emission", "USA", 5000, 40.0, "Digital", 0, "Battery-Powered", 0.0, "Aluminum", false, "EV", "Dual Motor", 50000);

    Engine.info("BMW", 250, 8, "Petrol", 3.0, true, "Water", 450, 160, "Automatic", false, "EURO 5", "Germany", 7500, 22.0, "Electronic", 32, "Direct Injection", 11.0, "Magnesium", true, "Luxury", "V8", 7000);
	System.out.println("----------------------------------");
	
    Tiles.details("Ceramic", 60, 60, 3.99, "Glossy");
	Tiles.details("Granite", 80, 30, 7.99, "Glossy");
	Tiles.details("Marble", 50, 40, 5.99, "Matte");
	Tiles.details("Slate", 60,60, 9.99, "Textured");
    Tiles.details("Terracotta", 48,45, 6.25, "Matte");
	System.out.println("----------------------------------");
	
    Bomb.details("C4", 2.5, "RDX", 10, true, 30, "USA", 1.5, "Military", false);
	Bomb.details("Dynamite", 1.2, "Nitroglycerin", 5, false, 20, "Russia", 2.0, "Civilian", true);
	Bomb.details("Grenade", 0.5, "TNT", 7, false, 10, "China", 1.0, "Military", false);
	Bomb.details("Molotov", 1.0, "Gasoline", 3, true, 15, "Mexico", 0.8, "Civilian", true);
    Bomb.details("Plastic Explosive", 3.0, "PETN", 15, true, 40, "Germany", 0.5, "Military", true);

	System.out.println("----------------------------------");
    Key.details("House Key", "Steel", 2.99);
	Key.details("Office Key", "Steel", 899);
	Key.details("House Key", "Bronze", 279);
	Key.details("Fridge Key", "Steel", 458);
	Key.details("Door Key", "Gold", 789);
	}
}
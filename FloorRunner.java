class FloorRunner {   
    public static void main(String[]args) {       
    Floor floor = new Floor(); 
	System.out.println("Floor number: " + floor.number);     
	System.out.println("Floor Material: " + floor.material);
	System.out.println("Floor Area: " + floor.area);        
	System.out.println("Floor Is Tiled: " + floor.isTiled);   
	floor.number = 6;       
    floor.material = "Granite";         
	floor.area = 250.5; 
	floor.isTiled = true;     
	System.out.println("Updated Floor number: " + floor.number);   
	System.out.println("Updated Material: " + floor.material);   
	System.out.println("Updated Area: " + floor.area);   
	System.out.println("Updated Is Tiled: " + floor.isTiled);}}
}
}
class Bed1Runner{

public static void main(String[] args){
	
	Bed1 bed = new Bed1();
	
    System.out.println("Bed1 Type : "+bed.type);
	System.out.println("Bed1 Material: " +bed.material);
	System.out.println("Bed1 price : "+bed.price);
	System.out.println("Bed1 colour: " +bed.colour);
	bed.type = " King";
	bed.material = " Cotton";
	bed.price = 10000;
	bed.colour = "Red";
	System.out.println("Updated Bed1 Type : "+bed.type);
	System.out.println("Updated Bed1 Material: " +bed.material);
	System.out.println("Updated Bed1 price : "+bed.price);
	System.out.println("Updated Bed1 colour: " +bed.colour);
	
}
}
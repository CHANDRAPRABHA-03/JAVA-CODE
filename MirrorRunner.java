class MirrorRunner{

public static void main(String[] args){
	
	Mirror mirror = new Mirror("White","Washroom",150,"Rectangle",true,true,
	"CPV",'M',6.7d,5.8d,true,"Plane","Silver",4.9f,"Karnataka",false,"rare","WipeWithPaper",24,20);
	
	System.out.println("Mirror Details:");
	System.out.println("Mirror Color : " +mirror.color);
    System.out.println("Mirror Used place : " + mirror.placeOfUse);
	System.out.println("Mirror price :" + mirror.price);
	System.out.println("Mirror Shape :" + mirror.shape);
	System.out.println("Mirror is Fogfree ? :" + mirror.fogFree);
	System.out.println("Mirror is waterResistance ? :" + mirror.waterResistance);
	System.out.println("Mirror Brand :" + mirror.brand);
	System.out.println("Mirror Size:" + mirror.size + "inch");
	System.out.println("Mirror Height :" + mirror.height+ "cm");
	System.out.println("Mirror Width:" + mirror.width);
	System.out.println("Mirror is lightWeight ?:" + mirror.lightWeight);
    System.out.println("Mirror is typeOfGlass ? :" + mirror.typeOfGlass);
    System.out.println("Mirror is Framedesign:" + mirror.frameDesign);
	System.out.println("Mirror glass type: " + mirror.typeOfGlass);
    System.out.println("Mirror  rating:" + mirror.rating);
	System.out.println("Mirror Manufactured State :" + mirror.manufacturingState);
	System.out.println("Mirror is Scratch Resistance ? :" + mirror.isScratchResistant);
	System.out.println("Mirror Reflection Type:" + mirror.typeOfReflection);
    System.out.println("Mirror Cleaning Method : " + mirror.cleaningMethod);
	System.out.println("Mirror Warranty	:" + mirror.warrantyPeriod +"months");
	System.out.println("Mirror Discount :" + mirror.discount +"%" );
	System.out.println();
	
	Mirror mirror1 = new Mirror("Brown","Hall",300,"Oval",false,true,
	"shringar",'L',9.0d,6.7d,true,"Plane","Gold",7.9f,"TamilNadu",
	true,"rare","WipeWithCloth",27,30);
	
	System.out.println("-------Updated Mirror1 Details-------");
	System.out.println("Mirror Color : " +mirror1.color);
    System.out.println("Mirror Used place : " + mirror1.placeOfUse);
	System.out.println("Mirror price :" + mirror1.price);
	System.out.println("Mirror Shape :" + mirror1.shape);
	System.out.println("Mirror is Fogfree ? :" + mirror1.fogFree);
	System.out.println("Mirror is waterResistance ? :" + mirror1.waterResistance);
	System.out.println("Mirror Brand :" + mirror1.brand);
	System.out.println("Mirror Size:" + mirror1.size + "inch");
	System.out.println("Mirror Height :" + mirror1.height+ "cm");
	System.out.println("Mirror Width:" + mirror1.width);
	System.out.println("Mirror is lightWeight ?:" + mirror1.lightWeight);
    System.out.println("Mirror is typeOfGlass ? :" + mirror1.typeOfGlass);
    System.out.println("Mirror is Framedesign:" + mirror1.frameDesign);
	System.out.println("Mirror glass type: " + mirror1.typeOfGlass);
    System.out.println("Mirror  rating:" + mirror1.rating);
	System.out.println("Mirror Manufactured State :" + mirror1.manufacturingState);
	System.out.println("Mirror is Scratch Resistance ? :" + mirror1.isScratchResistant);
	System.out.println("Mirror Reflection Type:" + mirror1.typeOfReflection);
    System.out.println("Mirror Cleaning Method : " + mirror1.cleaningMethod);
	System.out.println("Mirror Warranty	:" + mirror1.warrantyPeriod +"months");
	System.out.println("Mirror Discount :" + mirror1.discount +"%" );
    System.out.println();
    Mirror mirror2 = new Mirror("Pink","Hall",500,"Pebble Wall",false,true,
	"Ikea",'L',4.0d,5.7d,true,"Plane","Grey",5.9f,"Delhi",
	true,"rare","WipeWithCloth",21,60);
	
	System.out.println("-------Mirror2 Details:--------");
	System.out.println("Mirror Color : " +mirror2.color);
    System.out.println("Mirror Used place : " + mirror2.placeOfUse);
	System.out.println("Mirror price :" + mirror2.price);
	System.out.println("Mirror Shape :" + mirror2.shape);
	System.out.println("Mirror is Fogfree ? :" + mirror2.fogFree);
	System.out.println("Mirror is waterResistance ? :" + mirror2.waterResistance);
	System.out.println("Mirror Brand :" + mirror2.brand);
	System.out.println("Mirror Size:" + mirror2.size + "inch");
	System.out.println("Mirror Height :" + mirror2.height+ "cm");
	System.out.println("Mirror Width:" + mirror2.width);
	System.out.println("Mirror is lightWeight ?:" + mirror2.lightWeight);
    System.out.println("Mirror is typeOfGlass ? :" + mirror2.typeOfGlass);
    System.out.println("Mirror is Framedesign:" + mirror2.frameDesign);
	System.out.println("Mirror glass type: " + mirror2.typeOfGlass);
    System.out.println("Mirror  rating:" + mirror2.rating);
	System.out.println("Mirror Manufactured State :" + mirror2.manufacturingState);
	System.out.println("Mirror is Scratch Resistance ? :" + mirror2.isScratchResistant);
	System.out.println("Mirror Reflection Type:" + mirror2.typeOfReflection);
    System.out.println("Mirror Cleaning Method : " + mirror2.cleaningMethod);
	System.out.println("Mirror Warranty	:" + mirror2.warrantyPeriod +"months");
	System.out.println("Mirror Discount :" + mirror2.discount +"%" );
	
}
}
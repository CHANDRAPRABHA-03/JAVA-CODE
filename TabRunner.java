class TabRunner {
    public static void main(String[] args) {
	
        Tab tab1 = new Tab("Samsung", "Galaxy Tab S8", 65000, "Black", 128, true, 12,"Android",
		true,11.0f, 13, "Snapdragon 888", true, 8, 420, true, true, false, true, 2);

        Tab tab2 = new Tab("Apple", "iPad Pro", 85000, "Silver", 256, false, 10, "iPadOS",
		false,12.9f, 12, "M1 Chip", true, 8, 500, true, true, true, true, 2);

        Tab tab3 = new Tab("Lenovo", "Tab P11", 35000, "Gray", 64, false, 15, "Android", 
		true,
        11.5f, 8, "MediaTek", false, 4, 480, false, true, false, false, 1);
						   
		System.out.println("--------Tab1 Details-------- ");
        System.out.println("Brand: " + tab1.brand);
        System.out.println("Model: " + tab1.model);
        System.out.println("Price: " + tab1.price);
        System.out.println("Color: " + tab1.color);
        System.out.println("Storage: " + tab1.storage + "GB");
        System.out.println("Battery Life: " + tab1.batteryLife + " Hours");
        System.out.println("OS: " + tab1.os);
        System.out.println("Supports SIM: " + tab1.supportsSim);
        System.out.println("Screen Size: " + tab1.screenSize + " inches");
        System.out.println("Camera: " + tab1.cameraMP + " MP");
        System.out.println("Processor: " + tab1.processor);
        System.out.println("RAM: " + tab1.ram + "GB");
        System.out.println("Weight: " + tab1.weight + "kg");
        System.out.println("Face Unlock: " + tab1.hasFaceUnlock);
        System.out.println("Fingerprint Sensor: " + tab1.hasFingerprintSensor);
        System.out.println("Water Resistant: " + tab1.waterResistant);
        System.out.println("Fast Charging: " + tab1.fastCharging);
        System.out.println("Warranty: " + tab1.warranty + " years");
        System.out.println();
  
        System.out.println("---------Tab2 Details--------- ");
        System.out.println("Brand: " + tab2.brand);
        System.out.println("Model: " + tab2.model);
        System.out.println("Price: " + tab2.price);
        System.out.println("Color: " + tab2.color);
        System.out.println("Storage: " + tab2.storage + "GB");
        System.out.println("Battery Life: " + tab2.batteryLife + " Hours");
        System.out.println("OS: " + tab2.os);
        System.out.println("Supports SIM: " + tab2.supportsSim);
        System.out.println("Screen Size: " + tab2.screenSize + " inches");
        System.out.println("Camera: " + tab2.cameraMP + " MP");
        System.out.println("Processor: " + tab2.processor);
        System.out.println("RAM: " + tab2.ram + "GB");
        System.out.println("Weight: " + tab2.weight + "kg");
        System.out.println("Face Unlock: " + tab2.hasFaceUnlock);
        System.out.println("Fingerprint Sensor: " + tab2.hasFingerprintSensor);
        System.out.println("Water Resistant: " + tab2.waterResistant);
        System.out.println("Fast Charging: " + tab2.fastCharging);
        System.out.println("Warranty: " + tab2.warranty + " years");
        System.out.println();
		
		System.out.println("-------Tab3 Details-------- ");
        System.out.println("Brand: " + tab3.brand);
        System.out.println("Model: " + tab3.model);
        System.out.println("Price: " + tab3.price);
        System.out.println("Color: " + tab3.color);
        System.out.println("Storage: " + tab3.storage + "GB");
        System.out.println("Battery Life: " + tab3.batteryLife + " Hours");
        System.out.println("OS: " + tab3.os);
        System.out.println("Supports SIM: " + tab3.supportsSim);
        System.out.println("Screen Size: " + tab3.screenSize + " inches");
        System.out.println("Camera: " + tab3.cameraMP + " MP");
        System.out.println("Processor: " + tab3.processor);
        System.out.println("RAM: " + tab3.ram + "GB");
        System.out.println("Weight: " + tab3.weight + "kg");
        System.out.println("Face Unlock: " + tab3.hasFaceUnlock);
        System.out.println("Fingerprint Sensor: " + tab3.hasFingerprintSensor);
        System.out.println("Water Resistant: " + tab3.waterResistant);
        System.out.println("Fast Charging: " + tab3.fastCharging);
        System.out.println("Warranty: " + tab3.warranty + " years");
        System.out.println();
    }
}
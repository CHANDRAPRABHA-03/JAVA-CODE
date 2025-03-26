class ProductSearch {
    
    static double getPriceByProduct(String productName) { 
        System.out.println("Running getPriceByProduct: " + productName);

        if (productName.equals("Laptop")) {
            return 80000.00;
        } else if (productName.equals("Smartphone")) {
            return 40000.00;
        } else if (productName.equals("Washing Machine")) {
            return 25000.00;
        } else if (productName.equals("Refrigerator")) {
            return 35000.00;
        } else if (productName.equals("Headphones")) {
            return 5000.00;
        } else if (productName.equals("Tablet")) {
            return 25000.00;
        } else if (productName.equals("Smartwatch")) {
            return 10000.00;
        } else if (productName.equals("TV")) {
            return 60000.00;
        } else if (productName.equals("Air Conditioner")) {
            return 45000.00;
        } else if (productName.equals("Microwave")) {
            return 15000.00;
        } else if (productName.equals("Blender")) {
            return 3000.00;
        } else if (productName.equals("Camera")) {
            return 35000.00;
        } else if (productName.equals("Printer")) {
            return 8000.00;
        } else if (productName.equals("Speaker")) {
            return 7000.00;
        } else if (productName.equals("Electric Kettle")) {
            return 2500.00;
        } else if (productName.equals("Hair Dryer")) {
            return 1500.00;
        } else if (productName.equals("Vacuum Cleaner")) {
            return 12000.00;
        } else if (productName.equals("Refrigerator")) {
            return 30000.00;
        } else if (productName.equals("Oven")) {
            return 20000.00;
        } else if (productName.equals("Gaming Console")) {
            return 35000.00;
        } else if (productName.equals("Smart Speaker")) {
            return 4000.00;
        } else if (productName.equals("Laptop Stand")) {
            return 1500.00;
        } else {
            System.out.println("No price found for the product");
            return 0;
        }
    }


    static String[] getBrandsByProduct(String productName) { 
        System.out.println("Running getBrandsByProduct: " + productName);

        if (productName.equals("Laptop")) {
            return new String[]{"Dell", "HP", "Lenovo", "Asus", "Apple"};
        } else if (productName.equals("Smartphone")) {
            return new String[]{"Samsung", "Apple", "OnePlus", "Xiaomi", "Realme"};
        } else if (productName.equals("Washing Machine")) {
            return new String[]{"LG", "Samsung", "Bosch", "Whirlpool", "IFB"};
        } else if (productName.equals("Refrigerator")) {
            return new String[]{"Samsung", "LG", "Whirlpool", "Godrej", "Haier"};
        } else if (productName.equals("Headphones")) {
            return new String[]{"Sony", "Bose", "Sennheiser", "JBL", "Skullcandy"};
        } else if (productName.equals("Tablet")) {
            return new String[]{"Apple", "Samsung", "Lenovo", "Microsoft", "Huawei"};
        } else if (productName.equals("Smartwatch")) {
            return new String[]{"Apple", "Samsung", "Garmin", "Fossil", "Fitbit"};
        } else if (productName.equals("TV")) {
            return new String[]{"Samsung", "LG", "Sony", "Panasonic", "TCL"};
        } else if (productName.equals("Air Conditioner")) {
            return new String[]{"LG", "Samsung", "Daikin", "Voltas", "Blue Star"};
        } else if (productName.equals("Microwave")) {
            return new String[]{"Samsung", "LG", "Whirlpool", "Bosch", "Panasonic"};
        } else if (productName.equals("Blender")) {
            return new String[]{"Philips", "Bosch", "Kenwood", "Maharaja", "Bajaj"};
        } else if (productName.equals("Camera")) {
            return new String[]{"Canon", "Nikon", "Sony", "Fujifilm", "Panasonic"};
        } else if (productName.equals("Printer")) {
            return new String[]{"HP", "Canon", "Epson", "Brother", "Samsung"};
        } else if (productName.equals("Speaker")) {
            return new String[]{"Bose", "Sony", "JBL", "Harman Kardon", "UE"};
        } else if (productName.equals("Electric Kettle")) {
            return new String[]{"Philips", "Prestige", "Bajaj", "Pigeon", "Orpat"};
        } else if (productName.equals("Hair Dryer")) {
            return new String[]{"Philips", "Vega", "Panasonic", "Babyliss", "Remington"};
        } else if (productName.equals("Vacuum Cleaner")) {
            return new String[]{"Dyson", "Philips", "Samsung", "Bosch", "Karcher"};
        } else if (productName.equals("Oven")) {
            return new String[]{"Samsung", "LG", "Bosch", "Whirlpool", "Sharp"};
        } else if (productName.equals("Gaming Console")) {
            return new String[]{"Sony", "Microsoft", "Nintendo", "Valve", "Razer"};
        } else if (productName.equals("Smart Speaker")) {
            return new String[]{"Amazon", "Google", "Apple", "Sonos", "Bose"};
        } else if (productName.equals("Laptop Stand")) {
            return new String[]{"Rain Design", "Twelve South", "ErgoFoam", "MOFT", "Lamicall"};
        } else if (productName.equals("Projector")) {
            return new String[]{"Epson", "BenQ", "Optoma", "ViewSonic", "LG"};
        } else if (productName.equals("Smartphone Accessories")) {
            return new String[]{"Anker", "Spigen", "OtterBox", "Belkin", "Mophie"};
        } else if (productName.equals("Smart TV Stick")) {
            return new String[]{"Amazon", "Google", "Roku", "Xiaomi", "Apple"};
        } else if (productName.equals("Gamepad")) {
            return new String[]{"Logitech", "Microsoft", "Razer", "Sony", "Thrustmaster"};
        } else if (productName.equals("External Hard Drive")) {
            return new String[]{"Seagate", "Western Digital", "Samsung", "Toshiba", "ADATA"};
        } else if (productName.equals("Router")) {
            return new String[]{"TP-Link", "Netgear", "D-Link", "Linksys", "Asus"};
        } else if (productName.equals("Car Dashboard Camera")) {
            return new String[]{"BlackVue", "Nextbase", "Garmin", "Thinkware", "Viofo"};
        } else {
            System.out.println("No brands found for the product");
            return new String[0];
        }
    }


    static void searchProductAvailability(String productName) { 
        System.out.println("Running searchProductAvailability: " + productName);

        if (productName.equals("Laptop")) {
            System.out.println("Laptop is available in stock");
        } else if (productName.equals("Smartphone")) {
            System.out.println("Smartphone is available in stock");
        } else if (productName.equals("Washing Machine")) {
            System.out.println("Washing Machine is available in stock");
        } else if (productName.equals("Refrigerator")) {
            System.out.println("Refrigerator is available in stock");
        } else if (productName.equals("Headphones")) {
            System.out.println("Headphones are available in stock");
        } else if (productName.equals("Tablet")) {
            System.out.println("Tablet is available in stock");
        } else if (productName.equals("Smartwatch")) {
            System.out.println("Smartwatch is available in stock");
        } else if (productName.equals("TV")) {
            System.out.println("TV is available in stock");
        } else if (productName.equals("Air Conditioner")) {
            System.out.println("Air Conditioner is available in stock");
        } else if (productName.equals("Microwave")) {
            System.out.println("Microwave is available in stock");
        } else if (productName.equals("Blender")) {
            System.out.println("Blender is available in stock");
        } else if (productName.equals("Camera")) {
            System.out.println("Camera is available in stock");
        } else if (productName.equals("Printer")) {
            System.out.println("Printer is available in stock");
        } else if (productName.equals("Speaker")) {
            System.out.println("Speaker is available in stock");
        } else if (productName.equals("Electric Kettle")) {
            System.out.println("Electric Kettle is available in stock");
        } else if (productName.equals("Hair Dryer")) {
            System.out.println("Hair Dryer is available in stock");
        } else if (productName.equals("Vacuum Cleaner")) {
            System.out.println("Vacuum Cleaner is available in stock");
        } else if (productName.equals("Oven")) {
            System.out.println("Oven is available in stock");
        } else if (productName.equals("Gaming Console")) {
            System.out.println("Gaming Console is available in stock");
        } else if (productName.equals("Smart Speaker")) {
            System.out.println("Smart Speaker is available in stock");
        } else if (productName.equals("Laptop Stand")) {
            System.out.println("Laptop Stand is available in stock");
        } else if (productName.equals("Projector")) {
            System.out.println("Projector is available in stock");
        } else if (productName.equals("Smartphone Accessories")) {
            System.out.println("Smartphone Accessories are available in stock");
        } else if (productName.equals("Gamepad")) {
            System.out.println("Gamepad is available in stock");
        } else if (productName.equals("External Hard Drive")) {
            System.out.println("External Hard Drive is available in stock");
        } else if (productName.equals("Router")) {
            System.out.println("Router is available in stock");
        } else if (productName.equals("Car Dashboard Camera")) {
            System.out.println("Car Dashboard Camera is available in stock");
        } else {
            System.out.println("Product is not available in stock");
        }
    }
}


class ContactSearchRunner {
    public static void main(String[] args) {
        String email = "priyakapoor@gmail.com";
        long mobile = ContactSearch.getMobileByEmail(email);
        System.out.println("Mobile Number: " + mobile);
		
        long mobile = getMobileByEmail("lavanya.kapoor@gmail.com");
        System.out.println("Mobile: " + mobile);
		
        String email = getEmailByName("Lavanya Kapoor");
        System.out.println("Email: " + email);

        String[] searchResults = searchByLastName("Kapoor");
        System.out.println("Search Results:");
        for (String name : searchResults) {
		System.out.println(name);
		}

        email = "pooja.sharma@gmail.com";
        mobile = ContactSearch.getMobileByEmail(email);
        System.out.println("Mobile Number: " + mobile);

        email = "unknown@gmail.com";
        mobile = ContactSearch.getMobileByEmail(email);
        System.out.println("Mobile Number: " + mobile);

        String name = "RaviKapoor";
        String emailByName = ContactSearch.getEmailByName(name);
        System.out.println("Email: " + emailByName);

        name = "Unknown Name";
        emailByName = ContactSearch.getEmailByName(name);
        System.out.println("Email: " + emailByName);

        String[] kapoors = ContactSearch.searchByLastName("Kapoor");
        System.out.println("Kapoor Family:");
        for (String person : kapoors) 
		{
            System.out.println(person);
        }

        String[] sharmas = ContactSearch.searchByLastName("Sharma");
        System.out.println("Sharma Family:");
        for (String person : sharmas) 
		{
            System.out.println(person);
        }

        String[] shettys = ContactSearch.searchByLastName("Shetty");
        System.out.println("Shetty Family:");
        for (String person : shettys) 
		{
            System.out.println(person);
        }
		
        String productName = "Laptop";
        double price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Smartphone";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Unknown Product";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Washing Machine";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Refrigerator";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Headphones";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Tablet";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Smartwatch";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "TV";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Air Conditioner";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Microwave";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Blender";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Camera";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Printer";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Speaker";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Electric Kettle";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Hair Dryer";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Vacuum Cleaner";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Oven";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Gaming Console";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Smart Speaker";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);

        productName = "Laptop Stand";
        price = ProductSearch.getPriceByProduct(productName);
        System.out.println("Price of " + productName + ": " + price);
 

        String productName = "Laptop";
        String[] brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Smartphone";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Unknown Product";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + (brands.length > 0 ? String.join(", ", brands) : "No brands found"));

        productName = "Washing Machine";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Refrigerator";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Headphones";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Tablet";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Smartwatch";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "TV";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Air Conditioner";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Microwave";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Blender";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Camera";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Printer";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Speaker";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Electric Kettle";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Hair Dryer";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Vacuum Cleaner";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Oven";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Gaming Console";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Smart Speaker";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));

        productName = "Laptop Stand";
        brands = ProductSearch.getBrandsByProduct(productName);
        System.out.println("Brands for " + productName + ": " + String.join(", ", brands));
  
        String productName = "Laptop";
        ProductSearch.searchProductAvailability(productName);

        productName = "Smartphone";
        ProductSearch.searchProductAvailability(productName);

        productName = "Unknown Product";
        ProductSearch.searchProductAvailability(productName);

        productName = "Washing Machine";
        ProductSearch.searchProductAvailability(productName);

        productName = "Refrigerator";
        ProductSearch.searchProductAvailability(productName);

        productName = "Headphones";
        ProductSearch.searchProductAvailability(productName);

        productName = "Tablet";
        ProductSearch.searchProductAvailability(productName);

        productName = "Smartwatch";
        ProductSearch.searchProductAvailability(productName);

        productName = "TV";
        ProductSearch.searchProductAvailability(productName);

        productName = "Air Conditioner";
        ProductSearch.searchProductAvailability(productName);

        productName = "Microwave";
        ProductSearch.searchProductAvailability(productName);

        productName = "Blender";
        ProductSearch.searchProductAvailability(productName);

        productName = "Camera";
        ProductSearch.searchProductAvailability(productName);

        productName = "Printer";
        ProductSearch.searchProductAvailability(productName);

        productName = "Speaker";
        ProductSearch.searchProductAvailability(productName);

        productName = "Electric Kettle";
        ProductSearch.searchProductAvailability(productName);

        productName = "Hair Dryer";
        ProductSearch.searchProductAvailability(productName);

        productName = "Vacuum Cleaner";
        ProductSearch.searchProductAvailability(productName);

        productName = "Oven";
        ProductSearch.searchProductAvailability(productName);

        productName = "Gaming Console";
        ProductSearch.searchProductAvailability(productName);

        productName = "Smart Speaker";
        ProductSearch.searchProductAvailability(productName);

        productName = "Laptop Stand";
        ProductSearch.searchProductAvailability(productName);

        productName = "Projector";
        ProductSearch.searchProductAvailability(productName);

        productName = "Smartphone Accessories";
        ProductSearch.searchProductAvailability(productName);

        productName = "Gamepad";
        ProductSearch.searchProductAvailability(productName);

        productName = "External Hard Drive";
        ProductSearch.searchProductAvailability(productName);

        productName = "Router";
        ProductSearch.searchProductAvailability(productName);

        productName = "Car Dashboard Camera";
        ProductSearch.searchProductAvailability(productName);
		
		
        String source = "Bengaluru";
        String destination = "Mysuru";
        int cost = CabSearch.getCostBySourceAndDestination(source, destination);
        System.out.println("Cost from " + source + " to " + destination + ": ₹" + cost);

        source = "Hubballi";
        destination = "Mangaluru";
        cost = CabSearch.getCostBySourceAndDestination(source, destination);
        System.out.println("Cost from " + source + " to " + destination + ": ₹" + cost);

        source = "Bengaluru";
        destination = "Hampi";
        cost = CabSearch.getCostBySourceAndDestination(source, destination);
        System.out.println("Cost from " + source + " to " + destination + ": ₹" + cost);

        source = "Bengaluru";
        destination = "Chikmagalur";
        cost = CabSearch.getCostBySourceAndDestination(source, destination);
        System.out.println("Cost from " + source + " to " + destination + ": ₹" + cost);

        source = "Belagavi";
        destination = "Bengaluru";
        cost = CabSearch.getCostBySourceAndDestination(source, destination);
        System.out.println("Cost from " + source + " to " + destination + ": ₹" + cost);

        source = "Mysuru";
        destination = "Hampi";
        cost = CabSearch.getCostBySourceAndDestination(source, destination);
        System.out.println("Cost from " + source + " to " + destination + ": ₹" + cost);

        source = "Hassan";
        destination = "Bengaluru";
        cost = CabSearch.getCostBySourceAndDestination(source, destination);
        System.out.println("Cost from " + source + " to " + destination + ": ₹" + cost);

        source = "Mangaluru";
        destination = "Bengaluru";
        cost = CabSearch.getCostBySourceAndDestination(source, destination);
        System.out.println("Cost from " + source + " to " + destination + ": ₹" + cost);

        source = "Bengaluru";
        destination = "Gokarna";
        cost = CabSearch.getCostBySourceAndDestination(source, destination);
        System.out.println("Cost from " + source + " to " + destination + ": ₹" + cost);

        source = "Udupi";
        destination = "Mysuru";
        cost = CabSearch.getCostBySourceAndDestination(source, destination);
        System.out.println("Cost from " + source + " to " + destination + ": ₹" + cost);

        source = "Kodagu";
        destination = "Bengaluru";
        cost = CabSearch.getCostBySourceAndDestination(source, destination);
        System.out.println("Cost from " + source + " to " + destination + ": ₹" + cost);

        source = "Bengaluru";
        destination = "Badami";
        cost = CabSearch.getCostBySourceAndDestination(source, destination);
        System.out.println("Cost from " + source + " to " + destination + ": ₹" + cost);

		
        String source = "Bengaluru";
        String destination = "Mysuru";
        int distance = CabSearch.getDistanceBySourceAndDestination(source, destination);
        System.out.println("Distance from " + source + " to " + destination + ": " + distance + " km");

        source = "Hubballi";
        destination = "Mangaluru";
        distance = CabSearch.getDistanceBySourceAndDestination(source, destination);
        System.out.println("Distance from " + source + " to " + destination + ": " + distance + " km");

        source = "Bengaluru";
        destination = "Hampi";
        distance = CabSearch.getDistanceBySourceAndDestination(source, destination);
        System.out.println("Distance from " + source + " to " + destination + ": " + distance + " km");

        source = "Bengaluru";
        destination = "Chikmagalur";
        distance = CabSearch.getDistanceBySourceAndDestination(source, destination);
        System.out.println("Distance from " + source + " to " + destination + ": " + distance + " km");

        source = "Belagavi";
        destination = "Bengaluru";
        distance = CabSearch.getDistanceBySourceAndDestination(source, destination);
        System.out.println("Distance from " + source + " to " + destination + ": " + distance + " km");

        source = "Mysuru";
        destination = "Hampi";
        distance = CabSearch.getDistanceBySourceAndDestination(source, destination);
        System.out.println("Distance from " + source + " to " + destination + ": " + distance + " km");

        source = "Hassan";
        destination = "Bengaluru";
        distance = CabSearch.getDistanceBySourceAndDestination(source, destination);
        System.out.println("Distance from " + source + " to " + destination + ": " + distance + " km");

        source = "Mangaluru";
        destination = "Bengaluru";
        distance = CabSearch.getDistanceBySourceAndDestination(source, destination);
        System.out.println("Distance from " + source + " to " + destination + ": " + distance + " km");

        source = "Bengaluru";
        destination = "Gokarna";
        distance = CabSearch.getDistanceBySourceAndDestination(source, destination);
        System.out.println("Distance from " + source + " to " + destination + ": " + distance + " km");

        source = "Udupi";
        destination = "Mysuru";
        distance = CabSearch.getDistanceBySourceAndDestination(source, destination);
        System.out.println("Distance from " + source + " to " + destination + ": " + distance + " km");

        source = "Kodagu";
        destination = "Bengaluru";
        distance = CabSearch.getDistanceBySourceAndDestination(source, destination);
        System.out.println("Distance from " + source + " to " + destination + ": " + distance + " km");

        source = "Bengaluru";
        destination = "Badami";
        distance = CabSearch.getDistanceBySourceAndDestination(source, destination);
        System.out.println("Distance from " + source + " to " + destination + ": " + distance + " km");
		
		
        String destination = "Bengaluru";
        CabSearch.searchAvailability(destination);

        destination = "Mysuru";
        CabSearch.searchAvailability(destination);

        destination = "Hampi";
        CabSearch.searchAvailability(destination);

        destination = "Chikmagalur";
        CabSearch.searchAvailability(destination);

        destination = "Karwar";
        CabSearch.searchAvailability(destination);

        destination = "Davanagere"; 
        CabSearch.searchAvailability(destination);

        destination = "Mandya";
        CabSearch.searchAvailability(destination);

        destination = "Hubballi";
        CabSearch.searchAvailability(destination);

        destination = "Mangaluru";
        CabSearch.searchAvailability(destination);

        destination = "Belagavi";
        CabSearch.searchAvailability(destination);

        destination = "Kodagu";
        CabSearch.searchAvailability(destination);

        destination = "Badami";
        CabSearch.searchAvailability(destination);

        destination = "Gokarna";
        CabSearch.searchAvailability(destination);

        destination = "Udupi";
        CabSearch.searchAvailability(destination);

        destination = "Shivamogga";
        CabSearch.searchAvailability(destination);

        destination = "Tumkur";
        CabSearch.searchAvailability(destination);

        destination = "Chitradurga";
        CabSearch.searchAvailability(destination);

        destination = "Hospet";
        CabSearch.searchAvailability(destination);

        destination = "Dharwad";
        CabSearch.searchAvailability(destination);

        destination = "Hassan";
        CabSearch.searchAvailability(destination);

        destination = "Bijapur";
        CabSearch.searchAvailability(destination);

        destination = "Bidar";
        CabSearch.searchAvailability(destination);

        destination = "Raichur";
        CabSearch.searchAvailability(destination);

        destination = "Bagalkot";
        CabSearch.searchAvailability(destination);

        destination = "Sulya";
        CabSearch.searchAvailability(destination);

        destination = "Koppal";
        CabSearch.searchAvailability(destination);

        destination = "Ramanagaram";
        CabSearch.searchAvailability(destination);
    }
}
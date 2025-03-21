class CabSearch {

    static int getCostBySourceAndDestination(String source, String destination) {
        System.out.println("Running getCostBySourceAndDestination: From " + source + " to " + destination);
        
        if (source.equals("Bengaluru") && destination.equals("Mysuru")) {
            return 200; 
        } else if (source.equals("Hubballi") && destination.equals("Mangaluru")) {
            return 350;
        } else if (source.equals("Bengaluru") && destination.equals("Hampi")) {
            return 400;
        } else if (source.equals("Bengaluru") && destination.equals("Chikmagalur")) {
            return 250;
        } else if (source.equals("Belagavi") && destination.equals("Bengaluru")) {
            return 450;
        } else if (source.equals("Mysuru") && destination.equals("Hampi")) {
            return 350;
        } else if (source.equals("Hassan") && destination.equals("Bengaluru")) {
            return 300;
        } else if (source.equals("Mangaluru") && destination.equals("Bengaluru")) {
            return 500;
        } else if (source.equals("Bengaluru") && destination.equals("Gokarna")) {
            return 550;
        } else if (source.equals("Udupi") && destination.equals("Mysuru")) {
            return 600;
        } else if (source.equals("Kodagu") && destination.equals("Bengaluru")) {
            return 350;
        } else if (source.equals("Bengaluru") && destination.equals("Badami")) {
            return 450;
        } else {
            System.out.println("Route not available");
            return 0; 
        }
    }


static int getDistanceBySourceAndDestination(String source, String destination) {
        System.out.println("Running getDistanceBySourceAndDestination: From " + source + " to " + destination);

      
        if (source.equals("Bengaluru") && destination.equals("Mysuru")) {
            return 145; 
        } else if (source.equals("Hubballi") && destination.equals("Mangaluru")) {
            return 230;
        } else if (source.equals("Bengaluru") && destination.equals("Hampi")) {
            return 350;
        } else if (source.equals("Bengaluru") && destination.equals("Chikmagalur")) {
            return 250;
        } else if (source.equals("Belagavi") && destination.equals("Bengaluru")) {
            return 510;
        } else if (source.equals("Mysuru") && destination.equals("Hampi")) {
            return 290;
        } else if (source.equals("Hassan") && destination.equals("Bengaluru")) {
            return 180;
        } else if (source.equals("Mangaluru") && destination.equals("Bengaluru")) {
            return 350;
        } else if (source.equals("Bengaluru") && destination.equals("Gokarna")) {
            return 485;
        } else if (source.equals("Udupi") && destination.equals("Mysuru")) {
            return 400;
        } else if (source.equals("Kodagu") && destination.equals("Bengaluru")) {
            return 250;
        } else if (source.equals("Bengaluru") && destination.equals("Badami")) {
            return 450;
        } else if (source.equals("Bengaluru") && destination.equals("Karwar")) {
            return 520;
        } else if (source.equals("Bengaluru") && destination.equals("Tumkur")) {
            return 70;
        } else if (source.equals("Mysuru") && destination.equals("Belagavi")) {
            return 470;
        } else if (source.equals("Chikmagalur") && destination.equals("Kodagu")) {
            return 100;
        } else if (source.equals("Bengaluru") && destination.equals("Shivamogga")) {
            return 320;
        } else if (source.equals("Hampi") && destination.equals("Badami")) {
            return 120;
        } else if (source.equals("Gokarna") && destination.equals("Mangaluru")) {
            return 190;
        } else if (source.equals("Mysuru") && destination.equals("Udupi")) {
            return 450;
        } else if (source.equals("Chikmagalur") && destination.equals("Hassan")) {
            return 55;
        } else if (source.equals("Karwar") && destination.equals("Mangaluru")) {
            return 130;
        } else if (source.equals("Bengaluru")  && destination.equals("Bijapur")) {
            return 530;
        } else {
            System.out.println("Route not available");
            return 0;
        }
    }


    static void searchAvailability(String destination) {
        System.out.println("Running searchAvailability for destination: " + destination);
        if (destination.equals("Bengaluru")) {
            System.out.println("Cabs are available to Bengaluru.");
        } else if (destination.equals("Mysuru")) {
            System.out.println("Cabs are available to Mysuru.");
        } else if (destination.equals("Hubballi")) {
            System.out.println("Cabs are available to Hubballi.");
        } else if (destination.equals("Mangaluru")) {
            System.out.println("Cabs are available to Mangaluru.");
        } else if (destination.equals("Hampi")) {
            System.out.println("Cabs are available to Hampi.");
        } else if (destination.equals("Chikmagalur")) {
            System.out.println("Cabs are available to Chikmagalur.");
        } else if (destination.equals("Belagavi")) {
            System.out.println("Cabs are available to Belagavi.");
        } else if (destination.equals("Kodagu")) {
            System.out.println("Cabs are available to Kodagu.");
        } else if (destination.equals("Badami")) {
            System.out.println("Cabs are available to Badami.");
        } else if (destination.equals("Gokarna")) {
            System.out.println("Cabs are available to Gokarna.");
        } else if (destination.equals("Udupi")) {
            System.out.println("Cabs are available to Udupi.");
        } else if (destination.equals("Karwar")) {
            System.out.println("Cabs are available to Karwar.");
        } else if (destination.equals("Shivamogga")) {
            System.out.println("Cabs are available to Shivamogga.");
        } else if (destination.equals("Tumkur")) {
            System.out.println("Cabs are available to Tumkur.");
        } else if (destination.equals("Chitradurga")) {
            System.out.println("Cabs are available to Chitradurga.");
        } else if (destination.equals("Hospet")) {
            System.out.println("Cabs are available to Hospet.");
        } else if (destination.equals("Dharwad")) {
            System.out.println("Cabs are available to Dharwad.");
        } else if (destination.equals("Hassan")) {
            System.out.println("Cabs are available to Hassan.");
        } else if (destination.equals("Bijapur")) {
            System.out.println("Cabs are available to Bijapur.");
        } else if (destination.equals("Bidar")) {
            System.out.println("Cabs are available to Bidar.");
        } else if (destination.equals("Raichur")) {
            System.out.println("Cabs are available to Raichur.");
        } else if (destination.equals("Bagalkot")) {
            System.out.println("Cabs are available to Bagalkot.");
        } else if (destination.equals("Kolar")) {
            System.out.println("Cabs are available to Kolar.");
        } else if (destination.equals("Mandya")) {
            System.out.println("Cabs are available to Mandya.");
        } else if (destination.equals("Koppal")) {
            System.out.println("Cabs are available to Koppal.");
        } else if (destination.equals("Ramanagaram")) {
            System.out.println("Cabs are available to Ramanagaram.");
        } else if (destination.equals("Davanagere")) {
            System.out.println("No cabs are available to Davanagere at the moment.");
        } else {
            System.out.println("No cabs are available to " + destination + " at the moment.");
			
        }
	}
}
 

       
       
   
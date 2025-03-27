class SatelliteRunner {
    public static void main(String[] args) {
        
        Satellite satellite1 = new Satellite(
            "INSAT-3DR", "Communication", 2500, 2016, 2, 12, 36000, "2016-09-08", "GSLV Mk II",
            "Telecommunication", "India", true, "Geosynchronous", 2000, "Microwave", true,
            "ISRO", "Aluminum", "Telecommunication", "None"
        );

        Satellite satellite2 = new Satellite(
            "GSAT-6A", "Communication", 2250, 2018, 3, 5, 36000, "2018-03-29", "GSLV Mk II",
            "Communication", "India", true, "Geosynchronous", 1500, "Microwave", false,
            "ISRO", "Titanium", "Communication", "None"
        );

        Satellite satellite3 = new Satellite(
            "RISAT-1", "Radar Imaging", 1500, 2012, 2, 5, 800, "2012-04-26", "PSLV-C37",
            "Earth Observation", "India", true, "Sun-synchronous", 500, "Synthetic Aperture Radar", true,
            "ISRO", "Aluminum", "Earth Observation", "None"
        );
		

System.out.println("Satellite 1 Details:");
System.out.println("Satellite Name: " + satellite1.satelliteName);
System.out.println("Satellite Type: " + satellite1.satelliteType);
System.out.println("Weight: " + satellite1.weight + " kg");
System.out.println("Launch Year: " + satellite1.launchYear);
System.out.println("Number of Solar Panels: " + satellite1.numberOfSolarPanels);
System.out.println("Operational Years: " + satellite1.operationalYears);
System.out.println("Orbit Altitude: " + satellite1.orbitAltitude + " km");
System.out.println("Launch Date: " + satellite1.launchDate);
System.out.println("Launch Vehicle: " + satellite1.launchVehicle);
System.out.println("Mission Type: " + satellite1.missionType);
System.out.println("Country of Origin: " + satellite1.countryOfOrigin);
System.out.println("Is Active: " + satellite1.isActive);
System.out.println("Orbit Type: " + satellite1.orbitType);
System.out.println("Data Transfer Rate: " + satellite1.dataTransferRate + " Mbps");
System.out.println("Communication Type: " + satellite1.communicationType);
System.out.println("Has Remote Sensing: " + satellite1.hasRemoteSensing);
System.out.println("Manufacturer: " + satellite1.manufacturer);
System.out.println("Material Used: " + satellite1.materialUsed);
System.out.println("Satellite Purpose: " + satellite1.satellitePurpose);
System.out.println("Mission Partner: " + satellite1.missionPartner);
System.out.println();
        
System.out.println("Satellite 2 Details:");
System.out.println("Satellite Name: " + satellite2.satelliteName);
System.out.println("Satellite Type: " + satellite2.satelliteType);
System.out.println("Weight: " + satellite2.weight + " kg");
System.out.println("Launch Year: " + satellite2.launchYear);
System.out.println("Number of Solar Panels: " + satellite2.numberOfSolarPanels);
System.out.println("Operational Years: " + satellite2.operationalYears);
System.out.println("Orbit Altitude: " + satellite2.orbitAltitude + " km");
System.out.println("Launch Date: " + satellite2.launchDate);
System.out.println("Launch Vehicle: " + satellite2.launchVehicle);
System.out.println("Mission Type: " + satellite2.missionType);
System.out.println("Country of Origin: " + satellite2.countryOfOrigin);
System.out.println("Is Active: " + satellite2.isActive);
System.out.println("Orbit Type: " + satellite2.orbitType);
System.out.println("Data Transfer Rate: " + satellite2.dataTransferRate + " Mbps");
System.out.println("Communication Type: " + satellite2.communicationType);
System.out.println("Has Remote Sensing: " + satellite2.hasRemoteSensing);
System.out.println("Manufacturer: " + satellite2.manufacturer);
System.out.println("Material Used: " + satellite2.materialUsed);
System.out.println("Satellite Purpose: " + satellite2.satellitePurpose);
System.out.println("Mission Partner: " + satellite2.missionPartner);
System.out.println();
        
System.out.println("Satellite 3 Details:");
System.out.println("Satellite Name: " + satellite3.satelliteName);
System.out.println("Satellite Type: " + satellite3.satelliteType);
System.out.println("Weight: " + satellite3.weight + " kg");
System.out.println("Launch Year: " + satellite3.launchYear);
System.out.println("Number of Solar Panels: " + satellite3.numberOfSolarPanels);
System.out.println("Operational Years: " + satellite3.operationalYears);
System.out.println("Orbit Altitude: " + satellite3.orbitAltitude + " km");
System.out.println("Launch Date: " + satellite3.launchDate);
System.out.println("Launch Vehicle: " + satellite3.launchVehicle);
System.out.println("Mission Type: " + satellite3.missionType);
System.out.println("Country of Origin: " + satellite3.countryOfOrigin);
System.out.println("Is Active: " + satellite3.isActive);
System.out.println("Orbit Type: " + satellite3.orbitType);
System.out.println("Data Transfer Rate: " + satellite3.dataTransferRate + " Mbps");
System.out.println("Communication Type: " + satellite3.communicationType);
System.out.println("Has Remote Sensing: " + satellite3.hasRemoteSensing);
System.out.println("Manufacturer: " + satellite3.manufacturer);
System.out.println("Material Used: " + satellite3.materialUsed);
System.out.println("Satellite Purpose: " + satellite3.satellitePurpose);
System.out.println("Mission Partner: " + satellite3.missionPartner);
}
}
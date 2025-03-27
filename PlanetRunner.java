class PlanetRunner{

 public static void main(String[] args) {
 
        Planet planet1 = new Planet("Earth", 5.97e24, 6371, "Blue", false, 1, 149.6, true, "Nitrogen-Oxygen", "Prehistoric", 365.25, true, 15, "Solid", 9.8, "Moon", true, 23.5, true, "Oceans");
		
        Planet planet2 = new Planet("Mars", 0.64171e24, 3389, "Red", false, 2, 227.9, false, "Carbon Dioxide", "Ancient", 687, false, -60, "Rocky", 3.71, "Phobos & Deimos", true, 25.2, false, "Desert");
		
        Planet planet3 = new Planet("Jupiter", 1.898e27, 69911, "Orange", true, 79, 778.5, false, "Hydrogen-Helium", "Prehistoric", 4333, false, -108, "Gaseous", 24.79, "Multiple Moons", true, 3.1, false, "Great Red Spot");
		
        System.out.println("-----Planet1 Details------");
        System.out.println("Name: " + planet1.name);
        System.out.println("Mass: " +planet1.mass + " kg");
        System.out.println("Radius: " + planet1.radius + " km");
        System.out.println("Color: " + planet1.color);
        System.out.println("Has Rings: " + planet1.hasRings);
        System.out.println("Number of Moons: " + planet1.numberOfMoons);
        System.out.println("Distance from Sun: " + planet1.distanceFromSun + " million km");
        System.out.println("Habitable: " + planet1.habitable);
        System.out.println("Atmosphere Type: " + planet1.atmosphereType);
        System.out.println("Discovery Date: " + planet1.discoveryDate);
        System.out.println("Orbital Period: " + planet1.orbitalPeriod + " days");
        System.out.println("Has Life: " + planet1.hasLife);
        System.out.println("Temperature: " + planet1.temperature + " °C");
        System.out.println("Surface Type: " + planet1.surfaceType);
        System.out.println("Gravitational Pull: " + planet1.gravitationalPull + " m/s²");
        System.out.println("Satellite Type: " + planet1.satelliteType);
        System.out.println("Has Magnetic Field: " + planet1.hasMagneticField);
        System.out.println("Axial Tilt: " + planet1.axialTilt + " degrees");
        System.out.println("Has Water: " + planet1.hasWater);
        System.out.println("Surface Feature: " + planet1.surfaceFeature);
        System.out.println();
		
		
		System.out.println("-----Planet1 Details------");
        System.out.println("Name: " + planet2.name);
        System.out.println("Mass: " +planet2.mass + " kg");
        System.out.println("Radius: " + planet2.radius + " km");
        System.out.println("Color: " + planet2.color);
        System.out.println("Has Rings: " + planet2.hasRings);
        System.out.println("Number of Moons: " + planet2.numberOfMoons);
        System.out.println("Distance from Sun: " + planet2.distanceFromSun + " million km");
        System.out.println("Habitable: " + planet2.habitable);
        System.out.println("Atmosphere Type: " + planet2.atmosphereType);
        System.out.println("Discovery Date: " + planet2.discoveryDate);
        System.out.println("Orbital Period: " + planet2.orbitalPeriod + " days");
        System.out.println("Has Life: " + planet2.hasLife);
        System.out.println("Temperature: " + planet2.temperature + " °C");
        System.out.println("Surface Type: " + planet2.surfaceType);
        System.out.println("Gravitational Pull: " + planet2.gravitationalPull + " m/s²");
        System.out.println("Satellite Type: " + planet2.satelliteType);
        System.out.println("Has Magnetic Field: " + planet2.hasMagneticField);
        System.out.println("Axial Tilt: " + planet2.axialTilt + " degrees");
        System.out.println("Has Water: " + planet2.hasWater);
        System.out.println("Surface Feature: " + planet2.surfaceFeature);
        System.out.println();
		
		System.out.println("-----Planet3 Details------");
        System.out.println("Name: " + planet3.name);
        System.out.println("Mass: " +planet3.mass + " kg");
        System.out.println("Radius: " + planet3.radius + " km");
        System.out.println("Color: " + planet3.color);
        System.out.println("Has Rings: " + planet3.hasRings);
        System.out.println("Number of Moons: " + planet3.numberOfMoons);
        System.out.println("Distance from Sun: " + planet3.distanceFromSun + " million km");
        System.out.println("Habitable: " + planet3.habitable);
        System.out.println("Atmosphere Type: " + planet3.atmosphereType);
        System.out.println("Discovery Date: " + planet3.discoveryDate);
        System.out.println("Orbital Period: " + planet3.orbitalPeriod + " days");
        System.out.println("Has Life: " + planet3.hasLife);
        System.out.println("Temperature: " + planet3.temperature + " °C");
        System.out.println("Surface Type: " + planet3.surfaceType);
        System.out.println("Gravitational Pull: " + planet3.gravitationalPull + " m/s²");
        System.out.println("Satellite Type: " + planet3.satelliteType);
        System.out.println("Has Magnetic Field: " + planet3.hasMagneticField);
        System.out.println("Axial Tilt: " + planet3.axialTilt + " degrees");
        System.out.println("Has Water: " + planet3.hasWater);
        System.out.println("Surface Feature: " + planet3.surfaceFeature);
        System.out.println();
    }
    }
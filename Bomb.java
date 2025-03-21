class Bomb{
    public static void details(String type, double weight, String explosiveMaterial, int radius, boolean remoteDetonation, int timer, String origin, double power, String category, boolean active) {
System.out.println("Bomb - Type: " + type + ", Weight: " + weight + " kg, Explosive Material: " + explosiveMaterial + ", Radius: " + radius + " meters, Remote Detonation: " + (remoteDetonation ? "Yes" : "No") + ", Timer: " + timer + " sec, Power: " + power + " TNT, Category: " + category + ", Active: " + (active ? "Yes" : "No"));
    }
}


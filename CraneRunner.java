class CraneRunner {
    public static void main(String[] args) {
        Crane machine = new Crane();

        System.out.println("Crane Type: " + machine.type);
        System.out.println("Crane Max Load: " + machine.maxLoad);
        System.out.println("Is Crane Operational? " + machine.isOperational);
        System.out.println("Manufacture Year: " + machine.manufactureYear);

        machine.type = "Tower Crane";
        machine.maxLoad = 25.5;
        machine.isOperational = true;
        machine.manufactureYear = 2020;

        System.out.println("Updated Crane Type: " + machine.type);
        System.out.println("Updated Crane Max Load: " + machine.maxLoad);
        System.out.println("Updated Is Crane Operational? " + machine.isOperational);
        System.out.println("Updated Manufacture Year: " + machine.manufactureYear);
    }
}

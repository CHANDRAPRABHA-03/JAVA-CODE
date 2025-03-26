class SirenRunner {
    public static void main(String[] args) {
        Siren alarm = new Siren();

        System.out.println("Siren Type: " + alarm.type);
        System.out.println("Siren Volume: " + alarm.volume);
        System.out.println("Is Siren Wireless? " + alarm.isWireless);
        System.out.println("Siren Usage: " + alarm.usage);
      
        alarm.type = "Fire Alarm";
        alarm.volume = 100;
        alarm.isWireless = true;
        alarm.usage = "Emergency Alerts";

        System.out.println("Updated Siren Type: " + alarm.type);
        System.out.println("Updated Siren Volume: " + alarm.volume);
        System.out.println("Updated Is Siren Wireless? " + alarm.isWireless);
        System.out.println("Updated Siren Usage: " + alarm.usage);
    }
}

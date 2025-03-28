class ArmyRunner {
    public static void main(String[] args) {
       
	    Army army = new Army();
        Army army1 = new Army("Indian Army", 10, true, "M1 Abrams", "Pentagon, India", 1200000, 800000000, true, "Infantry", "English");
        Army army2 = new Army("US Army", 5, true, "Challenger 2", "Washington, USA", 1000000, 900000000, false, "Cavalry", "English");
        Army army3 = new Army("Russian Army", 15, false, "T-90", "Kremlin, Russia", 1500000, 700000000, true, "Artillery", "Russian");
        Army army4 = new Army("Chinese Army", 20, true, "Type 99", "Beijing, China", 1300000, 1000000000, true, "Infantry", "Mandarin");
        Army army5 = new Army("French Army", 7, false, "Leclerc", "Paris, France", 800000, 600000000, false, "Special Forces", "French");
        Army army6 = new Army("UK Army", 12, true, "Challenger 2", "London, UK", 1100000, 750000000, true, "Cavalry", "English");
        Army army7 = new Army("Indian Army", 8, true, "Arjun Tank", "New Delhi, India", 900000, 850000000, true, "Mechanized Infantry", "Hindi");
        Army army8 = new Army("German Army", 6, false, "Leopard 2", "Berlin, Germany", 700000, 500000000, true, "Artillery", "German");
        Army army9 = new Army("Brazilian Army", 9, true, "EE-T1 Osório", "Brasília, Brazil", 750000, 400000000, false, "Infantry", "Portuguese");
        Army army10 = new Army("Australian Army", 14, true, "Leopard 2", "Canberra, Australia", 950000, 600000000, true, "Commando", "English");
        
        army.info();
        army1.info();
        army2.info();
        army3.info();
        army4.info();
        army5.info();
        army6.info();
        army7.info();
        army8.info();
        army9.info();
        army10.info();
        
    }
}


class CementRunner {
    public static void main(String[] args) {
     
	    Cement cement = new Cement();
        Cement cement1 = new Cement("Cement Type 1", "A", "25kg", 25000, "28/10/2024", "28/10/2025", true, true, true, "Ultratech", "Cement");
        Cement cement2 = new Cement("Cement Type 2", "B", "50kg", 18000, "15/09/2023", "15/09/2024", true, false, false, "Ambuja", "Cement");
        Cement cement3 = new Cement("Cement Type 3", "A", "25kg", 22000, "01/06/2023", "01/06/2024", false, true, true, "ACC", "Cement");
        Cement cement4 = new Cement("Cement Type 4", "C", "50kg", 30000, "10/10/2024", "10/10/2025", true, true, false, "Birla", "Cement");
        Cement cement5 = new Cement("Cement Type 5", "A", "25kg", 20000, "15/11/2024", "15/11/2025", false, false, true, "Dalmia", "Cement");
        Cement cement6 = new Cement("Cement Type 6", "B", "50kg", 24000, "12/03/2024", "12/03/2025", true, true, true, "Ultratech", "Cement");
        Cement cement7 = new Cement("Cement Type 7", "C", "25kg", 17000, "05/07/2023", "05/07/2024", true, false, false, "ACC", "Cement");
        Cement cement8 = new Cement("Cement Type 8", "A", "50kg", 26000, "28/02/2025", "28/02/2026", false, true, true, "Ambuja", "Cement");
        Cement cement9 = new Cement("Cement Type 9", "B", "25kg", 21000, "01/04/2023", "01/04/2024", true, true, false, "Birla", "Cement");
        Cement cement10 = new Cement("Cement Type 10", "A", "50kg", 28000, "18/08/2024", "18/08/2025", false, true, true, "Dalmia", "Cement");
        

        cement.info();
        cement1.info();
        cement2.info();
        cement3.info();
        cement4.info();
        cement5.info();
        cement6.info();
        cement7.info();
        cement8.info();
        cement9.info();
        cement10.info();
        
    }
}
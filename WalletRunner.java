class WalletRunner {
    public static void main(String[] args) {
     
	    Wallet wallet = new Wallet();
        Wallet wallet1 = new Wallet("Woodland", "Leather", "Black", 150.00, "4", true, true, 8, true, true);
        Wallet wallet2 = new Wallet("Puma", "Fabric", "Red", 80.00, "5", true, false, 6, true, false);
        Wallet wallet3 = new Wallet("Nike", "Leather", "Brown", 120.00, "4", false, true, 5, true, false);
        Wallet wallet4 = new Wallet("Adidas", "Synthetic", "Blue", 90.00, "6", true, false, 7, false, true);
        Wallet wallet5 = new Wallet("BOSS", "Leather", "Black", 200.00, "4", true, true, 10, true, false);
        Wallet wallet6 = new Wallet("Levi's", "Canvas", "Gray", 60.00, "5", false, true, 4, true, false);
        Wallet wallet7 = new Wallet("Tommy Hilfiger", "Leather", "Tan", 110.00, "4", true, true, 9, true, false);
        Wallet wallet8 = new Wallet("Fossil", "Leather", "Dark Brown", 130.00, "3", true, false, 8, true, false);
        Wallet wallet9 = new Wallet("Calvin Klein", "Leather", "Red", 140.00, "5", true, true, 12, false, true);
        Wallet wallet10 = new Wallet("Gucci", "Leather", "Green", 250.00, "6", true, true, 15, false, true);
       

        wallet.info();
        wallet1.info();
        wallet2.info();
        wallet3.info();
        wallet4.info();
        wallet5.info();
        wallet6.info();
        wallet7.info();
        wallet8.info();
        wallet9.info();
        wallet10.info();
        
    }
}
 
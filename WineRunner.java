class WineRunner {
    public static void main(String[] args) {
		
        Wine wine = new Wine();
        Wine wine1 = new Wine("Redlip", "Red", "India", 2015, 13.5, 500.0, "Cabernet Sauvignon", true, 750.0, "Redlip");
        Wine wine2 = new Wine("Vineyard Bliss", "White", "USA", 2018, 12.0, 300.0, "Chardonnay", true, 750.0, "Vineyard Bliss");
        Wine wine3 = new Wine("Golden Grape", "Rosé", "France", 2019, 11.5, 350.0, "Merlot", false, 500.0, "Golden Grape");
        Wine wine4 = new Wine("Noble Vine", "Red", "Italy", 2017, 14.0, 450.0, "Pinot Noir", true, 750.0, "Noble Vine");
        Wine wine5 = new Wine("Moonlit Valley", "White", "Australia", 2020, 13.0, 400.0, "Sauvignon Blanc", false, 750.0, "Moonlit Valley");
        Wine wine6 = new Wine("Crimson Leaf", "Red", "Spain", 2016, 15.0, 600.0, "Tempranillo", true, 750.0, "Crimson Leaf");
        Wine wine7 = new Wine("Silver Oak", "Red", "California", 2018, 14.5, 700.0, "Zinfandel", true, 750.0, "Silver Oak");
        Wine wine8 = new Wine("Emerald Grape", "White", "Chile", 2021, 12.5, 350.0, "Riesling", false, 750.0, "Emerald Grape");
        Wine wine9 = new Wine("Lavender Hill", "Rosé", "South Africa", 2019, 11.0, 280.0, "Syrah", true, 750.0, "Lavender Hill");
        Wine wine10 = new Wine("Royal Reserve", "Red", "Portugal", 2014, 16.0, 800.0, "Touriga Nacional", true, 750.0, "Royal Reserve");
        
        wine.info();
        wine1.info();
        wine2.info();
        wine3.info();
        wine4.info();
        wine5.info();
        wine6.info();
        wine7.info();
        wine8.info();
        wine9.info();
        wine10.info();
        
    }
}


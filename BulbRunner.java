class BulbRunner {
    public static void main(String[] args)
	{
        Bulb bulb = new Bulb();
        Bulb bulb1 = new Bulb("LED", 10, 15.5, 800, 5000, true, "Philips", "Plastic", 19.99, 2);
        Bulb bulb2 = new Bulb("CFL", 8, 12.0, 600, 4000, true, "GE", "Glass", 14.99, 1);
        Bulb bulb3 = new Bulb("Incandescent", 15, 20.0, 1000, 2000, false, "Osram", "Glass", 10.99, 3);
        Bulb bulb4 = new Bulb("LED", 12, 18.0, 900, 10000, true, "Samsung", "Aluminum", 24.99, 2);
        Bulb bulb5 = new Bulb("Halogen", 20, 22.5, 1200, 1500, false, "Philips", "Glass", 29.99, 1);
        Bulb bulb6 = new Bulb("CFL", 9, 14.0, 700, 4500, true, "GE", "Plastic", 16.99, 2);
        Bulb bulb7 = new Bulb("LED", 11, 16.5, 850, 7500, true, "Cree", "Plastic", 22.99, 2);
        Bulb bulb8 = new Bulb("Halogen", 18, 25.0, 1100, 2000, false, "Sylvania", "Glass", 19.49, 1);
        Bulb bulb9 = new Bulb("Incandescent", 14, 19.5, 950, 1500, false, "Osram", "Glass", 12.99, 3);
        Bulb bulb10 = new Bulb("LED", 13, 17.0, 920, 10000, true, "Philips", "Aluminum", 27.99, 2);
        

        bulb.info();
        bulb1.info();
        bulb2.info();
        bulb3.info();
        bulb4.info();
        bulb5.info();
        bulb6.info();
        bulb7.info();
        bulb8.info();
        bulb9.info();
        bulb10.info();
        
    }
}

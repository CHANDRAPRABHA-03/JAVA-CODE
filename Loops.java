class Forloops {
    public static void main(String[] args) {
        String[] shirts = {"Silk Shirt", "Casual Shirts", "Roundneck Shirts", "Black Shirt", "Formal Shirt"};
        for (int i = 0; i < shirts.length; i++) 
		{
            System.out.println("Shirts: " + shirts[i]);
        }
        System.out.println("-------------------");


//clips
        String[] clips = {"Hairclips", "Paperclips", "Bananaclips", "Clothesclips", "Bagclips"};
        for (int index = 0; index < clips.length; index++)
			{
            System.out.println("Clips: " + clips[index]);
        }
        System.out.println("--------------------");
    
// paints

        String[] paints = {"unique Paint", "Oil Paint", "Watercolor", "Color Paint", "Bottle Paint"};
        for (int j = 0; j < paints.length; j++) {
            System.out.println("Paints: " + paints[j]);
        }
        System.out.println("--------------------");
  // wires
        String[] wires = {"Copper Wire", "Cable Wire", "Electric Wire", "Cable Wire", "Plastic Wire"};
        for (int k = 0; k < wires.length; k++) {
            System.out.println("Wires: " + wires[k]);
        }
        System.out.println("--------------------");

//walls
        String[] walls = {"Brick Wall", "Glass Wall", "Concrete Wall", "Wooden Wall", "Plaster Wall"};
        for (int h = 0; h < walls.length; h++) {
            System.out.println("Walls: " + walls[h]);
        }
        System.out.println("--------------------");
 
//papers

        String[] papers = {"Notebook Paper", "Carbon Paper", "A4 Paper", "Tissue Paper", "Graph Paper"};
        for (int m = 0; m < papers.length; m++) 
		{
		System.out.println("Papers: " + papers[m]); 
		}
        System.out.println("---------------------");

//wallets
        String[] wallets = {"Leather Wallet", "Mens Wallet", "Womens Wallet", "Grils Wallet", "Zipper Wallet"};
        for (int w = 0; w < wallets.length; w++) {
            System.out.println("Wallets: " + wallets[w]);
        }
        System.out.println("--------------------");

//posters
        String[] posters = {"Movie Poster", "Advertisement Poster", "Event Poster", "Gaming Poster", "Educational Poster"};
        for (int post = 0; post < posters.length; post++) {
            System.out.println("Poster: " + posters[post]);
        }
        System.out.println("--------------------");
    }
}

         // for-each loop//
		 
class Foreachloops {
    public static void main(String[] args) {
        String[] coins = {"Penny", "Rupees", "Quarter", "Half Dollar","Bucks"};
        for (String coin : coins) {
            System.out.println("Coinname: " + coin);
        }
        System.out.println("--------------------");

//Note 
       String[] notes = {"10rupeesnote","20rupeesnote","50rupeesnote","100rupeesnote","200rupeesnote"};
        for(String note:notes)
	    {
		 System.out.println("Notename:" +note);
	    }
	     System.out.println("----------------------");

//watches
	    String[] watches = {"Digital Watch", "Analog Watch", "Smartwatch", "Luxury Watch", "Sports Watch"};
	     for(String watch:watches)
		 {
			 System.out.println("Watchname:" +watch);
		 }
		 System.out.println("----------------------");
		
//cameras		
        String[] cameras = {"DSLR", "Mirrorless", "Action Camera", "Instant Camera", "Security Camera"};
		for(String camera:cameras)
		{
			System.out.println("Cameraname:" +camera);
		}
		System.out.println("---------------------");
		
//games
        String[] games = {"Chess", "Cricket", "Football", "Badminton", "Basketball"};
		for(String game :games)
		{
			System.out.println("Gamename:" + game);
		}
		System.out.println("-----------------------");
		
//bags
        String[] bags = {"Backpack", "Handbag", "Laptop Bag", "Travel Bag", "Duffel Bag"};
		for(String bag:bags)
		{
			System.out.println("Bagname:" + bag);
		}
		System.out.println("-----------------------");
		
//pots
        String[] pots = {"Clay Pot", "Ceramic Pot", "Plastic Pot", "Metal Pot", "Glass Pot"};
		for(String pot: pots)
		{
			System.out.println("Potname:" + pot);
		}
		System.out.println("------------------------");
	
//routers
        String[] routers = {"WiFi Router", "Modem Router", "Mesh Router", "Gaming Router", "4G Router"};
		for(String router:routers)
		{
			System.out.println("Routersname:" + router);
		}
		System.out.println("--------------");
    }
}

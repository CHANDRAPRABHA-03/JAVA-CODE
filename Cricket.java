class Cricket{

public static void matchDetails(String dayName, String... playerNames) {
        
        System.out.println("Match Day: " + dayName);
        System.out.println("Players: ");
        for (String player : playerNames) 
		{
            System.out.print(player + " ");
        }
        
    }
	}

    
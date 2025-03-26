class ContactSearch {
	
    static long getMobileByEmail(String email) { 
        System.out.println("Running getMobileByEmail: " + email);

        if (email == "priyankaskapoor@gmail.com") {
            return 9876543210L;
        } 
		
		else if (email == "yashusharma@gmail.com") {
            return 78865332109L;
        } 
		
		else if (email == "parushetty@gmail.com") {
            return 7654321098L;
        } 
		
		else if (email == "monikakapoor@gmail.com"){
            return 6543210987L;
        } 
		
		else if (email == "sneha.sharma@gmail.com"){
            return 5432109876L;
        } 
		
		else if (email == "kiran.shetty@gmail.com"){
            return 4321098765L;
        } 
		
		else if (email == "amitkapoor@gmail.com") {
            return 3210987654L;
        } 
		
		else if (email == "deepaksharma@gmail.com"){
            return 2109876543L;
        } 
		
		else if (email == "megha.shetty@gmail.com") {
            return 1098765432L;
        } 
		
		else if (email == "varun.kapoor@gmail.com"){
            return 9988776655L;
        } 
		
		else if (email == "nisha.sharma@gmail.com") {
            return 8877665544L;
        }

		else if (email == "manoj.shetty@gmail.com") 
		{
            return 7766554433L;
        } 
		
		else if (email == "rahul.kapoor@gmail.com") 
		{
            return 6655443322L;
        } 
		
		else if (email == "pooja.sharma@gmail.com")
			{
            return 5544332211L;
        } 
		
		else if (email == "arjun.shetty@gmail.com") 
		{
            return 4433221100L;
        } 
		
		else
			{
            System.out.println("No mobile number found");
            return 0;
        }
    }

    static String getEmailByName(String name) { 
        System.out.println("Running getEmailByName: " + name);

        if (name == "Ravi Kapoor") {
            return "ravi.kapoor@gmail.com";
        }

		else if (name == "Rohit Sharma"){
            return "rohit.sharma@gmail.com";
        }

		else if (name == "Anil Shetty")
			{
            return "anil.shetty@gmail.com";
        }

		else if (name == "Priya Kapoor") 
		{
            return "priya.kapoor@gmail.com";
        } 
		
		else if (name == "Sneha Sharma") 
		{
            return "sneha.sharma@gmail.com";
        } 
		
		else if (name == "Kiran Shetty")
			{
            return "kiran.shetty@gmail.com";
        } 
		
		else if (name == "Amit Kapoor") 
		{
            return "amit.kapoor@gmail.com";
        }

		else if (name == "Deepak Sharma")
			{
            return "deepak.sharma@gmail.com";
        } 
		
		else if (name == "Megha Shetty") 
		{
            return "megha.shetty@gmail.com";
        }

		else if (name == "Varun Kapoor") 
		{
            return "varun.kapoor@gmail.com";
        }

		else if (name == "Nisha Sharma") 
		{
            return "nisha.sharma@gmail.com";
        } 
		
		else if (name == "Manoj Shetty") 
		{
            return "manoj.shetty@gmail.com";
        }

		else if (name == "Rahul Kapoor")
			{
            return "Shreya.kapoor@gmail.com";
        } 
		
		else if (name == "Pooja Sharma") 
		{
            return "pooja.sharma@gmail.com";
        }

		else if (name == "Arjun Shetty") 
		{
            return "pallavi.shetty@gmail.com";
        } 
		
		else 
		{
            System.out.println("No email found");
            return null;
        }
    }

   static String[] searchByLastName(String name) { 
        System.out.println("Running searchByLastName: " + name);

        if (name == "Kapoor") 
		{
            return new String[]{"Raju Kapoor", "Priya Kapoor", "Amit Kapoor", "Varun Kapoor", "Rahul Kapoor"};
        } 
		
		else if (name == "Sharma")
			{
            return new String[]{"Rohit Sharma", "Sneha Sharma", "Deepak Sharma", "Nisha Sharma", "Pooja Sharma"};
        } 
		
		else if (name == "Shetty") 
		{
            return new String[]{"Anil Shetty", "Kiran Shetty", "Megha Shetty", "Manoj Shetty", "Arjun Shetty"};
        } 
		
		else 
		{
            System.out.println("No records found");
            return new String[0];
        }
    }
}
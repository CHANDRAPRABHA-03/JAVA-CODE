class Army {
    String armyName;
    int numberOfDivisions;
    boolean isActive;
    String primaryWeapon;
    String headquartersLocation;
    int totalPersonnel;
    double annualBudget;
    boolean hasNuclearCapability;
    String dominantMilitaryBranch;
    String officialLanguage;

    public Army() {
    }

    public Army(String armyName)
	{
        this.armyName = armyName;
    }

    public Army(String armyName, int numberOfDivisions) 
	{
        this(armyName);
        this.numberOfDivisions = numberOfDivisions;
    }

    public Army(String armyName, int numberOfDivisions, boolean isActive) 
	{
        this(armyName, numberOfDivisions);
        this.isActive = isActive;
    }

    public Army(String armyName, int numberOfDivisions, boolean isActive, String primaryWeapon) 
	{
        this(armyName, numberOfDivisions, isActive);
        this.primaryWeapon = primaryWeapon;
    }

    public Army(String armyName, int numberOfDivisions, boolean isActive, String primaryWeapon, String headquartersLocation)
	{
        this(armyName, numberOfDivisions, isActive, primaryWeapon);
        this.headquartersLocation = headquartersLocation;
    }

    public Army(String armyName, int numberOfDivisions, boolean isActive, String primaryWeapon, String headquartersLocation, int totalPersonnel)
	{
        this(armyName, numberOfDivisions, isActive, primaryWeapon, headquartersLocation);
        this.totalPersonnel = totalPersonnel;
    }

    public Army(String armyName, int numberOfDivisions, boolean isActive, String primaryWeapon, String headquartersLocation, int totalPersonnel, double annualBudget)
	{
        this(armyName, numberOfDivisions, isActive, primaryWeapon, headquartersLocation, totalPersonnel);
        this.annualBudget = annualBudget;
    }

    public Army(String armyName, int numberOfDivisions, boolean isActive, String primaryWeapon, String headquartersLocation, int totalPersonnel, double annualBudget, boolean hasNuclearCapability)
	{
        this(armyName, numberOfDivisions, isActive, primaryWeapon, headquartersLocation, totalPersonnel, annualBudget);
        this.hasNuclearCapability = hasNuclearCapability;
    }

    public Army(String armyName, int numberOfDivisions, boolean isActive, String primaryWeapon, String headquartersLocation, int totalPersonnel, double annualBudget, boolean hasNuclearCapability, String dominantMilitaryBranch)
	{
        this(armyName, numberOfDivisions, isActive, primaryWeapon, headquartersLocation, totalPersonnel, annualBudget, hasNuclearCapability);
        this.dominantMilitaryBranch = dominantMilitaryBranch;
    }

    public Army(String armyName, int numberOfDivisions, boolean isActive, String primaryWeapon, String headquartersLocation, int totalPersonnel, double annualBudget, boolean hasNuclearCapability, String dominantMilitaryBranch, String officialLanguage) 
	{
        this(armyName, numberOfDivisions, isActive, primaryWeapon, headquartersLocation, totalPersonnel, annualBudget, hasNuclearCapability, dominantMilitaryBranch);
        this.officialLanguage = officialLanguage;
    }

    public void info() 
	{
        System.out.println("------Army Information-----");
        System.out.println("Army Name: " + this.armyName);
        System.out.println("Number of Divisions: " + this.numberOfDivisions);
        System.out.println("Active: " + this.isActive);
        System.out.println("Primary Weapon: " + this.primaryWeapon);
        System.out.println("Headquarters Location: " + this.headquartersLocation);
        System.out.println("Total Personnel: " + this.totalPersonnel);
        System.out.println("Annual Budget: $" + this.annualBudget);
        System.out.println("Has Nuclear Capability: " + this.hasNuclearCapability);
        System.out.println("Dominant Military Branch: " + this.dominantMilitaryBranch);
        System.out.println("Official Language: " + this.officialLanguage);
    }
}

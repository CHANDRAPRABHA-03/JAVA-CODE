 class Satellite {
    String satelliteName;
    String satelliteType;
    double weight; 
    int launchYear;
    int numberOfSolarPanels;
    int operationalYears;
    double orbitAltitude; 
    String launchDate;
    String launchVehicle;
    String missionType;
    String countryOfOrigin;
    boolean isActive;
    String orbitType;
    double dataTransferRate; 
    String communicationType;
    boolean hasRemoteSensing;
    String manufacturer;
    String materialUsed;
    String satellitePurpose;
    String missionPartner;

    
    public Satellite(String satelliteName, String satelliteType, double weight, int launchYear, int numberOfSolarPanels,int operationalYears, double orbitAltitude, String launchDate, String launchVehicle, String missionType,String countryOfOrigin, boolean isActive, String orbitType, double dataTransferRate, String communicationType,boolean hasRemoteSensing, String manufacturer, String materialUsed, String satellitePurpose, String missionPartner) 
	{
        this.satelliteName = satelliteName;
        this.satelliteType = satelliteType;
        this.weight = weight;
        this.launchYear = launchYear;
        this.numberOfSolarPanels = numberOfSolarPanels;
        this.operationalYears = operationalYears;
        this.orbitAltitude = orbitAltitude;
        this.launchDate = launchDate;
        this.launchVehicle = launchVehicle;
        this.missionType = missionType;
        this.countryOfOrigin = countryOfOrigin;
        this.isActive = isActive;
        this.orbitType = orbitType;
        this.dataTransferRate = dataTransferRate;
        this.communicationType = communicationType;
        this.hasRemoteSensing = hasRemoteSensing;
        this.manufacturer = manufacturer;
        this.materialUsed = materialUsed;
        this.satellitePurpose = satellitePurpose;
        this.missionPartner = missionPartner;
		
    }
}

class Tablet {
    public void dissolve(double waterAmount, double temperature) {
        System.out.println("Tablet dissolving in " + waterAmount + " liters of water at " + temperature + "°C.");
    }

    public void cure(String condition) {
        System.out.println("Curing " + condition + " with tablet.");
    }

    public void killThePain(int severity) {
        System.out.println("Pain severity: " + severity + ". Tablet is killing the pain.");
    }

    public void react(String sideEffect) {
        System.out.println("Reaction to tablet: " + sideEffect + ".");
    }
}


class PatientRunner {
    public static void main(String[] args) {
        Patient person = new Patient();

        System.out.println("Patient Name: " + person.name);
        System.out.println("Patient Age: " + person.age);
        System.out.println("Patient Disease: " + person.disease);
        System.out.println("Is Patient Admitted? " + person.isAdmitted);

        person.name = "Chandu";
        person.age = 21;
        person.disease = "Cancer";
        person.isAdmitted = true;

        System.out.println("Updated Patient Name: " + person.name);
        System.out.println("Updated Patient Age: " + person.age);
        System.out.println("Updated Patient Disease: " + person.disease);
        System.out.println("Updated Is Patient Admitted? " + person.isAdmitted);
    }
}

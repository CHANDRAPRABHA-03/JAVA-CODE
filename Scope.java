class Scope {
    // Global variable (Accessible throughout the class)
    static int globalVar = 50;

    public static void main(String[] args) {
        int localVar = 10; 

        if (localVar > 5) {
            int blockVar = 20; 
            System.out.println("Inside if block, blockVar: " + blockVar);
        }

        // Uncommenting the below line will cause an error because blockVar is out of scope
        // System.out.println(blockVar);

        System.out.println("Global variable: " + globalVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void anotherMethod() {
       
        System.out.println("Global variable from anotherMethod: " + globalVar);

        // Uncommenting the below line will cause an error because localVar is not accessible here
        // System.out.println(localVar);
    }
}

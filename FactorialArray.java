public class FactorialArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        for (int num : arr) {
            System.out.println("Factorial of " + num + ": " + factorial(num));
        }
    }
    
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

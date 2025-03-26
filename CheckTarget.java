public class CheckTarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = false;
        
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println(target + " is in the array.");
        } else {
            System.out.println(target + " is not in the array.");
        }
    }
}

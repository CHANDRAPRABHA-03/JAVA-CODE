
class IfCondition {
    public static void main(String[] args) {
        int num = 10;
        if (num > 0) {
            System.out.println("Number is positive.");
        }
    }
}
class IfElseLoop {
    public static void main(String[] args) {
        int num = -5;
        if (num >= 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is negative.");
        }
    }
}
class WhileLoop {
    public static void main(String[] args) {
        int count = 5;
        while (count > 0) {
            System.out.println("Count: " + count);
            count--; // Decreasing the value of count
        }
    }
}
class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
class SwitchLoop {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend!");
                break;
        }
    }
}

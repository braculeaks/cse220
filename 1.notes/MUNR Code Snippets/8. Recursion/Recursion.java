public class Recursion {
    public static void methodA(int x) {
        System.out.println("Method A: " + x);
        x = methodB(x + 1);
        System.out.println("Method A: " + x);
    }

    public static int methodB(int x) {
        System.out.println("Method B: " + x);
        return x + 2;
    }

    public static void methodC(int x) {
        System.out.println("Method C: " + x);
        methodC(x + 1);
    }

    public static void methodD(int x) {
        if (x == 15) { // Base Case
            return;
        } else { // Recursive Case
            System.out.println("Method D: " + x);
            methodD(x + 1);
        }
    }

    public static void factorialIterative(int x) {
        int product = 1;
        for (int i = 1; i < x + 1; i++) {
            product = product * i;
        }
        System.out.println(product);
    }

    public static int factorial(int x) {
        if (x == 1) {
            return x;
        } else {
            return x * factorial(x - 1);
        }
    }

    public static int exponent(int x, int p) {
        if (p == 0) {
            return 1;
        } else {
            return x * exponent(x, p - 1);
        }
    }

    public static void main(String[] args) {
        // methodA(2);
        // methodC(2);
        methodD(2);
        // factorialIterative(5);
        // System.out.println(factorial(5));
        // System.out.println(exponent(5, 3));
    }
}
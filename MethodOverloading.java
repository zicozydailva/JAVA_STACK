public class MethodOverloading {
    public static void main(String[] args) {
        calculateSum(10, 20);
        calculateSub(10, 20);
        calculateMul(10, 20);
    }

    public static void calculateSum(int num1, int num2) {
        System.out.println("Sum is " + (num1 + num2));
    }

    public static void calculateSub(int num1, int num2) {
        System.out.println("Sub is " + (num1 - num2));
    }

    public static void calculateMul(int num1, int num2) {
        System.out.println("Multiplication is " + (num1 * num2));
    }
}

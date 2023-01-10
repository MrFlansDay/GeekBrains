public class Ex2 {

    public static void exception() {
        int d = 0;
        double[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        try {
            if (d == 0) throw new ArithmeticException("Division by zero");
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

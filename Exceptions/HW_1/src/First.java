public class First {

    public static int arithmetic(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
            return 0;
        }
    }

    public static int arrayIndexOut(int[] nums, int index) {
        try {
            return nums[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds");
            return 0;
        }
    }

    public static int numberFormatException(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
            return 0;
        }

    }

}

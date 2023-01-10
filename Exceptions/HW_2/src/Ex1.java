import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

    public static float scan() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Entered not a number");
            return scan();
        }

    }
}

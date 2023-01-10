import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Ex4 {

    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        try {
            String str = scanner.nextLine();
            if (Objects.equals(str, "")) throw new Exception("Empty string entered");
            return str;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return scan();
        }

    }
}

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    static void towerOfHanoi(int n, char from_rod, char to_rod, char inter_rod)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, inter_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, inter_rod, to_rod, from_rod);
    }

    static int[] insertionSort(int[] numArray) {
        for (int i = 1; i < numArray.length; i++) {
            int j = i - 1;
            int key = numArray[i];
            while (j >= 0 && numArray[j] > key) {
                numArray[j + 1] = numArray[j];
                j--;
            }
            numArray[j + 1] = key;
        }
        return numArray;
    }

    public static void main(String[] args) {
        System.out.print("Number of disks ");
        int n = new Scanner(System.in).nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');

        int[] arr = new int[] {5, 32, 2, 7, 1, 10, 14, 1, 53, 4, 84, 44};
        System.out.print(Arrays.toString(insertionSort(arr)));
    }
}

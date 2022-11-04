import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Написать программу вычисления n-ого треугольного числа.

        int T = new Scanner(System.in).nextInt();
        System.out.println(T * (T + 1) / 2);


//        Реализовать алгоритм пирамидальной сортировки (HeapSort)

        int[] arr = {12, 11, 13, 5, 6, 7};
        HeapSort ob = new HeapSort();
        ob.sort(arr);
        HeapSort.printArray(arr);
    }
}

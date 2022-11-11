public class Main {

    public static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int m = l;
        for (int i = l; i < r; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, m);
                m++;
            }
        }
        swap(arr, r, m);
        return m;
    }

    public static void quicksort(int[] arr, int l, int r){
        if (l >= r) return;
        int m = partition(arr, l, r);
        quicksort(arr, l, m - 1);
        quicksort(arr, m + 1, r);
    }

    public static void main(String[] args) {
        int[] arr = { 11, -12, -5, 2, 4, 9, 1, 4, 3 };
        quicksort(arr, 0, arr.length - 1);
        for (var i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2};

        System.out.println(First.arithmetic(2, 0));
        System.out.println(First.arrayIndexOut(nums, 3));
        System.out.println(First.numberFormatException("Str"));

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nums2 = {2, 4, 3, 12, 7, 8, 20, 1, 1};
//        int[] nums1 = {};
//        int[] nums2 = {};
        Second.arrayDifference(nums1, nums2);

        Third.arraysQuotient(nums1, nums2);

    }

}

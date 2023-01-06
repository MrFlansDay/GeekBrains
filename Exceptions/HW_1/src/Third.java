import java.util.Arrays;

public class Third {
    public static double[] arraysQuotient (int[] nums1, int[] nums2) {
        int index = 0;
        double[] nums = new double[nums1.length];
        try {
            generalException(nums1, nums2);
            for (int i = 0; i < nums1.length; i++) {
                exception(nums1, nums2, i);
                nums[i] = (double) nums1[i] / nums2[i];
            }
            System.out.println(Arrays.toString(nums));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return nums;
    }

    private static void generalException(int[] nums1, int[] nums2) throws Exception {
        if (nums1.length != nums2.length) throw new Exception("Array lengths are not equal");
    }

    private static void exception(int[] nums1, int[] nums2, int i) throws Exception {
        if (nums2[i] == 0) throw new Exception("Division by zero");
    }

}

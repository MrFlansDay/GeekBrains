import java.util.Arrays;

public class Second {
    public static int[] arrayDifference(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length];
        try {
            exception(nums1, nums2);
            for (int i = 0; i < nums1.length; i++) {
                nums[i] = nums1[i] - nums2[i];
            }
            System.out.println(Arrays.toString(nums));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return nums;
    }

    private static void exception(int[] nums1, int[] nums2) throws Exception {
        if (nums1.length != nums2.length) throw new Exception("Array lengths are not equal");
    }
}

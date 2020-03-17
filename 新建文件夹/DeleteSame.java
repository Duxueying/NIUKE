public class DeleteSame {
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 2, 2, 3, 5, 2};
        removeElement(arr, 2);
        System.out.println(removeElement(arr, 2));
    }
}

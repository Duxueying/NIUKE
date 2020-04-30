public class pivotIndex {
        public static int pivotIndex(int[] nums) {
            int sum = 0, leftSum = 0;
            for (int num : nums) sum += num;
            for (int i = 0; i < nums.length; i++) {
                if (sum - nums[i] == leftSum * 2) {
                    return i;
                } else {
                    leftSum += nums[i];
                }
            }
            return -1;
        }
    public static void main(String[] args) {
            int [] arr={2,3,4,6,1,2,4,6};
            System.out.println(pivotIndex(arr));
    }
}

import java.util.Arrays;
public class containsDuplicate {
        public static boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for(int i = 0; i < nums.length - 1; i++) {
                if(nums[i+1] == nums[i]) {
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {
      int [] arr={2,4,5,1,4};
      System.out.println(containsDuplicate(arr));
    }
}

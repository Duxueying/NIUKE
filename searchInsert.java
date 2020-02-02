public class searchInsert {
    public  static int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length;i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int [] arr={3,4,5,25,2,7,};
        System.out.println(searchInsert(arr,7));
    }
}

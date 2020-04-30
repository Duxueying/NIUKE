public class rotate {
    public static void rotate(int[] nums, int k) {
        int gcd = get(nums.length, k);
        for (int i = 0; i < gcd; i++) {
            int currIndex = i;
            int currValue = nums[currIndex];
            int nextValue;
            for (int j = 0; j < nums.length / gcd; j++) {
                int nextIndex = (currIndex + k) % nums.length;
                nextValue = nums[nextIndex];
                nums[nextIndex] = currValue;
                currValue = nextValue;
                currIndex = nextIndex;
            }
        }
    }

    private static int get(int a, int b) {
        if (b == 0) {
            return a;
        }
        return get(b, a % b);
    }

    public static void main(String[] args) {
        int [] arr={1,3,5,7,9,9};
        rotate(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}


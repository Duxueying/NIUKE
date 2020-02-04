public class sortArrayByParity {
        public static int[] sortArrayByParity(int[] A) {
            int len = A.length;
            int front = 0, end = len-1;//设置两个指针，一个指向头部，一个指向尾部
            while(front < end)
            {
                while(front < len && A[front]%2 == 0)   //从前往后找偶数
                    front++;
                while(end >= 0 &&  A[end]%2 == 1)   //从后往前找奇数
                    end--;
                if(front < end)
                {
                    int temp = A[front];    //将奇数往前挪，偶数往后挪
                    A[front] = A[end];
                    A[end] = temp;
                }
            }
            return A;
        }

    public static void main(String[] args) {
        int[] arr={2,2,3,4,5,6,7,4,4,1,0};
        sortArrayByParity(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

public class sortArrayByParity {
        public static int[] sortArrayByParity(int[] A) {
            int len = A.length;
            int front = 0, end = len-1;//��������ָ�룬һ��ָ��ͷ����һ��ָ��β��
            while(front < end)
            {
                while(front < len && A[front]%2 == 0)   //��ǰ������ż��
                    front++;
                while(end >= 0 &&  A[end]%2 == 1)   //�Ӻ���ǰ������
                    end--;
                if(front < end)
                {
                    int temp = A[front];    //��������ǰŲ��ż������Ų
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

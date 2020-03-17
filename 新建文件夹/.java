import java.util.Arrays;
public class arr_2 {
    public static int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int count=0;
        int result;
        for(int i=0;i<array.length;i++){
            if(array[i]==array[array.length/2])
                count++;
        }
        if(count>array.length/2)
            result=array[array.length/2];

        else
            result=0;
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,2,2,2,6};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
}
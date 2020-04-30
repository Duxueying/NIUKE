import java.util.Arrays;
public class pingfang {
    public static int[] sortedSquares(int[] A) {
            for(int i=0; i<A.length; i++)  A[i] *= A[i];
            Arrays.sort(A);
            return A;
        }
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        sortedSquares(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class Least{
    public static void least(int[] arr,int k){
        Arrays.sort(arr);
        if(k>arr.length){
            return;
        }
        for(int i=0;i<k;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        least(arr,k);

    }
}

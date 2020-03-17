import java.util.Scanner;
public class day11_23{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            if(n==0)
                break;
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=input.nextInt();
            }
            int m=input.nextInt();
            int sum=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==m){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}

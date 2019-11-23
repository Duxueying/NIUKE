import java.util.Scanner;
public class day_11_23{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        for(int i=0;i<T;i++){
            int n = input.nextInt();
            int k = input.nextInt();
            int len = 2*n;
            int[] arr = new int[len];
            for(int l=0;l<len;l++){
                arr[l] = input.nextInt();
            }
            int[] st = new int[len];
            for(int q=0;q<k;q++){
                int p=0;
                for(int j=0;j<n&&p<len;j++){
                    st[p++] = arr[j];
                    st[p++] = arr[j+n];
                }
                System.arraycopy(st,0,arr,0,len);
            }
            StringBuffer sb = new StringBuffer();
            for(int num:st){
                sb.append(num);
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
        }
    }
}

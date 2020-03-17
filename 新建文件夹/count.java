import java.util.Scanner;
//输入n,输出n以下的数字包含1的个数，比如5 输出1，11输出4
public class count {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
         int num=count(n);
        System.out.println(num);
    }
    public static int count(int n){
        int count=0;
        for(int i=n;i>0;i--)
        {
           String s= String.valueOf(i);
           for(int j=0;j<s.length();j++){
               if(s.charAt(j)=='1'){
                   count++;
               }
           }
        }
        return count;
    }
}
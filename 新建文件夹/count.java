import java.util.Scanner;
//����n,���n���µ����ְ���1�ĸ���������5 ���1��11���4
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
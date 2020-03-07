import java.util.*;
import java.util.Arrays;
public class jioujiaoyan{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            char[] arr=str.toCharArray();
            char[] binary=new char[8];
            //for(int i=0;i<8;i++)
            //    binary[i]='0';
            for(int i=0;i<arr.length;i++){
                String s=Integer.toBinaryString((byte)arr[i]);
                char[] s1=s.toCharArray();
                int num=0;
                for(int j=0;j<s1.length;j++){
                    //        binary[8-1-j]=s1[j];
                    if(s1[j]=='1')
                        num++;
                }
                if(num%2==0) System.out.print(1);
                else System.out.print(0);
                if(s1.length!=7) System.out.print(0);
                for(int j=0;j<s1.length;j++)
                    System.out.print(s1[j]);
                System.out.println();
                //System.out.print(s);
            }
        }
    }
}
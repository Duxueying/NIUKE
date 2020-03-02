import java.util.Scanner;
public class Sum {
    public static int get(int n){
        String str=String.valueOf(n);//将数字转换为字符串
        int sum=0;
        for(int i=0;i<str.length();i++){//遍历各个位相加
            sum+=(str.charAt(i)-'0');//转到对应的ASCII码
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            System.out.print(get(n)+" ");
            System.out.println(get(n*n));
        }
    }
}

import java.util.Scanner;
public class Sum {
    public static int get(int n){
        String str=String.valueOf(n);//������ת��Ϊ�ַ���
        int sum=0;
        for(int i=0;i<str.length();i++){//��������λ���
            sum+=(str.charAt(i)-'0');//ת����Ӧ��ASCII��
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

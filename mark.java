import java.util.Scanner;
public class mark{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while(input.hasNext()){
            int n = input.nextInt();
            int[] a = new int[n];
            double[] b = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int grade = input.nextInt();
                double mark = 0;
                if(grade >= 90 && grade <= 100){
                    mark= 4.0;
                }
                if(grade>= 85 && grade <= 89){
                    mark= 3.7;
                }
                if(grade >= 82 && grade <= 84){
                    mark = 3.3;
                }
                if(grade>= 78 && grade<= 81){
                    mark= 3.0;
                }
                if(grade >= 75 && grade <= 77){
                    mark = 2.7;
                }
                if(grade>= 72 && grade <= 74){
                    mark = 2.3;
                }
                if(grade >= 68 && grade <= 71){
                    mark = 2.0;
                }
                if(grade>= 64 && grade<= 67){
                    mark = 1.5;
                }
                if(grade >= 60 && grade <= 63){
                    mark = 1.0;
                }
                b[i] = mark;
            }
            double sum = 0;
            double xf = 0;
            for (int j = 0; j < n; j++) {
                sum += a[j] * b[j];
                xf += a[j];

            }
            System.out.println(String.format("%.2f", sum/xf));
        }
    }
}
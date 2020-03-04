import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class ShouXingShu {

    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        String line = null;
        while ((line = input.nextLine()) != null) {
            int num = Integer.parseInt(line);
            if(num<10)
                printResult(num,10);
            else {
                printResult(num,100);
            }
        }
    }

    private static void printResult(int num, int i) {
        if(num*num % i ==num)
            System.out.println("Yes!");
        else
            System.out.println("No!");
    }
}
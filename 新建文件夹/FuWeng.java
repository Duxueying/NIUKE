import java.util.*;

public class FuWeng{
    public static void main(String[] args){
        int sum = 1;
        int dayCount = 1;
        for(int i = 1;i < 30;i++){
            dayCount *= 2;
            sum += dayCount;
        }
        System.out.print(10*30 + " ");

        System.out.println(sum);
    }
}

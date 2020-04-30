import java.util.Scanner;
public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            int max=0;
            int count=0;
            int last=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                    count++;
                    if(max<count){
                        max=count;
                        last=i;
                    }
                }
                else
                    {
                    count = 0;
                }
            }
            System.out.println(str.substring(last-max+1,last+1));
        }
    }
}

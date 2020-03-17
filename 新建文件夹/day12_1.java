import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class day12_1 {
    public static String get(String str){
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        String s=set.toString();
        return s;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        String s=get(str);
        System.out.println(s);
    }
}

import java.util.*;
public class day11_30 {
    private static void get(String str1,String str2){
        List<Character> list1=CreateList(str1);
        List<Character> list2=CreateList(str2); //把两个字符串放入list里
        List<Character> result=new ArrayList<>();
        for(int i=0;i<list2.size();i++){
            if(list1.contains(list2.get(i))){//如果list1包含list2;
                list1.remove(list2.get(i));
                result.add(list2.get(i));//取出来放到结果list里
            }
        }
        if(list2.size()==result.size()){//相等说明都符合
            System.out.println("Yes"+" "+list1.size());
        }
        else
        {
            int sum=list2.size()-result.size();//差值代表不符合的那些数
            System.out.println("No"+" "+sum);
        }
    }

    private static List<Character> CreateList(String string){
        List<Character> list=new ArrayList<>();
        for(int i=0;i<string.length();i++){
            list.add(string.charAt(i));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()) {
            String str1 = input.nextLine();
            String str2 = input.nextLine();
            get(str1, str2);
        }
    }
}

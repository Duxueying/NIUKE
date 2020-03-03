import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
public class Find {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<array.length;i++){
            if(set.contains(array[i])){
                set.remove(array[i]);
            }
            else{
                set.add(array[i]);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(set);
        num1[0]=list.get(0);
        num2[0]=list.get(1);
    }
}
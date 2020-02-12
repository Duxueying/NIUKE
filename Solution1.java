import java.util.ArrayList;
import java.util.Arrays;
public class Solution1 {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> List=new ArrayList<>();
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            List.add(input[i]);
        }
        //return List;
        for(int i=0;i<List.size();i++){
            System.out.println(List.get(i));
        }
        return List;
    }
    public static void main(String[] args) {
      int[] arr={4,5,1,6,2,7,3,8};
        GetLeastNumbers_Solution(arr,4);

    }
}

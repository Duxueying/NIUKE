public class CutRope {
    public static int cutRope(int target) {
        if(target<2){  //����Ϊ1ʱ��û����
            return 0;
        }
        if(target==2||target==3){//Ϊ2����3ʱ������һ�£�����target-1
            return target-1;
        }
        int num=target/3;
        if(target%3==1){
            num=num-1;
        }
        int numTwo=(target-3*num)/2;
        return (int)Math.pow(3,num)*(int)Math.pow(2,numTwo);
    }

    public static void main(String[] args) {
        System.out.println(cutRope(8));
    }
}

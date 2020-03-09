public class CutRope {
    public static int cutRope(int target) {
        if(target<2){  //长度为1时，没法剪
            return 0;
        }
        if(target==2||target==3){//为2或者3时，最多剪一下，返回target-1
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

/**
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
（先后次序不同算不同的结果）。
*/

public class JumpFloor {
	
	public static void main(String[] args){
		int target=20;
		System.out.println(JumpFloor(target));
	}
	
	
	
    public  static int JumpFloor(int target) {
         int n=target;
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }else{
            return JumpFloor(n-1)+JumpFloor(n-2);
        }
    }
}
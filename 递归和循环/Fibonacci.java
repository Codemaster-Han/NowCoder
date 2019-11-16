/**
输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39
*/

public class Fibonacci {
	public static void main(String[] args){
		int n=5;
		System.out.println(Fibonacci(n));
	}
	
    public static int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n<=2){
            return 1;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
}